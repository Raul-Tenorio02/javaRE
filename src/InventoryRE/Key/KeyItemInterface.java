package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Inventory.Item;

public interface KeyItemInterface {

    File developFilm(int filmID);
    KeyItem combineKeyItems(Item otherKeyItem);

}
