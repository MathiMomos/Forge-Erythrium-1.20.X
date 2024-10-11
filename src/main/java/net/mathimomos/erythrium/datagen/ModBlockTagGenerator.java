package net.mathimomos.erythrium.datagen;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.mathimomos.erythrium.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Erythrium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.FLINT_BLOCK.get(),
                        ModBlocks.IRON_NUGGET_ORE.get()
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IGNITE_ORE.get(),
                        ModBlocks.IGNITE_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.DIAMOND_CUTTER.get(),
                        ModBlocks.METALURGIC_STATION.get()
                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ERYTHRIUM_BLOCK.get(),
                    ModBlocks.ERYTHRIUM_TILES_BLOCK.get(),
                    ModBlocks.REDDISH_DEEPSLATE_BLOCK.get(),
                    ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK.get(),
                    ModBlocks.ERYTHRIUM_ORE.get(),
                    ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(),
                    ModBlocks.COMPACTED_ERYTHRIUM.get(),
                    ModBlocks.GLOWING_OBSIDIAN.get()
                );

        this.tag(ModTags.Blocks.NEEDS_ERYTHRIUM_TOOL);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.NETHER_ROSE_QUARTZ_ORE.get(),
                        ModBlocks.ROSE_QUARTZ_BLOCK.get(),
                        ModBlocks.ROSE_QUARTZ_STAIRS.get(),
                        ModBlocks.ROSE_QUARTZ_SLAB.get(),
                        ModBlocks.CHISELED_ROSE_QUARTZ_BLOCK.get(),
                        ModBlocks.ROSE_QUARTZ_BRICKS.get(),
                        ModBlocks.ROSE_QUARTZ_PILLAR.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB.get()
                );


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ERYTHRIUM_BLOCK.get(),
                        ModBlocks.ERYTHRIUM_TILES_BLOCK.get(),
                        ModBlocks.REDDISH_DEEPSLATE_BLOCK.get(),
                        ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK.get(),
                        ModBlocks.ERYTHRIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get(),
                        ModBlocks.COMPACTED_ERYTHRIUM.get(),
                        ModBlocks.IGNITE_ORE.get(),
                        ModBlocks.IGNITE_BLOCK.get(),
                        ModBlocks.FLINT_BLOCK.get(),
                        ModBlocks.NETHER_ROSE_QUARTZ_ORE.get(),
                        ModBlocks.ROSE_QUARTZ_BLOCK.get(),
                        ModBlocks.ROSE_QUARTZ_STAIRS.get(),
                        ModBlocks.ROSE_QUARTZ_SLAB.get(),
                        ModBlocks.CHISELED_ROSE_QUARTZ_BLOCK.get(),
                        ModBlocks.ROSE_QUARTZ_BRICKS.get(),
                        ModBlocks.ROSE_QUARTZ_PILLAR.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS.get(),
                        ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB.get(),
                        ModBlocks.COPPER_CHAGER.get(),
                        ModBlocks.IRON_NUGGET_ORE.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.DIAMOND_CUTTER.get(),
                        ModBlocks.METALURGIC_STATION.get(),
                        ModBlocks.SCORIA.get(),
                        ModBlocks.GABBRO.get(),
                        ModBlocks.RHYOLITE.get(),
                        ModBlocks.SCORIA_STAIRS.get(),
                        ModBlocks.GABBRO_STAIRS.get(),
                        ModBlocks.RHYOLITE_STAIRS.get(),
                        ModBlocks.SCORIA_SLAB.get(),
                        ModBlocks.GABBRO_SLAB.get(),
                        ModBlocks.RHYOLITE_SLAB.get(),
                        ModBlocks.SCORIA_WALL.get(),
                        ModBlocks.GABBRO_WALL.get(),
                        ModBlocks.RHYOLITE_WALL.get(),
                        ModBlocks.SCORIA.get(),
                        ModBlocks.GABBRO.get(),
                        ModBlocks.RHYOLITE.get(),
                        ModBlocks.POLISHED_SCORIA.get(),
                        ModBlocks.POLISHED_GABBRO.get(),
                        ModBlocks.POLISHED_RHYOLITE.get(),
                        ModBlocks.POLISHED_SCORIA_STAIRS.get(),
                        ModBlocks.POLISHED_GABBRO_STAIRS.get(),
                        ModBlocks.POLISHED_RHYOLITE_STAIRS.get(),
                        ModBlocks.POLISHED_SCORIA_SLAB.get(),
                        ModBlocks.POLISHED_GABBRO_SLAB.get(),
                        ModBlocks.POLISHED_RHYOLITE_SLAB.get(),
                        ModBlocks.SOULRRACK.get(),
                        ModBlocks.SOUL_MAGMA_BLOCK.get(),
                        ModBlocks.GLOWING_OBSIDIAN.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.TOMATHI_BLOCK.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.RHYOLITE_WALL.get(),
                        ModBlocks.SCORIA_WALL.get(),
                        ModBlocks.GABBRO_WALL.get()
                );

        this.tag(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(ModBlocks.SOULRRACK.get(), ModBlocks.SOUL_MAGMA_BLOCK.get());
        this.tag(BlockTags.SOUL_SPEED_BLOCKS).add(ModBlocks.SOULRRACK.get(), ModBlocks.SOUL_MAGMA_BLOCK.get());
        this.tag(BlockTags.WITHER_SUMMON_BASE_BLOCKS).add(ModBlocks.SOULRRACK.get());

        this.tag(BlockTags.INFINIBURN_OVERWORLD).add(ModBlocks.SOUL_MAGMA_BLOCK.get());
        this.tag(BlockTags.INFINIBURN_NETHER).add(ModBlocks.SOUL_MAGMA_BLOCK.get());
        this.tag(BlockTags.INFINIBURN_END).add(ModBlocks.SOUL_MAGMA_BLOCK.get());

    }
}
