package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemDatabase;
import InventoryRE.Inventory.ItemType;

public final class KeyItem extends Item implements KeyItemInterface {

    private final KeyType typeKey;
    private int quantity;
    ItemDatabase itemDatabase = new ItemDatabase();

    public KeyItem(Long id, String name, String description, ItemType type, KeyType typeKey) {
        super(id, name, description, type);
        this.typeKey = typeKey;
    }

    //overloading to add specific attributes for films and ink ribbons
    public KeyItem(Long id, String name, String description, ItemType type, KeyType typeKey, int quantity) {
        this(id, name, description, type, typeKey);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    public File developFilm(KeyItem film) {
        if (this.typeKey == KeyType.FILM) {
            if (film.getId() == 38L) {
                return itemDatabase.getFILM_A();
            } else if (film.getId() == 39L) {
                return itemDatabase.getFILM_B();
            } else if (film.getId() == 40L) {
                return itemDatabase.getFILM_C();
            } else if (film.getId() == 41L) {
                return itemDatabase.getFILM_D();
            }
            return null;
        }
        return null;
    }

    @Override
    public KeyItem combineKeyItems(Item otherKeyItem){
        if (this.getType() == ItemType.KEY && otherKeyItem.getType() == ItemType.KEY){
            if (this.equals(itemDatabase.getPLASTIC_BOMB()) && otherKeyItem.equals(itemDatabase.getDETONATOR()) || this.equals(itemDatabase.getDETONATOR()) && otherKeyItem.equals(itemDatabase.getPLASTIC_BOMB())) {
                return itemDatabase.getBOMB_DET();
            } else if (this.equals(itemDatabase.getBLUE_STONE_LEFT()) && otherKeyItem.equals(itemDatabase.getBLUE_STONE_RIGHT()) || this.equals(itemDatabase.getBLUE_STONE_RIGHT()) && otherKeyItem.equals(itemDatabase.getBLUE_STONE_LEFT())) {
                return itemDatabase.getJAGUAR_STONE();
            }
        }
        return null;
    }
}
