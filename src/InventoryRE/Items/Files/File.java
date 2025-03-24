package InventoryRE.Items.Files;

import InventoryRE.Items.Item;
import InventoryRE.Items.ItemType;

public final class  File extends Item {

    public File(int id, String name, String description, ItemType type) {
        super(id, name, description, type);
    }

    @Override
    public String toString() {
        return "{" + "ID: " + getId() + " | " + getName() + "}";
    }

}