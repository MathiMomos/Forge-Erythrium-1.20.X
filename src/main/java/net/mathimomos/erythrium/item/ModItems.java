package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.util.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Erythrium.MOD_ID);

    public static final RegistryObject<Item> ERYTHRIUM = ITEMS.register("erythrium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ERYTHRIUM = ITEMS.register("rough_erythrium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ERYTHRIUM_SWORD = ITEMS.register("erythrium_sword",
            () -> new SwordItem(ModToolTiers.ERYTHRIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_PICKAXE = ITEMS.register("erythrium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ERYTHRIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_AXE = ITEMS.register("erythrium_axe",
            () -> new AxeItem(ModToolTiers.ERYTHRIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_SHOVEL = ITEMS.register("erythrium_shovel",
            () -> new ShovelItem(ModToolTiers.ERYTHRIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_HOE = ITEMS.register("erythrium_hoe",
            () -> new HoeItem(ModToolTiers.ERYTHRIUM, 4, 2, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
