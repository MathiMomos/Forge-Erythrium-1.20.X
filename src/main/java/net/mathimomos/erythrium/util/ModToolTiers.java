package net.mathimomos.erythrium.util;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ERYTHRIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3,1836,9,0.5F,12,
                    ModTags.Blocks.NEEDS_ERYTHRIUM_TOOL, () -> Ingredient.of(ModItems.ERYTHRIUM.get())),
            new ResourceLocation(Erythrium.MOD_ID, "erythrium"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE)
    );
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,192, 6, 0.5F, 0,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Erythrium.MOD_ID, "copper"), List.of(Tiers.STONE), List.of(Tiers.IRON)
    );
    public static final Tier EXPOSED_COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,192, 5, 0.5F, 0,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Erythrium.MOD_ID, "exposed_copper"), List.of(Tiers.STONE), List.of(Tiers.IRON)
    );
    public static final Tier WEATHERED_COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,192, 4, 0.5F, 0,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Erythrium.MOD_ID, "weathered_copper"), List.of(Tiers.STONE), List.of(Tiers.IRON)
    );
    public static final Tier OXIDIZED_COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,192, 3, 0F, 0,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Erythrium.MOD_ID, "oxidized_copper"), List.of(Tiers.STONE), List.of(Tiers.IRON)
    );

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 905, 7, 0.5F, 0,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(Erythrium.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND)
    );
    public static final Tier ROSE_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(2, 905, 7, 0.5F, 0,
                    ModTags.Blocks.NEEDS_ROSE_GOLD_TOOL, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())),
            new ResourceLocation(Erythrium.MOD_ID, "rose_gold"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND)
    );


}
