package InventoryRE.Items.Key;

import InventoryRE.Items.Files.File;
import InventoryRE.Items.Item;
import InventoryRE.Items.ItemDatabase;
import InventoryRE.Items.ItemType;

public final class KeyItem extends Item implements KeyItemInterface {

    private final KeyType typeKey;
    private int quantity;
    ItemDatabase itemDatabase = new ItemDatabase();

    public KeyItem(int id, String name, String description, ItemType type, KeyType typeKey) {
        super(id, name, description, type);
        this.typeKey = typeKey;
    }

    //overloading to add specific attributes for films and ink ribbons
    public KeyItem(int id, String name, String description, ItemType type, KeyType typeKey, int quantity) {
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
            return " | " + getName() + " | " + getDescription() + " | " + getQuantity();
        } else {
            return " | " + getName() + " | " + getDescription();
        }
    }

    @Override
    public File developFilm(KeyItem film) {
        if (this.typeKey == KeyType.FILM) {
            if (film.getId() == 38) {
                return itemDatabase.getFILM_A();
            } else if (film.getId() == 39) {
                return itemDatabase.getFILM_B();
            } else if (film.getId() == 40) {
                return itemDatabase.getFILM_C();
            } else if (film.getId() == 41) {
                return itemDatabase.getFILM_D();
            }
            return null;
        }
        return null;
    }

    @Override
    public KeyItem combineKeyItems(KeyItem otherKeyItem){
        if (this.getType() == ItemType.KEY && otherKeyItem.getType() == ItemType.KEY){
            if (this.getId() == itemDatabase.getPLASTIC_BOMB().getId() && otherKeyItem.getId() == itemDatabase.getDETONATOR().getId() || this.getId() == itemDatabase.getDETONATOR().getId() && otherKeyItem.getId() == (itemDatabase.getPLASTIC_BOMB().getId())) {
                return itemDatabase.getBOMB_DET();
            } else if (this.getId() == itemDatabase.getBLUE_STONE_LEFT().getId() && otherKeyItem.getId() == itemDatabase.getBLUE_STONE_RIGHT().getId() || this.getId() == itemDatabase.getBLUE_STONE_RIGHT().getId() && otherKeyItem.getId() == (itemDatabase.getBLUE_STONE_LEFT().getId())) {
                return itemDatabase.getJAGUAR_STONE();
            }
        }
        return null;
    }
}
