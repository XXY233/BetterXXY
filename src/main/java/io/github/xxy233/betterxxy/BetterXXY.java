package io.github.xxy233.betterxxy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterXXY implements ModInitializer {

    public static final Item CUSTOM_ITEM = new CustomItem(new FabricItemSettings().maxCount(5));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300);
    }
}
