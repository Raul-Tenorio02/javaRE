package InventoryRE.Files;

import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemType;

public final class  File extends Item {

    public File(String name, String description, ItemType type) {
        super(name, description, type);
    }

    @Override
    public String toString() {
        return "{" + getName() + "}";
    }

}
