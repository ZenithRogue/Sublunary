package dev.zenithknight.mcmods;

import dev.zenithknight.mcmods.sublunary.common.SublunaryItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import dev.zenithknight.mcmods.sublunary.common.entities.mallard.MallardEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class Sublunary implements ModInitializer {
    public static final String MOD_ID = "sublunary";

    public static final EntityType<MallardEntity> MALLARD_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "mallard"), FabricEntityTypeBuilder.create(MobCategory.CREATURE, MallardEntity::new).dimensions(EntityDimensions.scalable(0.65f, 0.65f)).build()
    );

    public static ResourceLocation locate(String location) {
        if (location.contains(":")) {
            return new ResourceLocation(location); //probably useful if its from another mod
        } else {
            return new ResourceLocation(MOD_ID, location); //so we can be lazy, or if its not from another mod
        }
    }

    @Override
    public void onInitialize() {
        SublunaryItems.init();
        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes());
    }
}
