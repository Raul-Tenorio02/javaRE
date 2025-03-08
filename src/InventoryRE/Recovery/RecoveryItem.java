package InventoryRE.Recovery;

import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemDatabase;
import InventoryRE.Inventory.ItemType;

public class RecoveryItem extends Item implements MixInterface {

    RecoveryType typeRecovery;

    public RecoveryItem(String name, String description, ItemType type, RecoveryType typeRecovery) {
        super(name, description, type);
        this.typeRecovery = typeRecovery;
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getDescription()
                + "}";
    }

    @Override
    public RecoveryItem mixHerb(RecoveryItem otherHerb) { // setting herb items to be combined
        if (this.getType() == ItemType.RECOVERY && otherHerb.getType() == ItemType.RECOVERY) {
            if (this.typeRecovery == RecoveryType.GREEN && otherHerb.typeRecovery == RecoveryType.GREEN) {
                return ItemDatabase.MIXED_HERB_GG;
            } else if (this.typeRecovery == RecoveryType.GG && otherHerb.typeRecovery == RecoveryType.GREEN || typeRecovery == RecoveryType.GREEN && otherHerb.typeRecovery == RecoveryType.GG) {
                return ItemDatabase.MIXED_HERB_GGG;
            } else if (this.typeRecovery == RecoveryType.GREEN && otherHerb.typeRecovery == RecoveryType.RED || typeRecovery == RecoveryType.RED && otherHerb.typeRecovery == RecoveryType.GREEN) {
                return ItemDatabase.MIXED_HERB_GR;
            } else if (this.typeRecovery == RecoveryType.GREEN && otherHerb.typeRecovery == RecoveryType.BLUE || typeRecovery == RecoveryType.BLUE && otherHerb.typeRecovery == RecoveryType.GREEN) {
                return ItemDatabase.MIXED_HERB_GB;
            } else if (this.typeRecovery == RecoveryType.GG && otherHerb.typeRecovery == RecoveryType.BLUE || typeRecovery == RecoveryType.BLUE && otherHerb.typeRecovery == RecoveryType.GG) {
                return ItemDatabase.MIXED_HERB_GGB;
            } else if (this.typeRecovery == RecoveryType.GR && otherHerb.typeRecovery == RecoveryType.BLUE || typeRecovery == RecoveryType.BLUE && otherHerb.typeRecovery == RecoveryType.GR || typeRecovery == RecoveryType.GB && otherHerb.typeRecovery == RecoveryType.RED || typeRecovery == RecoveryType.RED && otherHerb.typeRecovery == RecoveryType.GB) {
                return ItemDatabase.MIXED_HERB_GRB;
            }
        } else {
            System.out.println("There is no need of mixing these.\n");
        }
        return null;
    }

}
