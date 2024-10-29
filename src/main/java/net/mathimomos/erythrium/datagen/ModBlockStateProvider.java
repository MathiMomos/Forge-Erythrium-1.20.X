package net.mathimomos.erythrium.datagen;


import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.mathimomos.erythrium.block.custom.CopperChargerBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
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
        blockWithItem(ModBlocks.CHISELED_ERYTHRIUM_BLOCK);
        blockWithItem(ModBlocks.ERYTHRIUM_TILES_BLOCK);
        blockWithItem(ModBlocks.REDDISH_DEEPSLATE_BLOCK);
        blockWithItem(ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK);

        blockWithItem(ModBlocks.ERYTHRIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE);
        blockWithItem(ModBlocks.COMPACTED_ERYTHRIUM);

        blockWithItem(ModBlocks.IGNITE_BLOCK);

        blockWithItem(ModBlocks.NETHER_ROSE_QUARTZ_ORE);

        blockWithItem(ModBlocks.ROSE_QUARTZ_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.ROSE_QUARTZ_STAIRS.get()), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.ROSE_QUARTZ_SLAB.get()), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        blockTopWithItem(ModBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.ROSE_QUARTZ_BRICKS);
        pillarWithItem(ModBlocks.ROSE_QUARTZ_PILLAR);

        blockWithItem(ModBlocks.SMOOTH_ROSE_QUARTZ);
        stairsBlock(((StairBlock) ModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS.get()), blockTexture(ModBlocks.SMOOTH_ROSE_QUARTZ.get()));
        slabBlock(((SlabBlock) ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB.get()), blockTexture(ModBlocks.SMOOTH_ROSE_QUARTZ.get()), blockTexture(ModBlocks.SMOOTH_ROSE_QUARTZ.get()));


        blockWithItem(ModBlocks.FLINT_BLOCK);
        blockBottomTopWithItem(ModBlocks.TOMATHI_BLOCK);
        CopperChargerWithItem(ModBlocks.COPPER_CHAGER);

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
    private void blockTopWithItem(RegistryObject<Block> blockRegistryObject){
        ResourceLocation side = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath());
        ResourceLocation top = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_top");
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeTop(blockRegistryObject.getId().getPath(), side, top));
    }

    private void pillarWithItem(RegistryObject<Block> blockRegistryObject){
        ResourceLocation side = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath());
        ResourceLocation top = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_top");
        axisBlock(blockRegistryObject.get(), side, top);
        simpleBlockItem(blockRegistryObject.get(), models().cubeColumn(blockRegistryObject.getId().getPath(), side, top));
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

    private void CopperChargerWithItem(RegistryObject<Block> blockRegistryObject) {
        ResourceLocation down = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_down");
        ResourceLocation up = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_up");
        ResourceLocation north = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_north");
        ResourceLocation south = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_south");
        ResourceLocation west = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_west");
        ResourceLocation east = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_east");
        ResourceLocation north_on = new ResourceLocation(Erythrium.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_north_on");

        // Define los modelos según el estado del bloque (powered o no)
        getVariantBuilder(blockRegistryObject.get()).forAllStates(state -> {
            boolean powered = state.getValue(CopperChargerBlock.POWERED);
            ModelFile modelFile = powered ?
                    models().cube(blockRegistryObject.getId().getPath() + "_powered", down, up, north_on, south, west, east)
                            .texture("particle", north_on) :
                    models().cube(blockRegistryObject.getId().getPath() + "_unpowered", down, up, north, south, west, east)
                            .texture("particle", north);

            // Invertir rotación si es necesario
            int rotationY = (state.getValue(CopperChargerBlock.FACING).get2DDataValue() * 90 + 180) % 360;

            return ConfiguredModel.builder()
                    .modelFile(modelFile)
                    .rotationY(rotationY)  // Invertir rotación
                    .build();
        });

        // Registra el item con el modelo del estado "unpowered"
        simpleBlockItem(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath() + "_unpowered", down, up, north, south, west, east).texture("particle", north));
    }

    private void customModelHorizontalBlock(RegistryObject<Block> blockRegistryObject, String name) {
        simpleBlockItem(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + name)));
        horizontalBlock(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + name)));
    }

    protected void axisBlock(Block block, ResourceLocation side, ResourceLocation end) {
        ResourceLocation blockName = BuiltInRegistries.BLOCK.getKey(block);
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction.Axis axis = state.getValue(RotatedPillarBlock.AXIS);
                    ModelFile model = models().cubeColumn(blockName.getPath(), side, end);
                    return ConfiguredModel.builder()
                            .modelFile(model)
                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                            .build();
                });
    }
}
