package io.github.mrbeezwax.itemplates;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemPlates extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("ItemPlates v1.0.0 Enabled");
        new PressurePlateEvent(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
