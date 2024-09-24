package net.mathimomos.erythrium.datagen.loot;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.ModItems;
import net.mathimomos.erythrium.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Erythrium.MOD_ID);
    }

    @Override
    protected void start() {
        add("cherries_from_cherry_leaves", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CHERRY_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()}, ModItems.CHERRIES.get()));

        add("tuna_from_cactus", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CACTUS).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()}, ModItems.TUNA.get()));

        add("squid_tentacle_from_squid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/squid")).build()}, ModItems.SQUID_TENTACLE.get()));

        add("glow_squid_tentacle_from_glow_squid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/glow_squid")).build() }, ModItems.GLOW_SQUID_TENTACLE.get()));

        add("frog_leg_from_frog", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build() }, ModItems.FROG_LEG.get()));

        add("phantom_eye_from_phantom", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/phantom")).build() }, ModItems.PHANTOM_EYE.get()));

        add("bat_wing_from_bat", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/bat")).build() }, ModItems.BAT_WING.get()));

    }
}
