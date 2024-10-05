package net.mathimomos.erythrium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiBigEntity;
import net.mathimomos.erythrium.entity.custom.TomathiGreenEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TomathiBigRenderer extends GeoEntityRenderer<TomathiBigEntity> {

    public TomathiBigRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TomathiBigModel());
    }

    private static final ResourceLocation TEXTURE_NORMAL = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_big.png");
    private static final ResourceLocation TEXTURE_BLINK = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_big_blink.png");
    private static final ResourceLocation TEXTURE_RAGED = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_big_raged.png");


    @Override
    public ResourceLocation getTextureLocation(TomathiBigEntity animatable) {

        if (animatable.isBlinking()) {
            return TEXTURE_BLINK;
        } else if (animatable.isAggressive()) {
            return TEXTURE_RAGED;
        } else {
            return TEXTURE_NORMAL;
        }
    }


    @Override
    public void render(TomathiBigEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(1f, 1f, 1f);
        }


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
