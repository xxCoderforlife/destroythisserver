package com.nullpointer.destroythisserver.Utils;

import net.md_5.bungee.api.ChatColor;

public class Messages {
    
    public Messages(){

    }
    private final String prefix = new String(ChatColor.translateAlternateColorCodes('&', 
    "&0*l[&a&oDTS&0]&r "));
    private final String tagLine = new String(ChatColor.translateAlternateColorCodes('&',
    "&b&o&lDestroy This Server"));

    public String getPrefix() {
        return prefix;
    }
    public String getTagLine() {
        return tagLine;
    }
}
