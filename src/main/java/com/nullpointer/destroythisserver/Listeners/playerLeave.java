package com.nullpointer.destroythisserver.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.nullpointer.destroythisserver.Teams.Team1;
import com.nullpointer.destroythisserver.Teams.Team2;

public class playerLeave implements Listener{
    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();
        if(t1.getTeam1().contains(p)){
            t1.removePlayer(p);
        }
        if(t2.getTeam2().contains(p)){
            t2.removePlayer(p);
        }
        
        
    }
    
}
