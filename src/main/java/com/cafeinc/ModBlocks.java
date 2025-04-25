package com.cafeinc;

import net.minecraft.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class ModBlocks {

    public static Block COFFEE_MACHINE_BLOCK;

    public static void register() {
        COFFEE_MACHINE_BLOCK  = Registry.register(
            Registry.BLOCK,
            new ResourceLocation("cafeinc", "coffee_machine"),
            new CoffeeMachineBlockEnhanced()
        );
    }
}