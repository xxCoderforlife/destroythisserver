package com.nullpointer.destroythisserver.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class countBlockBreak implements Listener{
    

    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        p.getScoreboard();
        
    }
}
