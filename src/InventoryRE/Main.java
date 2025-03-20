package InventoryRE;

import InventoryRE.Item.ItemDatabase;

import static InventoryRE.Inventory.Inventory.Claire;
import static InventoryRE.Inventory.Inventory.Leon;
import static InventoryRE.Inventory.Inventory.Ada;
import static InventoryRE.Inventory.Inventory.Sherry;

public class Main {

    /*                          OG Resident Evil 2's Inventory

        This project's purpose is to represent Classic Resident Evil 2's inventory main features
        by using Object-Oriented Programing, Data Structure, some Java build-in features etc.
        More information on README.

                                            Enjoy :)

        author: Raul-Tenorio02 on GitHub
    */

    public static void main(String[] args) {

        ItemDatabase db = new ItemDatabase();

        Leon.listInventory();
        Claire.listInventory();
        Ada.listInventory();
        Sherry.listInventory();

    }
}