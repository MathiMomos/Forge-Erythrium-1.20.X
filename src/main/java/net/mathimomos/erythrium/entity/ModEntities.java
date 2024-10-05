package net.mathimomos.erythrium.entity;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.mathimomos.erythrium.entity.custom.TomathiBigEntity;
import net.mathimomos.erythrium.entity.custom.TomathiGreenEntity;
import net.mathimomos.erythrium.entity.custom.TomathiLongEntity;
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
                    .sized((float) 12/16, (float) 18/16).build("tomathi_base"));

    public static final RegistryObject<EntityType<TomathiLongEntity>> TOMATHI_LONG =
            ENTITY_TYPES.register("tomathi_long", () -> EntityType.Builder.of(TomathiLongEntity:: new, MobCategory.CREATURE)
                    .sized((float) 12/16, (float) 26/16).build("tomathi_long"));

    public static final RegistryObject<EntityType<TomathiGreenEntity>> TOMATHI_GREEN =
            ENTITY_TYPES.register("tomathi_green", () -> EntityType.Builder.of(TomathiGreenEntity:: new, MobCategory.CREATURE)
                    .sized((float) 12/16, (float) 18/16).build("tomathi_green"));

    public static final RegistryObject<EntityType<TomathiBigEntity>> TOMATHI_BIG =
            ENTITY_TYPES.register("tomathi_big", () -> EntityType.Builder.of(TomathiBigEntity:: new, MobCategory.CREATURE)
                    .sized((float) 16/16, (float) 22/16).build("tomathi_big"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
