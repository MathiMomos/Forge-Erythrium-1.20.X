package net.mathimomos.erythrium.entity.custom;

import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class TomathiBaseEntity extends Animal implements GeoEntity {

    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public TomathiBaseEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new BreedGoal(this, 1d));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1d, Ingredient.of(ModItems.OINKBALLS.get()), false));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1d));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(6, new HurtByTargetGoal(this));

        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1d, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Pig.class, true));

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20)
                .add(Attributes.FOLLOW_RANGE, 240)
                .add(Attributes.MOVEMENT_SPEED, 0.2f)
                .add(Attributes.ARMOR_TOUGHNESS, 0)
                .add(Attributes.ATTACK_DAMAGE, 4)
                .add(Attributes.ATTACK_KNOCKBACK, 0.3f)
                .add(Attributes.ATTACK_SPEED, 1f);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.TOMATHI_BASE.get().create(serverLevel);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()){
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.tomathi_base.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.tomathi_base.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(ModItems.OINKBALLS.get());
    }

    @Override
    public boolean hurt(DamageSource pSource, float pAmount) {
        if (pSource.getEntity() instanceof Player) {
            this.setTarget((Player) pSource.getEntity());
        }
        return super.hurt(pSource, pAmount);
    }
}
