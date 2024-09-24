package net.mathimomos.erythrium.datagen;


import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Erythrium.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ERYTHRIUM_BLOCK);
        blockWithItem(ModBlocks.ERYTHRIUM_TILES_BLOCK);
        blockWithItem(ModBlocks.REDDISH_DEEPSLATE_BLOCK);
        blockWithItem(ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK);

        blockWithItem(ModBlocks.ERYTHRIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE);
        blockWithItem(ModBlocks.COMPACTED_ERYTHRIUM);

        blockWithItem(ModBlocks.IGNITE_ORE);
        blockWithItem(ModBlocks.IGNITE_BLOCK);

        blockWithItem(ModBlocks.NETHER_ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_BLOCK);

        blockWithItem(ModBlocks.FLINT_BLOCK);
        blockBottomTopWithItem(ModBlocks.TOMATHI_BLOCK);
        blockDifferentWithItem(ModBlocks.COPPER_CHAGER, true);

        customModelHorizontalBlock(ModBlocks.DIAMOND_CUTTER, "diamond_cutter");
        customModelHorizontalBlock(ModBlocks.METALURGIC_STATION, "metalurgic_station");

        blockWithItem(ModBlocks.IRON_NUGGET_ORE);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);

        blockWithItem(ModBlocks.SCORIA);
        blockWithItem(ModBlocks.GABBRO);
        blockWithItem(ModBlocks.RHYOLITE);

        blockWithItem(ModBlocks.POLISHED_SCORIA);
        blockWithItem(ModBlocks.POLISHED_GABBRO);
        blockWithItem(ModBlocks.POLISHED_RHYOLITE);
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockBottomTopWithItem(RegistryObject<Block> blockRegistryObject){
        ResourceLocation side = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath());
        ResourceLocation bottom = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_bottom");
        ResourceLocation top = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_top");
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop(blockRegistryObject.getId().getPath(), side, bottom, top));
    }

    private void blockDifferentWithItem(RegistryObject<Block> blockRegistryObject, boolean rotation) {
        ResourceLocation down = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath()+ "_down");
        ResourceLocation up = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_up");
        ResourceLocation north = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_north");
        ResourceLocation south = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_south");
        ResourceLocation west = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_west");
        ResourceLocation east = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_east");
        simpleBlockItem(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        if (rotation){
            horizontalBlock(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        } else {
            simpleBlock(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        }
    }

    private void customModelHorizontalBlock(RegistryObject<Block> blockRegistryObject, String name) {
        simpleBlockItem(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + name)));
        horizontalBlock(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + name)));
    }
}
