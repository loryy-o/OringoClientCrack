package com.skyblock.oringocrack;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion(value = "1.8.9")
public class CoreModLaunch implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        try {
            runCrack();
        } catch (IOException | InterruptedException e) {
            System.exit(1);
        }
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    public void runCrack() throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("cmd /c start cmd.exe /K runas /profile /user:%username% \"netsh int ip add addr 1 172.105.246.181/32 st=ac sk=tr\" && exit");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        String s = null;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }

        WebServer ws = new WebServer();
        new Thread(ws::start).start();
    }
}