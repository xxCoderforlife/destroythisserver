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

public class Team1 {
    
    private static HashMap<Player, UUID> team1 = new HashMap<Player, UUID>();
    private Messages m = new Messages();
    private final ConsoleCommandSender cSender = Bukkit.getConsoleSender();
    public Team1(){
    }
    private void setScoreboard(Player p){
        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = sb.registerNewObjective("Team1", "dummy","Team 1");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score bb = obj.getScore(ChatColor.WHITE + "Blocks Broken: ");
        bb.setScore(0);
        p.setScoreboard(sb);
    }

    private void removeScoreboard(Player p){
        p.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
    }
    

    public HashMap<Player,UUID> getTeam1() {
        return team1;
    }
    public void addPlayer(Player p){
        team1.put(p, p.getUniqueId());
        setScoreboard(p);
        p.sendTitle(ChatColor.translateAlternateColorCodes('&', 
        "&1&o&lYou joined Team 1"), 
        m.getTagLine(), 10, 120, 10);
        cSender.sendMessage(m.getPrefix() + " " + p.getName() + " joined Team 1");
    }
    public void removePlayer(Player p){
        team1.remove(p, p.getUniqueId());
        removeScoreboard(p);
    }
    public void clearTeam(){
        team1.clear();
    }
    public int getSize(){
        return team1.size();
    }

}
