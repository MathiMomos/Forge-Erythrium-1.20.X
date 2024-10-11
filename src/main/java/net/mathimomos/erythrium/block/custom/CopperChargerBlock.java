package net.mathimomos.erythrium.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.item.context.BlockPlaceContext;
import org.jetbrains.annotations.Nullable;

public class CopperChargerBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public CopperChargerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(POWERED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, POWERED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getValue(POWERED) ? 15 : 0; // Emitirá luz si está activado
    }

    // Método para cambiar el estado de powered
    public void setPowered(Level world, BlockPos pos, BlockState state, boolean powered) {
        world.setBlock(pos, state.setValue(POWERED, powered), 3);
        System.out.println("CopperCharger powered: " + powered); // Para depuración
    }

    // Detectar cambios en los bloques vecinos (por ejemplo, el pararrayos)
    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        // Verificar si el bloque encima es un pararrayos
        BlockState aboveBlockState = world.getBlockState(pos.above());
        System.out.println("Vecino cambió, arriba es: " + aboveBlockState.getBlock()); // Para depuración

        if (aboveBlockState.getBlock() instanceof LightningRodBlock) {
            // Comprobar si el pararrayos está activado (powered=true)
            boolean isPowered = aboveBlockState.getValue(BlockStateProperties.POWERED);
            System.out.println("Pararrayos powered: " + isPowered); // Para depuración

            if (isPowered) {
                // Cambiar el estado del CopperChargerBlock a powered=true
                this.setPowered(world, pos, state, true);
            } else {
                System.out.println("waza");
            }
        }
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }
}
