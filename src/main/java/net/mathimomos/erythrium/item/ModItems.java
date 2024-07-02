package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.custom.FuelItem;
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
    public static final RegistryObject<Item> ERYTHRIUM_TWIN = ITEMS.register("erythrium_twin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IGNITE = ITEMS.register("ignite",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static final RegistryObject<Item> ERYTHRIUM_SWORD = ITEMS.register("erythrium_sword",
            () -> new SwordItem(ModToolTiers.ERYTHRIUM, 6, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_PICKAXE = ITEMS.register("erythrium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ERYTHRIUM, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_AXE = ITEMS.register("erythrium_axe",
            () -> new AxeItem(ModToolTiers.ERYTHRIUM, 8, -3F, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_SHOVEL = ITEMS.register("erythrium_shovel",
            () -> new ShovelItem(ModToolTiers.ERYTHRIUM, 4.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_HOE = ITEMS.register("erythrium_hoe",
            () -> new HoeItem(ModToolTiers.ERYTHRIUM, 0, 0F, new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_DIAMOND = ITEMS.register("rough_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_EMERALD = ITEMS.register("rough_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_FRAGMENT = ITEMS.register("leather_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_TWIN = ITEMS.register("diamond_twin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAZURITE = ITEMS.register("lazurite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_TOME = ITEMS.register("enchanted_tome",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STARDUST = ITEMS.register("stardust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_STAR_SHARD = ITEMS.register("nether_star_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STARSHINE = ITEMS.register("starshine",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CIRCUIT = ITEMS.register("copper_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOMATHI = ITEMS.register("tomathi",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATHI)));
    public static final RegistryObject<Item> GLITTERMEAT = ITEMS.register("glittermeat",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.GLITTERMEAT)));
    public static final RegistryObject<Item> OINKBALLS = ITEMS.register("oinkballs",
            () -> new Item(new Item.Properties().food(ModFoods.OINKBALLS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
