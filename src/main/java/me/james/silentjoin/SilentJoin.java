package me.james.silentjoin;

import org.bukkit.plugin.java.JavaPlugin;

public class SilentJoin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new JoinListener(this), this);
        getLogger().info("SilentJoin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SilentJoin disabled.");
    }
}