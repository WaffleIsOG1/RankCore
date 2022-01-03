package rc.pop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {
    public static String prefix = "§RankCore §7> ";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.GREEN + "Plugin has been enabled");

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED + "Plugin has been disabled");
    }
}
