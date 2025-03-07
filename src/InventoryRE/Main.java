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

        ItemDatabase<Item> Leon = new ItemDatabase<>();
        ItemDatabase<Item> Claire = new ItemDatabase<>();

        Leon.collectItem(true, "H&K VP70");
        Leon.collectItem(true, "Hand Gun Parts");
        Leon.collectItem(true, "Hand Gun Bullets");
        Leon.collectItem(true, "Green Herb");
        Leon.collectItem(true, "Red Herb");
        Leon.collectItem(true, "Film A");
        Leon.collectItem(true, "Police Memorandum");
        Leon.collectItem(true, "Chris's Diary");
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
        Leon.darkRoom("Film A");
        Leon.listInventory();
        Leon.listFiles();
        Leon.itemBoxIn("Mixed Herb G+R");
        Leon.listItemBox();

    }
}