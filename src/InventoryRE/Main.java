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
        Leon.collectItem(true, ItemDatabase.HANDGUN_PARTS);
        Leon.collectItem(true, ItemDatabase.HANDGUN_BULLETS);
        Leon.collectItem(true, ItemDatabase.GREEN_HERB);
        Leon.collectItem(true, ItemDatabase.RED_HERB);
        Leon.collectItem(true, ItemDatabase.FILM_1);
        Leon.collectItem(true, ItemDatabase.POLICE_MEMORANDUM);
        Leon.collectItem(true, ItemDatabase.CHRIS_DIARY);
        Leon.listInventory();
        Leon.listFiles();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
        Leon.combineItems("H&K VP70", "Hand Gun Parts");
        Leon.listInventory();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
        Leon.useWeapon("H&K VP70 Burst", 1);
        Leon.listInventory();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
        Leon.combineItems("H&K VP70 Burst", "Hand Gun Bullets");
        Leon.combineItems("Green Herb", "Red Herb");
        Leon.darkRoom("Film");
        Leon.listInventory();
        Leon.listFiles();
        Leon.itemBoxIn("Mixed Herb G+R");
        Leon.listItemBox();
        Leon.itemBoxOut("Mixed Herb G+R");
        Leon.listItemBox();
        Leon.listInventory();



    }
}