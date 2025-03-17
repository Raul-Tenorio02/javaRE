package InventoryRE.Item.Weaponry.Knife;

import InventoryRE.Item.Item;
import InventoryRE.Item.ItemType;
import InventoryRE.Item.Weaponry.Weapons.WeaponType;

public final class Knife extends Item implements KnifeInterface{

    public Knife(Long id, String name, String description, ItemType type, WeaponType typeWeapon) {
        super(id, name, description, type);
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getDescription() + "}";
    }

    @Override
    public void swingCount(String name, int count){
        System.out.println("\nYou've stabbed an enemy " + count + "x!");
    }
}
