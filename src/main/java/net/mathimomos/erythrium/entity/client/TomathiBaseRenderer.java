package net.mathimomos.erythrium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBaseEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TomathiBaseRenderer extends GeoEntityRenderer<TomathiBaseEntity> {

    public TomathiBaseRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TomathiBaseModel());
    }

    private static final ResourceLocation TEXTURE_NORMAL = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_base.png");
    private static final ResourceLocation TEXTURE_BLINK = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_base_blink.png");
    private static final ResourceLocation TEXTURE_RAGED = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_base_raged.png");

    private static final ResourceLocation TEXTURE_NORMAL_BABY = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_baby.png");
    private static final ResourceLocation TEXTURE_BLINK_BABY = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_baby_blink.png");
    private static final ResourceLocation TEXTURE_CRYING_BABY = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_baby_crying.png");

    @Override
    public ResourceLocation getTextureLocation(TomathiBaseEntity animatable) {
        if(animatable.isBaby()){
            if (animatable.isBlinking()) {
                return TEXTURE_BLINK_BABY;
            } else if (animatable.isAggressive()) {
                return TEXTURE_CRYING_BABY;
            } else {
                return TEXTURE_NORMAL_BABY;
            }
        }

        if (animatable.isBlinking()) {
            return TEXTURE_BLINK;
        } else if (animatable.isAggressive()) {
            return TEXTURE_RAGED;
        } else {
            return TEXTURE_NORMAL;
        }
    }


    @Override
    public void render(TomathiBaseEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(1f, 1f, 1f);
        }


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
