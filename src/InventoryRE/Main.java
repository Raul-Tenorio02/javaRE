package InventoryRE;

import InventoryRE.Inventory.Characters;
import InventoryRE.Inventory.Inventory;
import InventoryRE.Inventory.ItemDatabase;

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
        Inventory Leon = new Inventory(Characters.LEON);
        Inventory Claire = new Inventory(Characters.CLAIRE);
        Inventory Ada = new Inventory(Characters.ADA);
        Inventory Sherry = new Inventory(Characters.SHERRY);

        Leon.collectItem(true, db.getMEMO_TO_LEON());
        Leon.readFile(db.getMEMO_TO_LEON());

    }
}