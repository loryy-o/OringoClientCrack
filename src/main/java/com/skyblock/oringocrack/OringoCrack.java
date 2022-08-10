package com.skyblock.oringocrack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.opengl.Display;

import java.io.IOException;

@Mod(modid = OringoCrack.MOD_ID, version = OringoCrack.VERSION)
public class OringoCrack {
    public static final String MOD_ID = "5zig";
    public static final String VERSION = "6.9";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
        Display.setTitle("Oringo Client - Cracked by Lory & fe");
    }
}