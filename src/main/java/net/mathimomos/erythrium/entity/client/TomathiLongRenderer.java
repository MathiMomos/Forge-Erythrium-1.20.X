package net.mathimomos.erythrium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.entity.custom.TomathiLongEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TomathiLongRenderer extends GeoEntityRenderer<TomathiLongEntity> {
    public TomathiLongRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TomathiLongModel());
    }

    private static final ResourceLocation TEXTURE_NORMAL = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_long.png");
    private static final ResourceLocation TEXTURE_BLINK = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_long_blink.png");
    private static final ResourceLocation TEXTURE_RAGED = new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_long_raged.png");

    @Override
    public ResourceLocation getTextureLocation(TomathiLongEntity animatable) {
        if (animatable.isBlinking()) {
            return TEXTURE_BLINK;
        } else if (animatable.isAggressive()) {
            return TEXTURE_RAGED;
        } else {
            return TEXTURE_NORMAL;
        }
    }

    @Override
    public void render(TomathiLongEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.75f, 0.75f, 0.75f);
        }


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
