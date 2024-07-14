package net.mathimomos.erythrium.item.custom;

import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;
//I extracted from MCreator, when I can find how to make like I want I'll change it
@Mod.EventBusSubscriber
public class FuelBlock {
    @SubscribeEvent
    public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack itemstack = event.getItemStack();
        if (itemstack.getItem() == ModBlocks.IGNITE_BLOCK.get().asItem())
            event.setBurnTime(20000);
    }
}
