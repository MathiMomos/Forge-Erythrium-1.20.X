package net.mathimomos.erythrium.entity.client;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class TomathiBaseModel extends GeoModel<TomathiBaseEntity> {
    @Override
    public ResourceLocation getModelResource(TomathiBaseEntity tomathiBaseEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "geo/tomathi_base.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TomathiBaseEntity tomathiBaseEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_base.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TomathiBaseEntity tomathiBaseEntity) {
        return new ResourceLocation(Erythrium.MOD_ID, "animations/tomathi_base.animation.json");
    }

    @Override
    public void setCustomAnimations(TomathiBaseEntity animatable, long instanceId, AnimationState<TomathiBaseEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Cuerpo");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
