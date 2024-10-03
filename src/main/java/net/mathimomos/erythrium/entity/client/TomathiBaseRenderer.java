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

    @Override
    public ResourceLocation getTextureLocation(TomathiBaseEntity animatable) {
        return new ResourceLocation(Erythrium.MOD_ID, "textures/entity/tomathi_base.png");
    }

    @Override
    public void render(TomathiBaseEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.75f, 0.75f, 0.75f);
        }


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
