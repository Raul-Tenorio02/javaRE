package InventoryRE.Inventory;

import InventoryRE.Item.Item;

public interface InventoryInterface {

    void collectItem(Boolean confirm, int itemToCollect);

    void combineItems(int item1, int item2);
    void itemBoxIn(int item);
    void itemBoxOut(int item);
    void readFile(int item);
    void useWeapon(int item, int count);
    void darkRoom(int item);

}
