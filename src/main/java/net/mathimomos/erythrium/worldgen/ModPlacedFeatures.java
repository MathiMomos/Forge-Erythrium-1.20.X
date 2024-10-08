package net.mathimomos.erythrium.worldgen;

import net.mathimomos.erythrium.Erythrium;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ERYTHRIUM_ORE_PLACED_KEY = registerKey("erythrium_ore_placed");
    public static final ResourceKey<PlacedFeature> IRON_NUGGET_ORE_PLACED_KEY = registerKey("iron_nugget_ore_placed");
    public static final ResourceKey<PlacedFeature> FLINT_BLOCK_PLACED_KEY = registerKey("flint_block_placed");
    public static final ResourceKey<PlacedFeature> IGNITE_ORE_PLACED_KEY = registerKey("ignite_ore_placed");
    public static final ResourceKey<PlacedFeature> ROSE_QUARTZ_ORE_PLACED_KEY = registerKey("rose_quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> SCORIA_PLACED_KEY = registerKey("scoria_placed");
    public static final ResourceKey<PlacedFeature> GABBRO_PLACED_KEY = registerKey("gabbro_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_PLACED_KEY = registerKey("rhyolite_placed");
    public static final ResourceKey<PlacedFeature> SOULRRACK_PLACED_KEY = registerKey("soulrrack_placed");
    public static final ResourceKey<PlacedFeature> SOUL_MAGMA_BLOCK_PLACED_KEY = registerKey("soul_magma_block_placed");


    ///Cuantas veces se genera por chunk
    public static void bootstrap(BootstapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ERYTHRIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ERYTHRIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(4))));

        register(context, IRON_NUGGET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRON_NUGGET_ORE_KEY),
                ModOrePlacement.commonOrePlacement(256,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(256))));

        register(context, FLINT_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_FLINT_BLOCK_KEY),
                ModOrePlacement.commonOrePlacement(32,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));

        register(context, IGNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IGNITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        register(context, ROSE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(24,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96))));

        register(context, SCORIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SCORIA_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31), VerticalAnchor.absolute(127))));

        register(context, GABBRO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GABBRO_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31), VerticalAnchor.absolute(127))));

        register(context, RHYOLITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RHYOLITE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31), VerticalAnchor.absolute(127))));

        register(context, SOULRRACK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SOULRRACK_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31), VerticalAnchor.absolute(127))));

        register(context, SOUL_MAGMA_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SOUL_MAGMA_BLOCK_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(27), VerticalAnchor.absolute(127))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Erythrium.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
