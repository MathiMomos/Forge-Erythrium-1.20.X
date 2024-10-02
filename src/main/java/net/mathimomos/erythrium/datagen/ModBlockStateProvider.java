package net.mathimomos.erythrium.datagen;


import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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

        blockWithItem(ModBlocks.RHYOLITE);
        blockWithItem(ModBlocks.SCORIA);
        blockWithItem(ModBlocks.GABBRO);

        stairsBlock(((StairBlock) ModBlocks.RHYOLITE_STAIRS.get()), blockTexture(ModBlocks.RHYOLITE.get()));
        stairsBlock(((StairBlock) ModBlocks.SCORIA_STAIRS.get()), blockTexture(ModBlocks.SCORIA.get()));
        stairsBlock(((StairBlock) ModBlocks.GABBRO_STAIRS.get()), blockTexture(ModBlocks.GABBRO.get()));

        slabBlock(((SlabBlock) ModBlocks.RHYOLITE_SLAB.get()), blockTexture(ModBlocks.RHYOLITE.get()), blockTexture(ModBlocks.RHYOLITE.get()));
        slabBlock(((SlabBlock) ModBlocks.SCORIA_SLAB.get()), blockTexture(ModBlocks.SCORIA.get()), blockTexture(ModBlocks.SCORIA.get()));
        slabBlock(((SlabBlock) ModBlocks.GABBRO_SLAB.get()), blockTexture(ModBlocks.GABBRO.get()), blockTexture(ModBlocks.GABBRO.get()));

        wallBlock(((WallBlock) ModBlocks.RHYOLITE_WALL.get()), blockTexture(ModBlocks.RHYOLITE.get()));
        wallBlock(((WallBlock) ModBlocks.SCORIA_WALL.get()), blockTexture(ModBlocks.SCORIA.get()));
        wallBlock(((WallBlock) ModBlocks.GABBRO_WALL.get()), blockTexture(ModBlocks.GABBRO.get()));

        blockWithItem(ModBlocks.POLISHED_RHYOLITE);
        blockWithItem(ModBlocks.POLISHED_SCORIA);
        blockWithItem(ModBlocks.POLISHED_GABBRO);

        stairsBlock(((StairBlock) ModBlocks.POLISHED_RHYOLITE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_RHYOLITE.get()));
        stairsBlock(((StairBlock) ModBlocks.POLISHED_SCORIA_STAIRS.get()), blockTexture(ModBlocks.POLISHED_SCORIA.get()));
        stairsBlock(((StairBlock) ModBlocks.POLISHED_GABBRO_STAIRS.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()));

        slabBlock(((SlabBlock) ModBlocks.POLISHED_RHYOLITE_SLAB.get()), blockTexture(ModBlocks.POLISHED_RHYOLITE.get()), blockTexture(ModBlocks.POLISHED_RHYOLITE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_SCORIA_SLAB.get()), blockTexture(ModBlocks.POLISHED_SCORIA.get()), blockTexture(ModBlocks.POLISHED_SCORIA.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_GABBRO_SLAB.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()));

        blockWithItem(ModBlocks.SOULRRACK);
        blockWithItem(ModBlocks.SOUL_MAGMA_BLOCK);
        blockWithItem(ModBlocks.GLOWING_OBSIDIAN);
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
