package InventoryRE.Inventory;

import InventoryRE.Item.Item;

public interface InventoryInterface {

    void collectItem(Boolean confirm, Item itemToCollect);

    void combineItems(Item item1, Item item2);
    void itemBoxIn(Item item);
    void itemBoxOut(Item item);
    void readFile(Item item);
    void useWeapon(Item item, int count);
    void darkRoom(Item item);

}
