package me.james.silentjoin;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final SilentJoin plugin;

    public JoinListener(SilentJoin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission("silentjoin.use")) {
            event.setJoinMessage(null); // Suppress join message

            if (plugin.getConfig().getBoolean("enableEffect")) {
                player.getWorld().spawnParticle(
                    Particle.valueOf(plugin.getConfig().getString("effectType", "TOTEM")),
                    player.getLocation(), 30
                );
            }

            if (plugin.getConfig().getBoolean("enableSound")) {
                player.playSound(
                    player.getLocation(),
                    Sound.valueOf(plugin.getConfig().getString("soundType", "ENTITY_ENDERMAN_TELEPORT")),
                    1.0f, 1.0f
                );
            }
        }
    }
}