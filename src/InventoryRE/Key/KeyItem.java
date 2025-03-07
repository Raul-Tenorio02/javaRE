package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Item;
import InventoryRE.ItemDatabase;
import InventoryRE.ItemType;

public final class KeyItem extends Item implements FilmInterface {

    KeyType typeKey;
    private int quantity, filmID;

    public KeyItem() {
    }

    public KeyItem(String name, String description, ItemType type, KeyType typeKey) {
        super(name, description, type);
        this.typeKey = typeKey;
    }

    public KeyItem(String name, String description, ItemType type, KeyType typeKey, int quantity) {
        super(name, description, type);
        this.typeKey = typeKey;
        this.quantity = quantity;
    }

    public KeyItem(String name, String description, ItemType type, KeyType typeKey, int quantity, int filmID) {
        super(name, description, type);
        this.typeKey = typeKey;
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
}
