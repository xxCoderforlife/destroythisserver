package com.nullpointer.destroythisserver;

import org.bukkit.plugin.java.JavaPlugin;

import com.nullpointer.destroythisserver.Listeners.countBlockBreak;
import com.nullpointer.destroythisserver.Listeners.playerJoin;
import com.nullpointer.destroythisserver.Listeners.playerLeave;

public class Main extends JavaPlugin{

    public void onEnable (){
        this.getServer().getPluginManager().registerEvents(new playerJoin(), this);

        //registerListeners();
    }

    public void onDisable (){

    }

    private void registerListeners(){
        getServer().getPluginManager().registerEvents(new playerLeave(), this);
        getServer().getPluginManager().registerEvents(new countBlockBreak(), this);
    }
    
}
