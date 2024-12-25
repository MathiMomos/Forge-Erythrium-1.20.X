package net.mathimomos.erythrium.datagen.loot;

import net.mathimomos.erythrium.block.ModBlocks;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ERYTHRIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHISELED_ERYTHRIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ERYTHRIUM_TILES_BLOCK.get());
        this.dropSelf(ModBlocks.REDDISH_DEEPSLATE_BLOCK.get());
        this.dropSelf(ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK.get());

        this.add(ModBlocks.ERYTHRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ERYTHRIUM_ORE.get(), ModItems.ROUGH_ERYTHRIUM.get()));
        this.add(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(), ModItems.ROUGH_ERYTHRIUM.get()));
        this.add(ModBlocks.COMPACTED_ERYTHRIUM.get(),
                block -> createMoreThanOneOreDrops(ModBlocks.COMPACTED_ERYTHRIUM.get(), ModItems.ERYTHRIUM.get(),
                        2F, 4F));

        this.add(ModBlocks.IGNITE_ORE.get(),
                block -> createOreDrop(ModBlocks.IGNITE_ORE.get(), ModItems.IGNITE.get()));
        this.dropSelf(ModBlocks.IGNITE_BLOCK.get());

        this.add(ModBlocks.FLINT_BLOCK.get(),
                block -> createMoreThanOneOreDrops(ModBlocks.FLINT_BLOCK.get(), Items.FLINT,
                        3F, 4F));

        this.add(ModBlocks.NETHER_ROSE_QUARTZ_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_ROSE_QUARTZ_ORE.get(), ModItems.NETHER_ROSE_QUARTZ.get()));
        this.dropSelf(ModBlocks.ROSE_QUARTZ_BLOCK.get());
        this.add(ModBlocks.ROSE_QUARTZ_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ROSE_QUARTZ_SLAB.get()));
        this.dropSelf(ModBlocks.ROSE_QUARTZ_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_ROSE_QUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_BRICKS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_PILLAR.get());

        this.dropSelf(ModBlocks.SMOOTH_ROSE_QUARTZ.get());
        this.add(ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB.get()));
        this.dropSelf(ModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS.get());

        this.dropSelf(ModBlocks.TOMATHI_BLOCK.get());

        this.dropSelf(ModBlocks.COPPER_CHAGER.get());

        this.dropSelf(ModBlocks.DIAMOND_CUTTER.get());
        this.dropSelf(ModBlocks.METALURGIC_STATION.get());

        this.add(ModBlocks.IRON_NUGGET_ORE.get(),
                block -> createMoreThanOneOreDrops(ModBlocks.IRON_NUGGET_ORE.get(), ModItems.RAW_IRON_NUGGET.get(),
                        1F, 4F));

        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());

        this.dropSelf(ModBlocks.RHYOLITE.get());
        this.dropSelf(ModBlocks.SCORIA.get());
        this.dropSelf(ModBlocks.GABBRO.get());

        this.dropSelf(ModBlocks.RHYOLITE_STAIRS.get());
        this.dropSelf(ModBlocks.SCORIA_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_STAIRS.get());

        this.add(ModBlocks.RHYOLITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RHYOLITE_SLAB.get()));
        this.add(ModBlocks.SCORIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SCORIA_SLAB.get()));
        this.add(ModBlocks.GABBRO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_SLAB.get()));

        this.dropSelf(ModBlocks.RHYOLITE_WALL.get());
        this.dropSelf(ModBlocks.SCORIA_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_WALL.get());

        this.dropSelf(ModBlocks.POLISHED_RHYOLITE.get());
        this.dropSelf(ModBlocks.POLISHED_SCORIA.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO.get());

        this.dropSelf(ModBlocks.POLISHED_RHYOLITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SCORIA_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO_STAIRS.get());

        this.add(ModBlocks.POLISHED_RHYOLITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_RHYOLITE_SLAB.get()));
        this.add(ModBlocks.POLISHED_SCORIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_SCORIA_SLAB.get()));
        this.add(ModBlocks.POLISHED_GABBRO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_GABBRO_SLAB.get()));

        this.dropSelf(ModBlocks.SOUL_SANDSTONE.get());
        this.dropSelf(ModBlocks.SOUL_MAGMA_BLOCK.get());
        this.dropSelf(ModBlocks.GLOWING_OBSIDIAN.get());
        this.dropSelf(ModBlocks.SOULBLOOM_ROOTS.get());
    }

    protected LootTable.Builder createMoreThanOneOreDrops(Block pBlock, Item pItem, float min, float max) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(pItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
