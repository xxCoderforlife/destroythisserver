package com.nullpointer.destroythisserver.Listeners;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


import com.nullpointer.destroythisserver.Teams.Team1;
import com.nullpointer.destroythisserver.Teams.Team2;


public class countBlockBreak implements Listener{
    
    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    
    private HashMap<Player, Integer> team1Blocks = new HashMap<Player, Integer>();
    private HashMap<Player, Integer> team2Blocks = new HashMap<Player, Integer>();
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = (Player) e.getPlayer();
        for(Player player : t1.getTeam1().keySet()){
            if(player.equals(p)){
                if(team1Blocks.containsKey(p)){
                    team1Blocks.put(p, team1Blocks.get(p) + 1);
                }else{
                    team1Blocks.put(p, 1);
                }
            }
        }
        
    }
}
