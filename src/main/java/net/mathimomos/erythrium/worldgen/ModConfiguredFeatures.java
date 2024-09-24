package net.mathimomos.erythrium.worldgen;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ERYTHRIUM_ORE_KEY = registerKey("erythrium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRON_NUGGET_ORE_KEY = registerKey("iron_nugget_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLINT_BLOCK_KEY = registerKey("flint_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IGNITE_ORE_KEY = registerKey("ignite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ROSE_QUARTZ_ORE_KEY = registerKey("rose_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SCORIA_KEY = registerKey("scoria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GABBRO_KEY = registerKey("gabbro");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RHYOLITE_KEY = registerKey("rhyolite");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest quartzOreReplaceables = new BlockMatchTest(Blocks.NETHER_QUARTZ_ORE);
        RuleTest ironOreReplaceables = new BlockMatchTest(Blocks.IRON_ORE);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest basaltReplaceables = new BlockMatchTest(Blocks.BASALT);

        List<OreConfiguration.TargetBlockState> overworldErythriumOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.ERYTHRIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get().defaultBlockState())
                );

        List<OreConfiguration.TargetBlockState> rhyoliteRocks = List.of(OreConfiguration.target(netherrackReplaceables,
                ModBlocks.RHYOLITE.get().defaultBlockState())
                );

        List<OreConfiguration.TargetBlockState> gabbroRocks = List.of(OreConfiguration.target(netherrackReplaceables,
                        ModBlocks.GABBRO.get().defaultBlockState()),
                OreConfiguration.target(basaltReplaceables, ModBlocks.GABBRO.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> scoriaRocks = List.of(OreConfiguration.target(netherrackReplaceables,
                        ModBlocks.SCORIA.get().defaultBlockState()),
                OreConfiguration.target(gravelReplaceables, ModBlocks.SCORIA.get().defaultBlockState())
        );
        ///tamano de los blobs
        register(context, OVERWORLD_ERYTHRIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldErythriumOres, 4));
        register(context, OVERWORLD_FLINT_BLOCK_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables, ModBlocks.FLINT_BLOCK.get().defaultBlockState(), 32));
        register(context, NETHER_SCORIA_KEY, Feature.ORE, new OreConfiguration(scoriaRocks, 16));
        register(context, NETHER_GABBRO_KEY, Feature.ORE, new OreConfiguration(gabbroRocks, 16));
        register(context, NETHER_RHYOLITE_KEY, Feature.ORE, new OreConfiguration(rhyoliteRocks, 16));
        register(context, NETHER_IGNITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.IGNITE_ORE.get().defaultBlockState(), 12));
        register(context, NETHER_ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(quartzOreReplaceables, ModBlocks.NETHER_ROSE_QUARTZ_ORE.get().defaultBlockState(), 24));
        register(context, OVERWORLD_IRON_NUGGET_ORE_KEY, Feature.ORE, new OreConfiguration(ironOreReplaceables, ModBlocks.IRON_NUGGET_ORE.get().defaultBlockState(), 64));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Erythrium.MOD_ID, name));
    }
}
