package com.cafeinc;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COFFEE_MACHINE_ITEM = new BlockItem(ModBlocks.COFFEE_MACHINE_BLOCK, new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("cafeinc", "coffee_machine"), COFFEE_MACHINE_ITEM);
    }
}