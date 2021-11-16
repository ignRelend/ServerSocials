package me.relend.serversocials;

import me.relend.serversocials.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerSocials extends JavaPlugin {

    private static boolean usePlaceholders = false;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getConfig().options().copyDefaults();

        if(this.getServer().getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            System.out.println("PlaceholderAPI found! You can use Placeholders!");
            usePlaceholders = true;
        } else {
            System.out.println("PlaceholderAPI not found! Install it to use Placeholders!");
            System.out.println("The plugin will continue to work without it.");
            usePlaceholders = false;
        }

        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("youtube").setExecutor(new YouTubeCommand());
        getCommand("twitter").setExecutor(new TwitterCommand());
        getCommand("twitch").setExecutor(new TwitchCommand());
        getCommand("tiktok").setExecutor(new TikTokCommand());

        getCommand("socials").setExecutor(new SocialsCommand());

    }
}
