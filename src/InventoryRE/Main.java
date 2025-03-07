package InventoryRE;

public class Main {

    /*                          OG Resident Evil 2's Inventory

        This project's purpose is to represent Classic Resident Evil 2's inventory main features
        by using Object-Oriented Programing, Data Structure, some Java build-in features etc.
        More information on README.

                                            Enjoy :)

        author: Raul-Tenorio02 on GitHub
    */

    public static void main(String[] args) {

        Inventory<Item> Leon = new Inventory<>();
        Inventory<Item> Claire = new Inventory<>();

        Leon.collectItem(true, ItemDatabase.HK_VP70);
        Leon.collectItem(true, ItemDatabase.HANDGUN_BULLETS);
        Leon.listInventory();
        Leon.useWeapon("H&K VP70", 3);
        Leon.combineItems("H&K VP70", "Hand Gun Bullets");
        Leon.listInventory();
        Leon.collectItem(true, ItemDatabase.HANDGUN_BULLETS);
        Leon.listInventory();
        Leon.collectItem(true, ItemDatabase.INK_RIBBON);
        Leon.listInventory();
    }
}