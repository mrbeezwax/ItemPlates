package io.github.mrbeezwax.itemplates;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import java.util.HashMap;
import java.util.List;

public class PressurePlateEvent implements Listener {
    private final HashMap<Integer, List<Item>> CUSTOM_PLATES;

    public PressurePlateEvent(ItemPlates plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        CUSTOM_PLATES = new HashMap<>();
    }

    @EventHandler
    public void onPressurePlateInteract(PlayerDropItemEvent event) {
        Item item = event.getItemDrop();
        if (item.isOnGround()) {
            Bukkit.broadcastMessage("Item On Ground");
            if (item.getLocation().getBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE)
                Bukkit.broadcastMessage("Item on Pressure Plate");
            else Bukkit.broadcastMessage("Item not on Pressure Plate");
        }
    }
}
