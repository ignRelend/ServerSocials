package me.relend.serversocials.commands;

import me.relend.serversocials.util.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TwitterCommand implements CommandExecutor {

    Utils u = new Utils();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(u.isTwitterEnabled() && u.getTwitterLink() != "" && u.getTwitterLink() != null) {
            if(u.getPrefix() != null) {
                sender.sendMessage(u.colorize(u.getPrefix() + "&eOur Twitter page is: &6" + u.getTwitterLink()));
            } else {
                sender.sendMessage(u.colorize("&cPrefix is null! Set it to \"\" if you don't want a prefix!"));
            }
        } else {
            sender.sendMessage(u.colorize(u.getPrefix() + u.getSocialDisabled()));
        }
        return false;
    }
}
