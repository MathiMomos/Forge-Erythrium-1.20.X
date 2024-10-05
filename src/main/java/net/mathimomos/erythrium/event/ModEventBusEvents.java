package net.mathimomos.erythrium.event;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.mathimomos.erythrium.entity.custom.TomathiBigEntity;
import net.mathimomos.erythrium.entity.custom.TomathiGreenEntity;
import net.mathimomos.erythrium.entity.custom.TomathiLongEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Erythrium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TOMATHI_BASE.get(), TomathiBaseEntity.createAttributes().build());
        event.put(ModEntities.TOMATHI_LONG.get(), TomathiLongEntity.createAttributes().build());
        event.put(ModEntities.TOMATHI_GREEN.get(), TomathiGreenEntity.createAttributes().build());
        event.put(ModEntities.TOMATHI_BIG.get(), TomathiBigEntity.createAttributes().build());
    }
}
