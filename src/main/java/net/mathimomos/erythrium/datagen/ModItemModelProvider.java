package net.mathimomos.erythrium.datagen;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Erythrium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ERYTHRIUM);
        simpleItem(ModItems.ROUGH_ERYTHRIUM);
        simpleItem(ModItems.ERYTHRIUM_TWIN);
        simpleItem(ModItems.IGNITE);

        handheldItem(ModItems.ERYTHRIUM_SWORD);
        handheldItem(ModItems.ERYTHRIUM_PICKAXE);
        handheldItem(ModItems.ERYTHRIUM_AXE);
        handheldItem(ModItems.ERYTHRIUM_SHOVEL);
        handheldItem(ModItems.ERYTHRIUM_HOE);

        simpleItem(ModItems.ROUGH_DIAMOND);
        simpleItem(ModItems.ROUGH_EMERALD);
        simpleItem(ModItems.LEATHER_FRAGMENT);
        simpleItem(ModItems.COPPER_PLATE);
        simpleItem(ModItems.IRON_PLATE);
        simpleItem(ModItems.GOLD_PLATE);
        simpleItem(ModItems.DIAMOND_TWIN);
        simpleItem(ModItems.LAZURITE);
        simpleItem(ModItems.ROSE_QUARTZ);
        simpleItem(ModItems.ENCHANTED_TOME);

        simpleItem(ModItems.STARDUST);
        simpleItem(ModItems.NETHER_STAR_SHARD);
        simpleItem(ModItems.STARSHINE);

        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.COPPER_CIRCUIT);

        simpleItem(ModItems.TOMATHI);
        simpleItem(ModItems.GLITTERMEAT);
        simpleItem(ModItems.OINKBALLS);

        simpleItem(ModItems.ERYTHRIUM_CROWN);
        trimmedArmorItem(ModItems.ERYTHRIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ERYTHRIUM_LEGGINGS);
        trimmedArmorItem(ModItems.ERYTHRIUM_BOOTS);

        simpleItem(ModItems.ERYTHRIUM_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.RAW_IRON_NUGGET);

        trimmedArmorItem(ModItems.COPPER_HELMET);
        trimmedArmorItem(ModItems.COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.COPPER_BOOTS);

        trimmedArmorItem(ModItems.EXPOSED_COPPER_HELMET);
        trimmedArmorItem(ModItems.EXPOSED_COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.EXPOSED_COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.EXPOSED_COPPER_BOOTS);

        trimmedArmorItem(ModItems.WEATHERED_COPPER_HELMET);
        trimmedArmorItem(ModItems.WEATHERED_COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.WEATHERED_COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.WEATHERED_COPPER_BOOTS);

        trimmedArmorItem(ModItems.OXIDIZED_COPPER_HELMET);
        trimmedArmorItem(ModItems.OXIDIZED_COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.OXIDIZED_COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.OXIDIZED_COPPER_BOOTS);

        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_HOE);

        handheldItem(ModItems.EXPOSED_COPPER_SWORD);
        handheldItem(ModItems.EXPOSED_COPPER_PICKAXE);
        handheldItem(ModItems.EXPOSED_COPPER_AXE);
        handheldItem(ModItems.EXPOSED_COPPER_SHOVEL);
        handheldItem(ModItems.EXPOSED_COPPER_HOE);

        handheldItem(ModItems.WEATHERED_COPPER_SWORD);
        handheldItem(ModItems.WEATHERED_COPPER_PICKAXE);
        handheldItem(ModItems.WEATHERED_COPPER_AXE);
        handheldItem(ModItems.WEATHERED_COPPER_SHOVEL);
        handheldItem(ModItems.WEATHERED_COPPER_HOE);

        handheldItem(ModItems.OXIDIZED_COPPER_SWORD);
        handheldItem(ModItems.OXIDIZED_COPPER_PICKAXE);
        handheldItem(ModItems.OXIDIZED_COPPER_AXE);
        handheldItem(ModItems.OXIDIZED_COPPER_SHOVEL);
        handheldItem(ModItems.OXIDIZED_COPPER_HOE);

        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.STEEL_PLATE);
        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);

        simpleItem(ModItems.ROSE_GOLD_INGOT);
        simpleItem(ModItems.ROSE_GOLD_PLATE);
        handheldItem(ModItems.ROSE_GOLD_SWORD);
        handheldItem(ModItems.ROSE_GOLD_PICKAXE);
        handheldItem(ModItems.ROSE_GOLD_AXE);
        handheldItem(ModItems.ROSE_GOLD_SHOVEL);
        handheldItem(ModItems.ROSE_GOLD_HOE);

        trimmedArmorItem(ModItems.STEEL_HELMET);
        trimmedArmorItem(ModItems.STEEL_CHESTPLATE);
        trimmedArmorItem(ModItems.STEEL_LEGGINGS);
        trimmedArmorItem(ModItems.STEEL_BOOTS);

        trimmedArmorItem(ModItems.ROSE_GOLD_HELMET);
        trimmedArmorItem(ModItems.ROSE_GOLD_CHESTPLATE);
        trimmedArmorItem(ModItems.ROSE_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.ROSE_GOLD_BOOTS);

    }
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Erythrium.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Erythrium.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Erythrium.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Erythrium.MOD_ID,"item/" + item.getId().getPath()));
    }
}
