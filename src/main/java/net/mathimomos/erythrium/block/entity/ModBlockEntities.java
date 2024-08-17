package net.mathimomos.erythrium.block.entity;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Erythrium.MOD_ID);

    public static final RegistryObject<BlockEntityType<DiamondCutterBlockEntity>> DIAMOND_CUTTER_BE =
            BLOCK_ENTITIES.register("diamond_cutter_be", () ->
                    BlockEntityType.Builder.of(DiamondCutterBlockEntity::new,
                            ModBlocks.DIAMOND_CUTTER.get()).build(null));

    public static final RegistryObject<BlockEntityType<MetalurgicStationBlockEntity>> METALURGIC_STATION_BE =
            BLOCK_ENTITIES.register("metalurgic_station_be", () ->
                    BlockEntityType.Builder.of(MetalurgicStationBlockEntity::new,
                            ModBlocks.METALURGIC_STATION.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}