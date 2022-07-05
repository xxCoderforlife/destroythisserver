package com.nullpointer.destroythisserver;

import org.bukkit.plugin.java.JavaPlugin;

import com.nullpointer.destroythisserver.Commands.Commands;
import com.nullpointer.destroythisserver.Commands.TabCommands;
import com.nullpointer.destroythisserver.Listeners.countBlockBreak;
import com.nullpointer.destroythisserver.Listeners.playerJoin;
import com.nullpointer.destroythisserver.Listeners.playerLeave;
import com.nullpointer.destroythisserver.Teams.Team1;
import com.nullpointer.destroythisserver.Teams.Team2;

public class Main extends JavaPlugin{

    public void onEnable (){
        cleanTeams();
        registerListeners();
    }

    public void onDisable (){
        cleanTeams();
    }

    private void registerListeners(){
        getServer().getPluginManager().registerEvents(new playerJoin(), this);
        getServer().getPluginManager().registerEvents(new playerLeave(), this);
        getServer().getPluginManager().registerEvents(new countBlockBreak(), this);
        getCommand("destroythisserver").setExecutor(new Commands(this));
        getCommand("destroythisserver").setTabCompleter(new TabCommands());
    }

    private void cleanTeams(){
        Team1 t1 = new Team1();
        Team2 t2 = new Team2();
        t1.clearTeam();
        t2.clearTeam();
    }
    
}
