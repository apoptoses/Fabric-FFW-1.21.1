package net.emmi.ffw.item;

import net.emmi.ffw.FrozenFarmingWasteland;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FrozenFarmingWasteland.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FrozenFarmingWasteland.LOGGER.info("Registering Mod Items for " + FrozenFarmingWasteland.MOD_ID);
    }


}
