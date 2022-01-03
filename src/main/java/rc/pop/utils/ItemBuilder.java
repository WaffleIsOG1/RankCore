package rc.pop.utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemBuilder {
    /**
     * Generated ItemBuilder util from previous plugin Plugin="New Plugin"
     * Methods here may be deprecated.
     */
    private ItemStack item;

    public ItemBuilder(ItemStack is) {
        this.item = is;
    }

    public ItemBuilder(Material mat) {
        this.item = new ItemStack(mat);
    }

    public ItemBuilder name(String name) {
        ItemMeta im = this.item.getItemMeta();
        im.setDisplayName(name);
        this.item.setItemMeta(im);
        return this;
    }

    public ItemBuilder lore(String lore) {
        List<String> itemLore = this.item.getItemMeta().hasLore() ? this.item.getItemMeta().getLore() : new ArrayList();
        ((List)itemLore).add(lore);
        this.lore((List)itemLore);
        return this;
    }

    public ItemBuilder lore(List<String> lore) {
        ItemMeta im = this.item.getItemMeta();
        im.setLore(lore);
        this.item.setItemMeta(im);
        return this;
    }

    public ItemBuilder clearLore() {
        List<String> emptyList = new ArrayList();
        this.lore((List)emptyList);
        return this;
    }

    public ItemBuilder clearEnchantments() {
        if (this.item.getItemMeta().hasEnchants()) {
            Iterator var1 = this.item.getEnchantments().keySet().iterator();

            while(var1.hasNext()) {
                Enchantment enchantments = (Enchantment)var1.next();
                this.item.removeEnchantment(enchantments);
            }
        }

        return this;
    }

    public ItemBuilder clearEnchantment(Enchantment enchant) {
        if (this.item.getItemMeta().hasEnchants() && this.item.getEnchantments().containsKey(enchant)) {
            ItemMeta im = this.item.getItemMeta();
            im.removeEnchant(enchant);
            this.item.setItemMeta(im);
        }

        return this;
    }

    public ItemBuilder amount(int amount) {
        this.item.setAmount(amount > 0 ? amount : 1);
        return this;
    }

    public ItemBuilder durability(int durability) {
        this.item.setDurability((short)durability);
        return this;
    }

    public ItemBuilder color(Color color) {
        if (this.item.getType().toString().contains("LEATHER_")) {
            LeatherArmorMeta meta = (LeatherArmorMeta)this.item.getItemMeta();
            meta.setColor(color);
            this.item.setItemMeta(meta);
        }

        return this;
    }

    /** @deprecated */
    @Deprecated /* Newly Deprecated, process works.*/
    public ItemBuilder data(int data) {
        this.item.getData().setData((byte)data);
        return this;
    }

    public ItemStack build() {
        return this.item;
    }
}