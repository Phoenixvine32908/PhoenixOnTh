package me.phoenixvine.main;

import org.bukkit.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class MessageWhenFallEvent implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent f) {
        if (f.getEntity() instanceof Player) {
            if (f.getCause() == EntityDamageEvent.DamageCause.FALL) {
              f.setDamage(5);
                Bukkit.broadcastMessage("Hey everyone <player>  took fall damage");

            }
        }
    }
}
