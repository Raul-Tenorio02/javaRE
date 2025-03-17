package InventoryRE.Item.Recovery;

import InventoryRE.Item.Item;
import InventoryRE.Item.ItemDatabase;
import InventoryRE.Item.ItemType;

import java.util.*;

public class RecoveryItem extends Item implements MixInterface {

    private final RecoveryType typeRecovery;

    ItemDatabase itemDatabase = new ItemDatabase();

    public RecoveryItem(Long id, String name, String description, ItemType type, RecoveryType typeRecovery) {
        super(id, name, description, type);
        this.typeRecovery = typeRecovery;
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getDescription()
                + "}";
    }

    @Override
    public RecoveryItem mixHerb(RecoveryItem otherHerb) {
        if (this.getType() != ItemType.RECOVERY && otherHerb.getType() != ItemType.RECOVERY) {
            System.out.println("\nThere is no need of mixing these.");
            return null;
    }
        Map<Set<RecoveryType>, RecoveryItem> herbMixes = new HashMap<>();
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GREEN, RecoveryType.GREEN)), itemDatabase.getMIXED_HERB_GG());
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GG, RecoveryType.GREEN)), itemDatabase.getMIXED_HERB_GGG());
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GREEN, RecoveryType.RED)), itemDatabase.getMIXED_HERB_GR());
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GREEN, RecoveryType.BLUE)), itemDatabase.getMIXED_HERB_GB());
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GG, RecoveryType.BLUE)), itemDatabase.getMIXED_HERB_GGB());
        herbMixes.put(new HashSet<>(Arrays.asList(RecoveryType.GR, RecoveryType.BLUE)), itemDatabase.getMIXED_HERB_GRB());

        Set<RecoveryType> herbTypes = new HashSet<>(Arrays.asList(this.typeRecovery, otherHerb.typeRecovery));

        if (herbMixes.containsKey(herbTypes)) {
            return herbMixes.get(herbTypes);
        }
        System.out.println("\nThere is no need of mixing these.");
        return null;
    }

}
