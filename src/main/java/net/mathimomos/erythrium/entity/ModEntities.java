package net.mathimomos.erythrium.entity;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Erythrium.MOD_ID);

    public static final RegistryObject<EntityType<TomathiBaseEntity>> TOMATHI_BASE =
            ENTITY_TYPES.register("tomathi_base", () -> EntityType.Builder.of(TomathiBaseEntity:: new, MobCategory.CREATURE)
                    .sized(0.75f, 0.75f).build("tomathi_base"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
