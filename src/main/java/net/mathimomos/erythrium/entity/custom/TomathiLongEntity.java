package net.mathimomos.erythrium.entity.custom;

import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.Random;

public class TomathiLongEntity extends Animal implements GeoEntity {

    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private final Random randomBlink = new Random();
    private int blinkTimer = 0;
    private boolean isBlinking = false;

    public TomathiLongEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new BreedGoal(this, 1.125d));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1d, Ingredient.of(ModItems.OINKBALLS.get()), false));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1d));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers());

        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1d, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Pig.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20)
                .add(Attributes.FOLLOW_RANGE, 240)
                .add(Attributes.MOVEMENT_SPEED, 0.3f)
                .add(Attributes.ARMOR_TOUGHNESS, 0)
                .add(Attributes.ATTACK_DAMAGE, 4)
                .add(Attributes.ATTACK_KNOCKBACK, 0.3f)
                .add(Attributes.ATTACK_SPEED, 1.25f);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.TOMATHI_BASE.get().create(serverLevel);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
        controllerRegistrar.add(new AnimationController<>(this, "attackController", 0, this::attackPredicate));
    }

    private <T extends GeoAnimatable> PlayState attackPredicate(AnimationState<T> tAnimationState) {
        if (this.swinging && tAnimationState.getController().getAnimationState().equals(AnimationController.State.STOPPED)) {
            tAnimationState.getController().forceAnimationReset();
            tAnimationState.getController().setAnimation(RawAnimation.begin().thenPlay("animation.tomathi_long.attack"));
            this.swinging = false;
        }
        return PlayState.CONTINUE;
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()){
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.tomathi_long.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.tomathi_long.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public boolean isBlinking() {
        return this.isBlinking;
    }

    @Override
    public void aiStep() {
        updateSwingTime();
        super.aiStep();

        if (blinkTimer > 0) {
            blinkTimer--;
            if (blinkTimer == 0) {
                this.isBlinking = false;
            }
        } else if (randomBlink.nextInt(100) < 1) {
            this.isBlinking = true;
            blinkTimer = 5;
        }
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        boolean result = super.hurt(source, amount);
        if (result) {
            LivingEntity attacker = source.getEntity() instanceof LivingEntity ? (LivingEntity) source.getEntity() : null;
            if (attacker != null) {
                this.setLastHurtByMob(attacker);
            }
            alertOthers();
        }
        return result;
    }

    private void alertOthers() {
        if (!this.level().isClientSide){
            double alertRadius = this.getAttributeValue(Attributes.FOLLOW_RANGE);
            LivingEntity attacker = this.getLastHurtByMob();

            if (attacker != null) {
                this.level().getEntitiesOfClass(TomathiBaseEntity.class, this.getBoundingBox().inflate(alertRadius)).forEach((baseTomathi) -> {
                        baseTomathi.setTarget(attacker);
                });

                this.level().getEntitiesOfClass(TomathiLongEntity.class, this.getBoundingBox().inflate(alertRadius)).forEach((longTomathi) -> {
                    if (longTomathi != this) {
                        longTomathi.setTarget(attacker);
                    }
                });

                this.level().getEntitiesOfClass(TomathiGreenEntity.class, this.getBoundingBox().inflate(alertRadius)).forEach((greenTomathi) -> {
                        greenTomathi.setTarget(attacker);
                });

                this.level().getEntitiesOfClass(TomathiBigEntity.class, this.getBoundingBox().inflate(alertRadius)).forEach((bigTomathi) -> {
                        bigTomathi.setTarget(attacker);
                });
            }
        }
    }

    @Override
    public boolean isAggressive() {
        return super.isAggressive();
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(ModItems.OINKBALLS.get());
    }
}
