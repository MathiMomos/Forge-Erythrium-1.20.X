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
            new ForgeTier(1,528, 9, 0.5F, 7,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Erythrium.MOD_ID, "erythrium"), List.of(Tiers.STONE), List.of(Tiers.IRON)
    );
}
