package dev.zenithknight.mcmods.sublunary.common.entities.mallard;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import static dev.zenithknight.mcmods.Sublunary.MOD_ID;

public class MallardRenderer extends MobRenderer<MallardEntity, net.minecraft.client.model.EntityModel<dev.zenithknight.mcmods.sublunary.common.entities.mallard.MallardEntity>> {
    public MallardRenderer(EntityRendererProvider.Context context) {
        super(context, new MallardModel(context.bakeLayer(MallardModel.LAYER_LOCATION)), 0.25f);
    }
    public static final ResourceLocation[] MALLARD_LOCATIONS = new ResourceLocation[]{
            new ResourceLocation(MOD_ID, "textures/entity/mallard/mallard.png"),
            new ResourceLocation(MOD_ID, "textures/entity/mallard/mallady.png"),
            new ResourceLocation(MOD_ID, "textures/entity/mallard/mababy.png"),
    };

    @Override
    public ResourceLocation getTextureLocation(MallardEntity entity) {
        if (entity.isBaby()) {
            return MALLARD_LOCATIONS[2];
        } else {
            return MALLARD_LOCATIONS[entity.getVariant()];
        }
    }
}
