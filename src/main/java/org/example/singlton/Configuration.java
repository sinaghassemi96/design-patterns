package org.example.singlton;

import java.util.HashMap;
import java.util.Map;

public final class Configuration {
    private static Configuration instance;
    public String value;
    public Map<String, String> settings = new HashMap<>();

    private Configuration(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Configuration getInstance(String value) {
        if (null == instance)
            instance = new Configuration(value);
        return instance;
    }

    public void setSettings(String key, String value) {
        this.settings.put(key, value);
    }

    public Map<String, String> getSettings() {
        return this.settings;
    }
}
