package com.nullpointer.destroythisserver.Teams;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import net.md_5.bungee.api.ChatColor;

public class Team1 {
    
    private static ArrayList <Player> team1 = new ArrayList <Player> ();
    public Team1(){
    }
    private void setScoreboard(Player p){
        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = sb.registerNewObjective("Team1", "dummy","Team 1");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score bb = obj.getScore(ChatColor.WHITE + "Blocks Broken: ");
        bb.setScore(15);
        Team blocksbroken = sb.registerNewTeam("blocksbrokenTeam1");
        blocksbroken.addEntry("0");
        blocksbroken.setPrefix(ChatColor.WHITE + "");
        obj.getScore("0").setScore(15);
        p.setScoreboard(sb);
    }

    private void removeScoreboard(Player p){
        p.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
    }
    

    public ArrayList<Player> getTeam1() {
        return team1;
    }
    public void addPlayer(Player p){
        team1.add(p);
        setScoreboard(p);
        p.sendMessage("You are in Team 1");
    }
    public void removePlayer(Player p){
        team1.remove(p);
        removeScoreboard(p);
    }
    public void clearTeam(){
        team1.clear();
    }
    public int getSize(){
        return team1.size();
    }

}
