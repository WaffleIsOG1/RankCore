package rc.pop.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class guimanager implements Listener {


    public void openGUI(Player player){
        Inventory i = Bukkit.createInventory(null, 8, ChatColor.GRAY + "Grant menu");



    }
}
