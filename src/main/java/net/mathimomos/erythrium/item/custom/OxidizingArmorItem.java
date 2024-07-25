package net.mathimomos.erythrium.item.custom;

import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OxidizingArmorItem extends ArmorItem {
    private final Item nextStateItem;
    public OxidizingArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, Item nextStateItem) {
        super(pMaterial, pType, pProperties);
        this.nextStateItem = nextStateItem;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (!pLevel.isClientSide && pEntity instanceof Player player) {
            boolean isInInventory = pSlotId < player.getInventory().items.size();

            if (pSlotId == 0 || pSlotId == 1 || pSlotId == 2 || pSlotId == 3 || isInInventory) {
                if (pStack.getTag() != null && pStack.getTag().contains("oxidation_time")) {
                    long oxidationTime = pStack.getTag().getLong("oxidation_time");
                    if (pLevel.getGameTime() >= oxidationTime) {
                        ItemStack oxidizedPiece = new ItemStack(nextStateItem);
                        oxidizedPiece.setDamageValue(pStack.getDamageValue());
                        if (pStack.hasCustomHoverName()){
                            oxidizedPiece.setHoverName(pStack.getHoverName());
                        }
                        if (pStack.getTag() != null && pStack.getTag().contains("Trim")){
                            oxidizedPiece.getOrCreateTag().put("Trim", pStack.getTag().get("Trim"));
                        }

                        if (pSlotId >= 0 && pSlotId < 4) {
                            pStack.shrink(1);
                            player.getInventory().armor.set(pSlotId, oxidizedPiece);
                        }
                        if (pSlotId >= 4 && pSlotId < player.getInventory().items.size()) {
                            pStack.shrink(1);
                            player.getInventory().items.set(pSlotId, oxidizedPiece);
                        }
                    }
                } else {
                    pStack.getOrCreateTag().putLong("oxidation_time", pLevel.getGameTime() + 60*20);
                }
            }
        }
    }
}