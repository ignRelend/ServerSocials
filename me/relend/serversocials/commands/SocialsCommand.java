package me.relend.serversocials.commands;

import me.relend.serversocials.util.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SocialsCommand implements CommandExecutor {

    Utils u = new Utils();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        sender.sendMessage(u.colorize(u.getPrefix() + "\n" +
                "&eDiscord: &6" + (u.isDiscordEnabled() ? u.getDiscordLink() : u.getSocialDisabled()) + "\n" +
                "&eYouTube: &6" + (u.isYouTubeEnabled() ? u.getYouTubeLink() : u.getSocialDisabled()) + "\n" +
                "&eTwitter: &6" + (u.isTwitterEnabled() ? u.getTwitterLink() : u.getSocialDisabled()) + "\n" +
                "&eTwitch: &6" + (u.isTwitchEnabled() ? u.getTwitchLink() : u.getSocialDisabled()) + "\n" +
                "&eTikTok: &6" + (u.isTikTokEnabled() ? u.getTikTokLink() : u.getSocialDisabled()) + "\n" +
                u.getPrefix()
        ));

        return false;
    }

}
