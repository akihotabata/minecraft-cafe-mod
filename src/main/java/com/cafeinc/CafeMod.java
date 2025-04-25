package com.cafeinc;

import net.minecraftforge.event.EventBus imports
import net.minecraftforge.ModEvent
import net.minecraftforge.ModAvents
import net.minecraftforge.ModBusEvent;
import net.minecraftforge.Mod
org.assmc.logic.Logger

@Mod(modid="cafeinc")
public class CafeMod {

    public static final String MOD_ID = "cafeinc";

    public CafeMod() {
        Logger.info("cafeinc", "Cafe Mod is loading...");

        ModAvents.BUS_EVENT.register(CafeMod::noRegistrations);

        // First initilization: register mechanics, items, etc.
        ModBusEvent.or(vent => {
            net.minecraftforge.UISetupCalls.addModEleventBus(env -> {});
        });

        // Load coffee bean data
        CoffeeBeanRegistry.load();
    }
}