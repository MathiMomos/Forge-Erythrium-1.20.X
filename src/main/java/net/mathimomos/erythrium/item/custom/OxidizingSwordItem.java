package net.mathimomos.erythrium.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class OxidizingSwordItem extends SwordItem {
    private final Item nextStateItem;

    public OxidizingSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties, Item nextStateItem) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
        this.nextStateItem = nextStateItem;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (!pLevel.isClientSide && pEntity instanceof Player player) {
            if (pStack.getTag() != null && pStack.getTag().contains("oxidation_time")) {
                long oxidationTime = pStack.getTag().getLong("oxidation_time");
                if (oxidationTime <= pLevel.getGameTime()) {
                    ItemStack oxidizedSword = new ItemStack(nextStateItem);
                    oxidizedSword.setDamageValue(pStack.getDamageValue());
                    if (pStack.hasCustomHoverName()){
                        oxidizedSword.setHoverName(pStack.getHoverName());
                    }
                    player.getInventory().setItem(pSlotId, oxidizedSword);
                }
            } else {
                pStack.getOrCreateTag().putLong("oxidation_time", pLevel.getGameTime() + 20*10);
            }
        }
    }

}