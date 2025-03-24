package InventoryRE.Items.Key;

import InventoryRE.Items.Files.File;

public interface KeyItemInterface {

    File developFilm(KeyItem keyItem);
    KeyItem combineKeyItems(KeyItem otherKeyItem);

}
