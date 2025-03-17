package InventoryRE.Item.Files;

import InventoryRE.Item.Item;
import InventoryRE.Item.ItemType;

public final class  File extends Item {

    public File(Long id, String name, String description, ItemType type) {
        super(id, name, description, type);
    }

    @Override
    public String toString() {
        return "{" + getName() + "}";
    }

}