package space.yurisi.salute;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.salute.command.SaluteCommand;
public final class Salute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("k").setExecutor(new SaluteCommand());
        this.getCommand("oti").setExecutor(new SaluteCommand());
        this.getCommand("otu").setExecutor(new SaluteCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
