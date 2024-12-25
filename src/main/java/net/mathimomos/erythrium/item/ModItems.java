package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.item.custom.*;
import net.mathimomos.erythrium.sound.ModSounds;
import net.mathimomos.erythrium.util.ModToolTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> NETHER_ROSE_QUARTZ = ITEMS.register("nether_rose_quartz",
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

    public static final RegistryObject<Item> OXIDIZED_COPPER_HELMET = ITEMS.register("oxidized_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_CHESTPLATE = ITEMS.register("oxidized_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_LEGGINGS = ITEMS.register("oxidized_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BOOTS = ITEMS.register("oxidized_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WEATHERED_COPPER_HELMET = ITEMS.register("weathered_copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.OXIDIZED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_CHESTPLATE = ITEMS.register("weathered_copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.OXIDIZED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_LEGGINGS = ITEMS.register("weathered_copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.OXIDIZED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BOOTS = ITEMS.register("weathered_copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.OXIDIZED_COPPER_BOOTS.get()));

    public static final RegistryObject<Item> EXPOSED_COPPER_HELMET = ITEMS.register("exposed_copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.WEATHERED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_CHESTPLATE = ITEMS.register("exposed_copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.WEATHERED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_LEGGINGS = ITEMS.register("exposed_copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.WEATHERED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BOOTS = ITEMS.register("exposed_copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.WEATHERED_COPPER_BOOTS.get()));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.EXPOSED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.EXPOSED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.EXPOSED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.EXPOSED_COPPER_BOOTS.get()));

    public static final RegistryObject<Item> OXIDIZED_COPPER_SWORD = ITEMS.register("oxidized_copper_sword",
            () -> new SwordItem(ModToolTiers.OXIDIZED_COPPER, 4, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_PICKAXE = ITEMS.register("oxidized_copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OXIDIZED_COPPER, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_AXE = ITEMS.register("oxidized_copper_axe",
            () -> new AxeItem(ModToolTiers.OXIDIZED_COPPER, 7.5F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_SHOVEL = ITEMS.register("oxidized_copper_shovel",
            () -> new ShovelItem(ModToolTiers.OXIDIZED_COPPER, 2.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_HOE = ITEMS.register("oxidized_copper_hoe",
            () -> new HoeItem(ModToolTiers.OXIDIZED_COPPER, 0, -1F, new Item.Properties()));

    public static final RegistryObject<Item> WEATHERED_COPPER_SWORD = ITEMS.register("weathered_copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.WEATHERED_COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_PICKAXE = ITEMS.register("weathered_copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.WEATHERED_COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_AXE = ITEMS.register("weathered_copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.WEATHERED_COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_AXE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_SHOVEL = ITEMS.register("weathered_copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.WEATHERED_COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_HOE = ITEMS.register("weathered_copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.WEATHERED_COPPER, 0, -1F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_HOE.get()));

    public static final RegistryObject<Item> EXPOSED_COPPER_SWORD = ITEMS.register("exposed_copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.EXPOSED_COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_PICKAXE = ITEMS.register("exposed_copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.EXPOSED_COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_AXE = ITEMS.register("exposed_copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.EXPOSED_COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_AXE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_SHOVEL = ITEMS.register("exposed_copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.EXPOSED_COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_HOE = ITEMS.register("exposed_copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.EXPOSED_COPPER, 0, -1F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_HOE.get()));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_AXE.get()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.COPPER, 0, -1F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_HOE.get()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_PLATE = ITEMS.register("rose_gold_plate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 5, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 3, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 7.5F, -3F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 3.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 0, 0F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModToolTiers.ROSE_GOLD, 5, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROSE_GOLD, 3, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ModToolTiers.ROSE_GOLD, 7.5F, -3F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ModToolTiers.ROSE_GOLD, 3.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ModToolTiers.ROSE_GOLD, 0, 0F, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(ModFoods.CHERRIES)));
    public static final RegistryObject<Item> TUNA = ITEMS.register("tuna",
            () -> new Item(new Item.Properties().food(ModFoods.TUNA)));

    public static final RegistryObject<Item> OBSIDIAN_FRAGMENT = ITEMS.register("obsidian_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_NETHER_QUARTZ = ITEMS.register("rough_nether_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_NETHER_ROSE_QUARTZ = ITEMS.register("rough_nether_rose_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAT_WING = ITEMS.register("bat_wing",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHANTOM_EYE = ITEMS.register("phantom_eye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SQUID_TENTACLE = ITEMS.register("squid_tentacle",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_SQUID)));
    public static final RegistryObject<Item> GLOW_SQUID_TENTACLE = ITEMS.register("glow_squid_tentacle",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_GLOW_SQUID)));
    public static final RegistryObject<Item> COOKED_SQUID_TENTACLE = ITEMS.register("cooked_squid_tentacle",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SQUID)));
    public static final RegistryObject<Item> FROG_LEG = ITEMS.register("frog_leg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOMATHI_SPAWN_EGG = ITEMS.register("tomathi_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TOMATHI_BASE, 0xD63347, 0x09B167, new Item.Properties()));

    public static final RegistryObject<Item> LONG_TOMATHI_SPAWN_EGG = ITEMS.register("long_tomathi_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TOMATHI_LONG, 0xD63347, 0x09B167, new Item.Properties()));

    public static final RegistryObject<Item> GREEN_TOMATHI_SPAWN_EGG = ITEMS.register("green_tomathi_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TOMATHI_GREEN, 0x86B838, 0x09B167, new Item.Properties()));

    public static final RegistryObject<Item> HEAVY_TOMATHI_SPAWN_EGG = ITEMS.register("heavy_tomathi_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TOMATHI_BIG, 0x09B167, 0xD63347, new Item.Properties()));

    public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHERED_BONE = ITEMS.register("withered_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUST_MUSIC_DISC = ITEMS.register("music_disc_gust",
            () -> new RecordItem(2, ModSounds.GUST, new Item.Properties().stacksTo(1), 1740));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
