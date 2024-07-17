package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    ERYTHRIUM("erythrium", 25, new int[]{3, 8, 6, 3}, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0f, () -> Ingredient.of(ModItems.ERYTHRIUM.get())),

    COPPER("copper", 25, new int[]{2, 5, 4, 1}, 0,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    EXPOSED_COPPER("exposed_copper", 25, new int[]{2, 4, 3, 1}, 0,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->Ingredient.of(Items.COPPER_INGOT)),
    WEATHERED_COPPER("weathered_copper", 25, new int[]{1, 4, 2, 1}, 0,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->Ingredient.of(Items.COPPER_INGOT)),
    OXIDIZED_COPPER("oxidized_copper", 25, new int[]{1, 3, 2, 1}, 0,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () ->Ingredient.of(Items.COPPER_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return  Erythrium.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

