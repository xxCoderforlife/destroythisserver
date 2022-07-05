package com.nullpointer.destroythisserver.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class TabCommands implements TabCompleter{

    private final String[] commands = {"join",""};
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> tab = new ArrayList<>();
        if(args.length == 0){
            tab.add("dts");
        }
        if(args.length == 1){
            for(String s : commands){
                tab.add(s);
            }
        }
        if(args.length == 2){
            if(args[0].equalsIgnoreCase("join")){
                tab.add("Team1");
                tab.add("Team2");
            }
        }
        return tab;
    }
    
}
