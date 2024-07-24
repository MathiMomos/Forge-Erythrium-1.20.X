package net.mathimomos.erythrium.item.custom;

import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class OxidizingSwordItem extends SwordItem {
    private static final int TIMER_DURATION = 1200;
    public OxidizingSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
    ///Se actualiza en cada tick y se bugea la animacion, cuando se saca del creativo se oxida instantaneamente, arreglar esto urgente
    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if(!pLevel.isClientSide){
            CompoundTag nbtData = pStack.getOrCreateTag();
            int timer = nbtData.getInt("oxidizing_timer");
            if (timer <= 0){
                ItemStack nextStateItem = new ItemStack(ModItems.EXPOSED_COPPER_SWORD.get());
                nextStateItem.setDamageValue(pStack.getDamageValue());
                if (pStack.hasCustomHoverName()){
                    nextStateItem.setHoverName(pStack.getHoverName());
                }
                if (pEntity instanceof Player pPlayer) {
                    pPlayer.getInventory().setItem(pSlotId, nextStateItem);
                } else {
                    pEntity.setItemSlot(EquipmentSlot.MAINHAND, nextStateItem);
                }
            } else{
                nbtData.putInt("oxidizing_timer", timer-1);
            }
        }
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }

    @Override
    public void onCraftedBy(ItemStack pStack, Level pLevel, Player pPlayer) {
        super.onCraftedBy(pStack, pLevel, pPlayer);
        CompoundTag nbtData = pStack.getOrCreateTag();
        nbtData.putInt("oxidizing_timer", 1200);
        pStack.setTag(nbtData);
    }
}
