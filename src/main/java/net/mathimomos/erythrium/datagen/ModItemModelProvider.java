package net.mathimomos.erythrium.datagen;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
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
