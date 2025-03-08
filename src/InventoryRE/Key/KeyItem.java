package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemDatabase;
import InventoryRE.Inventory.ItemType;

public final class KeyItem extends Item implements KeyItemInterface {

    KeyType typeKey;
    private int quantity, filmID;

    public KeyItem(String name, String description, ItemType type, KeyType typeKey) {
        super(name, description, type);
        this.typeKey = typeKey;
    }

    //overloading to add specific attributes for films and ink ribbons
    public KeyItem(String name, String description, ItemType type, KeyType typeKey, int quantity) {
        this(name, description, type, typeKey);
        this.quantity = quantity;
    }

    public KeyItem(String name, String description, ItemType type, KeyType typeKey, int quantity, int filmID) {
        this(name, description, type, typeKey, quantity);
        this.filmID = filmID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFilmID() {
        return filmID;
    }

    public KeyType getTypeKey() {
        return typeKey;
    }

    @Override
    public String toString() {
        if (typeKey == KeyType.INK_RIBBON) {
            return "{" + getName() + ", " + getDescription() + ", " + getQuantity() + "}";
        } else {
            return "{" + getName() + ", " + getDescription() + "}";
        }
    }

    @Override
    public File developFilm(int filmID) {
        if (this.typeKey == KeyType.FILM) {
            switch (this.getFilmID()) {
                case 1:
                    return ItemDatabase.FILM_A;
                case 2:
                    return ItemDatabase.FILM_B;
                case 3:
                    return ItemDatabase.FILM_C;
                case 4:
                    return ItemDatabase.FILM_D;
            }
        }
        return null;
    }

    @Override
    public KeyItem combineKeyItems(Item otherKeyItem){
        if (this.getType() == ItemType.KEY && otherKeyItem.getType() == ItemType.KEY){
            if (this == ItemDatabase.PLASTIC_BOMB && otherKeyItem == ItemDatabase.DETONATOR || this == ItemDatabase.DETONATOR && otherKeyItem == ItemDatabase.PLASTIC_BOMB ) {
                return ItemDatabase.BOMB_DET;
            } else if (this == ItemDatabase.BLUE_STONE_LEFT && otherKeyItem == ItemDatabase.BLUE_STONE_RIGHT || this == ItemDatabase.BLUE_STONE_RIGHT && otherKeyItem == ItemDatabase.BLUE_STONE_LEFT ) {
                return ItemDatabase.JAGUAR_STONE;
            }
        }
        return null;
    }
}
