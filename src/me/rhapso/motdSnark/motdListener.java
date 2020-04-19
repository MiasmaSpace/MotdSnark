package me.rhapso.motdSnark;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.List;
import java.util.Random;

public class motdListener implements Listener {

    private final List<String> motdList;
    private final Random random;

    public motdListener(List<String> motdList) {
        this.motdList = motdList;
        this.random = new Random();
    }

    @EventHandler
    public void onMOTDPing(ServerListPingEvent e){
        int motdIndex = random.nextInt(motdList.size());
        e.setMotd(motdList.get(motdIndex));
    }
}
