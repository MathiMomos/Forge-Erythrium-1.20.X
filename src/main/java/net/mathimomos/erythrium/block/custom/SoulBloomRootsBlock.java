package net.mathimomos.erythrium.block.custom;

import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RootsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SoulBloomRootsBlock extends RootsBlock {

    public SoulBloomRootsBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.SOUL_SAND) || pState.is(Blocks.SOUL_SOIL) || pState.is(ModBlocks.SOUL_SANDSTONE.get());
    }
}
