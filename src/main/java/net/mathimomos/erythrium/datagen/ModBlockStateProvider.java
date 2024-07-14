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

        blockWithItem(ModBlocks.ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_BLOCK);

        blockWithItem(ModBlocks.FLINT_BLOCK);
        blockBottomTopWithItem(ModBlocks.TOMATHI_BLOCK,
                new ResourceLocation(Erythrium.MOD_ID, "block/tomathi_block"),
                new ResourceLocation(Erythrium.MOD_ID, "block/tomathi_block_bottom"),
                new ResourceLocation(Erythrium.MOD_ID, "block/tomathi_block_top")
        );
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockBottomTopWithItem(RegistryObject<Block> blockRegistryObject, ResourceLocation bottom, ResourceLocation side, ResourceLocation top){
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop(blockRegistryObject.getId().getPath(), bottom, side, top));
    }
    private void blockWithDifferentTextures(RegistryObject<Block> blockRegistryObject, ResourceLocation down, ResourceLocation up, ResourceLocation north, ResourceLocation south, ResourceLocation west, ResourceLocation east) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east));
    }
}
