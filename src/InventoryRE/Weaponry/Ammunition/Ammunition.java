package InventoryRE.Weaponry.Ammunition;

import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemType;

public final class Ammunition extends Item {

    private int quantity;
    private AmmoType typeAmmo;

    public Ammunition(Long id, String name, String description, ItemType type, AmmoType typeAmmo , int quantity) {
        super(id, name, description, type);
        this.typeAmmo = typeAmmo;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int updateQuantity(int quantity, int n) {
        return quantity * n;
    }

    public AmmoType getAmmoType(){
        return typeAmmo;
    }

    public void setTypeAmmo(AmmoType typeAmmo) {
        this.typeAmmo = typeAmmo;
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getDescription()
                + ", Quantity: " + getQuantity() + "}";
    }
}