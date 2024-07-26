package net.mathimomos.erythrium.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class OxidizingAxeItem extends AxeItem {
    private final Item nextStateItem;

    public OxidizingAxeItem(Tier tier, float attackDamageModifier, float attackSpeedModifier, Properties properties, Item nextStateItem) {
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
                    ItemStack oxidizedTool = new ItemStack(nextStateItem);
                    oxidizedTool.setDamageValue(pStack.getDamageValue());
                    if (pStack.hasCustomHoverName()){
                        oxidizedTool.setHoverName(pStack.getHoverName());
                    }
                    player.getInventory().setItem(pSlotId, oxidizedTool);
                }
            } else {
                pStack.getOrCreateTag().putLong("oxidation_time", pLevel.getGameTime() + 10*60*20);
            }
        }
    }

}