package com.nullpointer.destroythisserver.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nullpointer.destroythisserver.Main;
import com.nullpointer.destroythisserver.Teams.Team1;
import com.nullpointer.destroythisserver.Teams.Team2;
import com.nullpointer.destroythisserver.Utils.Messages;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor{

    private Main m;
    public Commands(Main m){
        this.m = m;
    }
    Messages mes = new Messages();
    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase("destroythisserver")){
                Player p = (Player) sender;
                if(args.length == 0){
                    p.sendMessage("Add Stuff Here");
            }
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("join")){
                    p.sendMessage("Join Team 1 or Team 2");
                }else if(args[0].equalsIgnoreCase("verison")){
                    p.sendMessage(mes.getPrefix() + ChatColor.translateAlternateColorCodes('&', "&f&oYou are using Version: " 
                    + m.getDescription().getVersion()));
                }

                }
            if(args.length == 2){
                if(args[0].equalsIgnoreCase("join")){
                    if(args[1].equalsIgnoreCase("team1")){
                        if(t1.getTeam1().containsKey(p)){
                            p.sendMessage("You are already in Team 1");
                        }else{
                            t2.removePlayer(p);
                            t1.addPlayer(p);
                            p.sendMessage("You have joined Team 1");
                        }
                    }
                    if(args[1].equalsIgnoreCase("team2")){
                        if(t2.getTeam2().containsKey(p)){
                            p.sendMessage("You are already in Team 2");
                        }else{
                            t1.removePlayer(p);
                            t2.addPlayer(p);
                            p.sendMessage("You have joined Team 2");
                        }
                    }

                }
            }

            }
        }
        return true;
    }
    
}
