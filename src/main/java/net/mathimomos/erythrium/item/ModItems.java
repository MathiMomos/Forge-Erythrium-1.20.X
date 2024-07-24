package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.custom.FuelItem;
import net.mathimomos.erythrium.item.custom.OxidizingSwordItem;
import net.mathimomos.erythrium.util.ModToolTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.List;

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
            () -> new SimpleFoiledItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
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
    public static final RegistryObject<Item> ERYTHRIUM_CROWN = ITEMS.register("erythrium_crown",
            () -> new ArmorItem(ModArmorMaterials.ERYTHRIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_CHESTPLATE = ITEMS.register("erythrium_chestplate",
                () -> new ArmorItem(ModArmorMaterials.ERYTHRIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_LEGGINGS = ITEMS.register("erythrium_leggings",
                () -> new ArmorItem(ModArmorMaterials.ERYTHRIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ERYTHRIUM_BOOTS = ITEMS.register("erythrium_boots",
                () -> new ArmorItem(ModArmorMaterials.ERYTHRIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ERYTHRIUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("erythrium_upgrade_smithing_template",
                () -> new SmithingTemplateItem(
                        Component.translatable("item.erythrium_upgrade_smithing_template.aplies_to"),
                        Component.translatable("item.erythrium_upgrade_smithing_template.ingredients"),
                        Component.translatable("item.erythrium_upgrade_smithing_template.upgrade_description"),
                        Component.translatable("item.erythrium_upgrade_smithing_template.base_slot_description"),
                        Component.translatable("item.erythrium_upgrade_smithing_template.additions_slot_description"),
                        List.of(new ResourceLocation("item/empty_armor_slot_helmet"),
                                new ResourceLocation("item/empty_armor_slot_chestplate"),
                                new ResourceLocation("item/empty_armor_slot_leggings"),
                                new ResourceLocation("item/empty_armor_slot_boots")),
                        List.of(new ResourceLocation(Erythrium.MOD_ID,"item/empty_slot_erythrium"))
                        ));
    public static final RegistryObject<Item> RAW_IRON_NUGGET = ITEMS.register("raw_iron_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> EXPOSED_COPPER_HELMET = ITEMS.register("exposed_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_CHESTPLATE = ITEMS.register("exposed_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_LEGGINGS = ITEMS.register("exposed_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BOOTS = ITEMS.register("exposed_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WEATHERED_COPPER_HELMET = ITEMS.register("weathered_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_CHESTPLATE = ITEMS.register("weathered_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_LEGGINGS = ITEMS.register("weathered_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BOOTS = ITEMS.register("weathered_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> OXIDIZED_COPPER_HELMET = ITEMS.register("oxidized_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_CHESTPLATE = ITEMS.register("oxidized_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_LEGGINGS = ITEMS.register("oxidized_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BOOTS = ITEMS.register("oxidized_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.COPPER, 4, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 7.5F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 2.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 0, -1F, new Item.Properties()));

    public static final RegistryObject<Item> EXPOSED_COPPER_SWORD = ITEMS.register("exposed_copper_sword",
            () -> new SwordItem(ModToolTiers.EXPOSED_COPPER, 4, -2.4F, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
