package dev.zenithknight.mcmods.sublunary.common;

import dev.zenithknight.mcmods.Sublunary;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SpawnEggItem;

import static dev.zenithknight.mcmods.Sublunary.MOD_ID;

public class SublunaryItems {

    public static final Item MALLARD_SPAWN_EGG = register("mallard_spawn_egg", new SpawnEggItem(Sublunary.MALLARD_ENTITY, 0x297c48, 0xb6a99d, new FabricItemSettings().group(CreativeModeTab.TAB_MISC)));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }

    public static void init() {}
}
