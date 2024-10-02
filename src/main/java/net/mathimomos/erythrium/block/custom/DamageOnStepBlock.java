package net.mathimomos.erythrium.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class DamageOnStepBlock extends Block {
    float damage;

    public DamageOnStepBlock(Properties pProperties, float damage) {
        super(pProperties);
        this.damage = damage;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!level.isClientSide() && entity instanceof LivingEntity) {
            if (!entity.isShiftKeyDown()){
                entity.hurt(level.damageSources().hotFloor(), damage);
            }
        }
        super.stepOn(level, pos, state, entity);
    }
}
