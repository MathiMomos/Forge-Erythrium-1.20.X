package net.mathimomos.erythrium.entity.client;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBigEntity;
import net.mathimomos.erythrium.entity.custom.TomathiGreenEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class TomathiBigModel extends GeoModel<TomathiBigEntity> {
    @Override
    public ResourceLocation getModelResource(TomathiBigEntity tomathiBigEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "geo/tomathi_big.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TomathiBigEntity tomathiBigEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_big.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TomathiBigEntity tomathiBigEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "animations/tomathi_big.animation.json");
    }

    @Override
    public void setCustomAnimations(TomathiBigEntity animatable, long instanceId, AnimationState<TomathiBigEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Cuerpo");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
