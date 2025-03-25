package InventoryRE.Items.Weaponry.Ammunition;

import InventoryRE.Items.Item;
import InventoryRE.Items.ItemType;

public final class Ammunition extends Item {

    private int quantity;
    private AmmoType typeAmmo;

    public Ammunition(int id, String name, String description, ItemType type, AmmoType typeAmmo , int quantity) {
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
        return " | " + getName() + " | " + getDescription()
                + " | Quantity: " + getQuantity();
    }
}