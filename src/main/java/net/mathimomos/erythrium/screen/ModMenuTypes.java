package net.mathimomos.erythrium.screen;

import net.mathimomos.erythrium.Erythrium;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mojang.text2speech.Narrator.LOGGER;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Erythrium.MOD_ID);

    public static final RegistryObject<MenuType<DiamondCutterMenu>> DIAMOND_CUTTER_MENU =
            registerMenuType("diamond_cutter_menu", DiamondCutterMenu::new);

    public static final RegistryObject<MenuType<MetalurgicStationMenu>> METALURGIC_STATION_MENU =
            registerMenuType("metalurgic_station_menu", MetalurgicStationMenu::new);

    public static final RegistryObject<MenuType<CopperChargerMenu>> COPPER_CHARGER_MENU =
            registerMenuType("copper_charger_menu", CopperChargerMenu::new);


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        LOGGER.info("Registering Menu Types");
        MENUS.register(eventBus);
    }
}