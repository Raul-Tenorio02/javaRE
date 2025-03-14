package InventoryRE.Files;

import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemType;

public final class  File extends Item {

    public File(Long id, String name, String description, ItemType type) {
        super(id, name, description, type);
    }

    @Override
    public String toString() {
        return "{" + getName() + "}";
    }

}