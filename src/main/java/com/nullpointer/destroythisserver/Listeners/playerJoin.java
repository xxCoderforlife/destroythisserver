package com.nullpointer.destroythisserver.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.nullpointer.destroythisserver.Teams.Team1;
import com.nullpointer.destroythisserver.Teams.Team2;

public class playerJoin implements Listener{

    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player p = (Player) e.getPlayer();
        int allTeams = t1.getSize() + t2.getSize();
        if(allTeams == 0){
            t1.addPlayer(p);

            }else{
                if(t1.getSize() < t2.getSize()){
                    t1.addPlayer(p);
                }else{
                    t2.addPlayer(p);
                }
            }

    }
    
}
