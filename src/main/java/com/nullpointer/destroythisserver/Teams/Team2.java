package com.nullpointer.destroythisserver.Teams;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import com.nullpointer.destroythisserver.Utils.Messages;

import net.md_5.bungee.api.ChatColor;

public class Team2 {
    
    private static HashMap<Player, UUID> team2 = new HashMap<Player, UUID>();
    private Messages m = new Messages();
    private ConsoleCommandSender cSender = Bukkit.getConsoleSender();
    public Team2(){

    }

    private void setScoreboard(Player p){
        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = sb.registerNewObjective("Team2", "dummy","Team 2");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score bb = obj.getScore(ChatColor.WHITE + "Blocks Broken: ");
        bb.setScore(0);
        p.setScoreboard(sb);
    }
    private void removeScoreboard(Player p){
        p.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
    }
    public HashMap<Player,UUID> getTeam2() {
        return team2;
    }
    public void addPlayer(Player p){
        team2.put(p,p.getUniqueId());
        setScoreboard(p);
        p.sendTitle(ChatColor.translateAlternateColorCodes('&', 
        "&4&o&lYou joined Team 2"), 
        m.getTagLine(), 10, 120, 10);
        cSender.sendMessage(m.getPrefix() + " " + p.getName() + " joined Team 2");
    }
    public void removePlayer(Player p){
        team2.remove(p, p.getUniqueId());
        removeScoreboard(p);
    }
    public void clearTeam(){
        team2.clear();
    }
    public int getSize(){
        return team2.size();
    }

}
