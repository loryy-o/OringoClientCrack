package com.skyblock.oringocrack;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.io.IOException;
import java.util.Map;

import static com.skyblock.oringocrack.OringoCrack.*;

@IFMLLoadingPlugin.MCVersion(value="1.8.9")
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
            addRule();
            startServer();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
