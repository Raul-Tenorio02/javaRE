package InventoryRE;

public interface InventoryInterface {

    void combineItems(String name1, String name2);
    void itemBoxIn(String name);
    void itemBoxOut(String name);
    void readFile(String name);
    void useWeapon(String name, int count);
    void darkRoom(String name);
    void collectItem(Boolean confirm, String name);

}
