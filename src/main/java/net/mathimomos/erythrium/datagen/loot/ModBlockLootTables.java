package net.mathimomos.erythrium.datagen.loot;

import net.mathimomos.erythrium.block.ModBlocks;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ERYTHRIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ERYTHRIUM_TILES_BLOCK.get());
        this.dropSelf(ModBlocks.REDDISH_DEEPSLATE_BLOCK.get());
        this.dropSelf(ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK.get());

        this.add(ModBlocks.ERYTHRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ERYTHRIUM_ORE.get(), ModItems.ROUGH_ERYTHRIUM.get()));
        this.add(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(), ModItems.ROUGH_ERYTHRIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
