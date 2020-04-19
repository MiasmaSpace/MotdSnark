package me.rhapso.motdSnark;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.List;

public class pluginMain extends JavaPlugin {

    @Override
    public void onEnable(){
        saveDefaultConfig();
        @SuppressWarnings("unchecked") List<String> motdList = (List<String>) getConfig().getList("motd_list");
        getServer().getPluginManager().registerEvents(new motdListener(motdList), this);
    }
}
