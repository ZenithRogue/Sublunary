package dev.zenithknight.mcmods.sublunary.client;

import dev.zenithknight.mcmods.Sublunary;
import dev.zenithknight.mcmods.sublunary.common.entities.mallard.MallardModel;
import dev.zenithknight.mcmods.sublunary.common.entities.mallard.MallardRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class SublunaryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Sublunary.MALLARD_ENTITY, (context -> {
            return new MallardRenderer(context);
        }));

        EntityModelLayerRegistry.registerModelLayer(MallardModel.LAYER_LOCATION, MallardModel::createBodyLayer);
    }
}
