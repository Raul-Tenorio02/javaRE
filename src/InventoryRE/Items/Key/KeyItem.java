package InventoryRE.Items.Key;

import InventoryRE.Items.Files.File;
import InventoryRE.Items.Item;
import InventoryRE.Items.ItemDatabase;
import InventoryRE.Items.ItemType;

import java.util.Map;
import java.util.Set;

public final class KeyItem extends Item implements KeyItemInterface {

    private final KeyType typeKey;
    private int quantity;
    ItemDatabase itemDatabase = new ItemDatabase();

    public KeyItem(int id, String name, String description, ItemType type, KeyType typeKey) {
        super(id, name, description, type);
        this.typeKey = typeKey;
    }

    // specific for films and ink ribbons
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

    // crafting key items and developing films
    @Override
    public File developFilm(KeyItem film) {
        if (this.typeKey == KeyType.FILM) {
            switch (film.getId()) {
                case 38: return itemDatabase.getFILM_A();
                case 39: return itemDatabase.getFILM_B();
                case 40: return itemDatabase.getFILM_C();
                case 41: return itemDatabase.getFILM_D();
            }
        }
        return null;
    }

    @Override
    public KeyItem combineKeyItems(KeyItem otherKeyItem){
        if (this.getType() != ItemType.KEY && otherKeyItem.getType() != ItemType.KEY) {
            return null;
        }

        Map<Set<Integer>, KeyItem> keyCrafts = Map.of(
                Set.of(itemDatabase.getPLASTIC_BOMB().getId(), itemDatabase.getDETONATOR().getId()), itemDatabase.getBOMB_DET(),
                Set.of(itemDatabase.getBLUE_STONE_LEFT().getId(), itemDatabase.getBLUE_STONE_RIGHT().getId()), itemDatabase.getJAGUAR_STONE()
                );
        Set<Integer> keySet = Set.of(this.getId(), otherKeyItem.getId());

        return keyCrafts.getOrDefault(keySet, null);
    }
}
