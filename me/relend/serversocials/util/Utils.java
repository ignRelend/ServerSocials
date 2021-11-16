package me.relend.serversocials.util;

import me.relend.serversocials.ServerSocials;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Utils {

    ServerSocials plugin = JavaPlugin.getPlugin(ServerSocials.class);

    public String getPrefix() { return plugin.getConfig().getString("prefix"); }

    public String getYouTubeLink() {
        return plugin.getConfig().getString("youtube");
    }

    public String getDiscordLink() {
        return plugin.getConfig().getString("discord");
    }

    public String getTwitterLink() {
        return plugin.getConfig().getString("twitter");
    }

    public String getTwitchLink() {
        return plugin.getConfig().getString("twitch");
    }

    public String getTikTokLink() {
        return plugin.getConfig().getString("tiktok");
    }

    public boolean isYouTubeEnabled() {
        return plugin.getConfig().getBoolean("youtube-enabled");
    }

    public boolean isDiscordEnabled() {
        return plugin.getConfig().getBoolean("discord-enabled");
    }

    public boolean isTwitterEnabled() {
        return plugin.getConfig().getBoolean("twitter-enabled");
    }

    public boolean isTwitchEnabled() {
        return plugin.getConfig().getBoolean("twitch-enabled");
    }

    public boolean isTikTokEnabled() {
        return plugin.getConfig().getBoolean("tiktok-enabled");
    }

    public String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public String getSocialDisabled() { return plugin.getConfig().getString("social-disabled"); }

}
