package InventoryRE.Item.Key;

import InventoryRE.Item.Files.File;
import InventoryRE.Item.Item;

public interface KeyItemInterface {

    File developFilm(KeyItem keyItem);
    KeyItem combineKeyItems(Item otherKeyItem);

}
