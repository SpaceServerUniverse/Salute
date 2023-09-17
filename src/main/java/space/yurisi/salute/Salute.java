package space.yurisi.salute;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.salute.command.kCommand;
import space.yurisi.salute.command.otiCommand;
import space.yurisi.salute.command.otuCommand;

import java.util.Objects;

public final class Salute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("k").setExecutor(new kCommand());
        this.getCommand("oti").setExecutor(new otiCommand());
        this.getCommand("otu").setExecutor(new otuCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
