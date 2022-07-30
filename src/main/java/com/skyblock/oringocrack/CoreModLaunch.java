package com.skyblock.oringocrack;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

@IFMLLoadingPlugin.MCVersion(value="1.8.9")
public class CoreModLaunch implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() { return new String[0]; }

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
        WebServer ws = new WebServer();
        new Thread(ws::start).start();
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
