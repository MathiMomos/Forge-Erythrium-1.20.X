package net.mathimomos.erythrium.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TOMATHI = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.6F)
            .build();
    public static final FoodProperties GLITTERMEAT = new FoodProperties.Builder()
            .nutrition(10)
            .saturationMod(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 1F)
            .alwaysEat()
            .meat()
            .build();
    public static final FoodProperties OINKBALLS = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 2), 0.75F)
            .meat()
            .build();
}
