package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Inventory.Item;

public interface KeyItemInterface {

    File developFilm(KeyItem keyItem);
    KeyItem combineKeyItems(Item otherKeyItem);

}
