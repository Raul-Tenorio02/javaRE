package InventoryRE.Item.Weaponry.WeaponParts;

import InventoryRE.Item.Item;
import InventoryRE.Item.ItemType;

public final class Parts extends Item {

    private final PartType typePart;

    public Parts(Long id, String name, String description, ItemType type, PartType typePart) {
        super(id, name, description, type);
        this.typePart = typePart;
    }

    public PartType getTypePart() {
        return typePart;
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getDescription() + "}";
    }

}
