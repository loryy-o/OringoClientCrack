package com.skyblock.oringocrack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.opengl.Display;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Mod(modid = com.skyblock.oringocrack.OringoCrack.MOD_ID, version = com.skyblock.oringocrack.OringoCrack.VERSION)
public class OringoCrack {
    public static final String MOD_ID = "5zig";
    public static final String VERSION = "6.9";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
        Display.setTitle("Oringo Client - Cracked by Lory & fe");
    }
}


class WebServer {
    protected void start() {
        ServerSocket s;

        try {
            s = new ServerSocket(80);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return;
        }

        for (;;) {
            try {
                Socket remote = s.accept();
                System.out.println("[AUTH] Received auth request.");
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        remote.getInputStream()));
                PrintWriter out = new PrintWriter(remote.getOutputStream());

                String str = ".";
                while (!str.equals(""))
                    str = in.readLine();

                out.println("HTTP/1.0 200 OK");
                out.println("Content-Type: text/html");
                out.println("Server: Bot");
                out.println("");
                out.println("1");
                out.flush();
                remote.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
