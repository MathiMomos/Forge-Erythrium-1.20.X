package net.mathimomos.erythrium.event;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Erythrium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TOMATHI_BASE.get(), TomathiBaseEntity.createAttributes().build());
    }
}
