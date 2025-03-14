package InventoryRE.Inventory;

import InventoryRE.Files.File;
import InventoryRE.Key.KeyItem;
import InventoryRE.Key.KeyType;
import InventoryRE.Recovery.RecoveryItem;
import InventoryRE.Weaponry.Ammunition.AmmoType;
import InventoryRE.Weaponry.Ammunition.Ammunition;
import InventoryRE.Weaponry.WeaponParts.Parts;
import InventoryRE.Weaponry.Weapons.ReloadResultRecord;
import InventoryRE.Weaponry.Weapons.Weapon;
import InventoryRE.Weaponry.Knife.Knife;
import InventoryRE.Weaponry.Weapons.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventoryInterface {

    private final List<Item> equipments;
    private final List<Item> itemBox;
    private final List<Item> archive;
    private final List<Item> database;

    private final ItemDatabase itemDatabase;

    Characters characters;

    private Characters getCharacters() {
        return characters;
    }

    private void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Inventory(Characters character) {
        this.equipments = new ArrayList<>();
        this.itemBox = new ArrayList<>();
        this.archive = new ArrayList<>();
        this.database = new ArrayList<>();

        itemDatabase = new ItemDatabase();
        initialize(character);
        //personalizing inventory "interface" only for backend visualizing
        setCharacters(character);

        //WEAPONS
        addToDatabase(itemDatabase.getKNIFE());
        addToDatabase(itemDatabase.getHK_VP70());
        addToDatabase(itemDatabase.getBROWNING_HP());
        addToDatabase(itemDatabase.getREMINGTON_1100P());
        addToDatabase(itemDatabase.getBOW_GUN());
        addToDatabase(itemDatabase.getCOLT_SAA());
        addToDatabase(itemDatabase.getM79_GL());
        addToDatabase(itemDatabase.getMAC11());
        addToDatabase(itemDatabase.getDESERT_EAGLE());
        addToDatabase(itemDatabase.getSPARK_SHOT());
        addToDatabase(itemDatabase.getFLAMETHROWER());
        addToDatabase(itemDatabase.getROCKET_LAUNCHER());
        //CUSTOM WEAPONS
        addToDatabase(itemDatabase.getHK_VP70_BURST());
        addToDatabase(itemDatabase.getREMINGTON_M1100());
        addToDatabase(itemDatabase.getDESERT_EAGLE_CUSTOM());
        // INFINITE WEAPONS
        addToDatabase(itemDatabase.getINFINITE_MAC11());
        addToDatabase(itemDatabase.getINFINITE_ROCKET_LAUNCHER());
        addToDatabase(itemDatabase.getGATLING_GUN());

        // WEAPON PARTS
        addToDatabase(itemDatabase.getHANDGUN_PARTS());
        addToDatabase(itemDatabase.getSHOTGUN_PARTS());
        addToDatabase(itemDatabase.getMAGNUM_PARTS());

        // AMMUNITION
        addToDatabase(itemDatabase.getHANDGUN_BULLETS());
        addToDatabase(itemDatabase.getSHOTGUN_SHELLS());
        addToDatabase(itemDatabase.getBOW_GUN_BOLTS());
        addToDatabase(itemDatabase.getGRENADE_ROUNDS());
        addToDatabase(itemDatabase.getACID_ROUNDS());
        addToDatabase(itemDatabase.getFLAME_ROUNDS());
        addToDatabase(itemDatabase.getMAGNUM_BULLETS());
        addToDatabase(itemDatabase.getMACHINE_GUN_BULLETS());

        // KEY ITEMS
        addToDatabase(itemDatabase.getLIGHTER());
        addToDatabase(itemDatabase.getLOCKPICK());
        addToDatabase(itemDatabase.getADA_PICTURE());
        addToDatabase(itemDatabase.getSHERRY_PICTURE());
        addToDatabase(itemDatabase.getSMALL_KEY());
        addToDatabase(itemDatabase.getINK_RIBBON());
        addToDatabase(itemDatabase.getBLUE_CARD_KEY());
        addToDatabase(itemDatabase.getCABIN_KEY());
        addToDatabase(itemDatabase.getFILM_1());
        addToDatabase(itemDatabase.getFILM_2());
        addToDatabase(itemDatabase.getFILM_3());
        addToDatabase(itemDatabase.getFILM_4());
        addToDatabase(itemDatabase.getUNICORN_MEDAL());
        addToDatabase(itemDatabase.getSPADE_KEY());
        addToDatabase(itemDatabase.getDIAMOND_KEY());
        addToDatabase(itemDatabase.getVIRGIN_HEART());
        addToDatabase(itemDatabase.getVALVE_HANDLE());
        addToDatabase(itemDatabase.getPLASTIC_BOMB());
        addToDatabase(itemDatabase.getDETONATOR());
        addToDatabase(itemDatabase.getHEART_KEY());
        addToDatabase(itemDatabase.getRED_CARD_KEY());
        addToDatabase(itemDatabase.getBOMB_DET());
        addToDatabase(itemDatabase.getSQUARE_CRANK());
        addToDatabase(itemDatabase.getCORD());
        addToDatabase(itemDatabase.getCLUB_KEY());
        addToDatabase(itemDatabase.getKING_PLUG());
        addToDatabase(itemDatabase.getROOK_PLUG());
        addToDatabase(itemDatabase.getKNIGHT_PLUG());
        addToDatabase(itemDatabase.getBISHOP_PLUG());
        addToDatabase(itemDatabase.getEAGLE_STONE());
        addToDatabase(itemDatabase.getSERPENT_STONE());
        addToDatabase(itemDatabase.getBLUE_STONE_LEFT());
        addToDatabase(itemDatabase.getBLUE_STONE_RIGHT());
        addToDatabase(itemDatabase.getJAGUAR_STONE());
        addToDatabase(itemDatabase.getMANHOLE_OPENER());
        addToDatabase(itemDatabase.getGOLD_COGWHEEL());
        addToDatabase(itemDatabase.getEAGLE_MEDAL());
        addToDatabase(itemDatabase.getWOLF_MEDAL());
        addToDatabase(itemDatabase.getWEAPON_BOX_KEY());
        addToDatabase(itemDatabase.getDOWN_KEY());
        addToDatabase(itemDatabase.getUP_KEY());
        addToDatabase(itemDatabase.getFUSE_CASE());
        addToDatabase(itemDatabase.getMAIN_FUSE());
        addToDatabase(itemDatabase.getLAB_CARD_KEY());
        addToDatabase(itemDatabase.getMO_DISK());
        addToDatabase(itemDatabase.getPOWER_ROOM_KEY());
        addToDatabase(itemDatabase.getVACCINE_CART());
        addToDatabase(itemDatabase.getBASE_VACCINE());
        addToDatabase(itemDatabase.getVACCINE());
        addToDatabase(itemDatabase.getG_VIRUS());
        addToDatabase(itemDatabase.getMASTER_KEY());
        addToDatabase(itemDatabase.getPLATFORM_KEY());
        addToDatabase(itemDatabase.getJOINT_N_PLUG());
        addToDatabase(itemDatabase.getJOINT_S_PLUG());
        addToDatabase(itemDatabase.getLOCKER_KEY());

        // RECOVERY ITEMS
        addToDatabase(itemDatabase.getGREEN_HERB());
        addToDatabase(itemDatabase.getRED_HERB());
        addToDatabase(itemDatabase.getBLUE_HERB());
        addToDatabase(itemDatabase.getFIRST_AID_SPRAY());
        addToDatabase(itemDatabase.getMIXED_HERB_GG());
        addToDatabase(itemDatabase.getMIXED_HERB_GR());
        addToDatabase(itemDatabase.getMIXED_HERB_GB());
        addToDatabase(itemDatabase.getMIXED_HERB_GGG());
        addToDatabase(itemDatabase.getMIXED_HERB_GGB());
        addToDatabase(itemDatabase.getMIXED_HERB_GRB());

        // FILES
        addToDatabase(itemDatabase.getPOLICE_MEMORANDUM());
        addToDatabase(itemDatabase.getCHRIS_DIARY());
        addToDatabase(itemDatabase.getMAIL_TO_CHRIS());
        addToDatabase(itemDatabase.getOPERATION_REPORT1());
        addToDatabase(itemDatabase.getMEMO_TO_LEON());
        addToDatabase(itemDatabase.getOPERATION_REPORT2());
        addToDatabase(itemDatabase.getCHIEF_DIARY());
        addToDatabase(itemDatabase.getFILM_A());
        addToDatabase(itemDatabase.getFILM_B());
        addToDatabase(itemDatabase.getFILM_C());
        addToDatabase(itemDatabase.getFILM_D());
        addToDatabase(itemDatabase.getPATROL_REPORT());
        addToDatabase(itemDatabase.getSECRETARY_DIARY_A());
        addToDatabase(itemDatabase.getSECRETARY_DIARY_B());
        addToDatabase(itemDatabase.getWATCHMAN_DIARY());
        addToDatabase(itemDatabase.getMAIL_TO_THE_CHIEF());
        addToDatabase(itemDatabase.getSEWER_MANAGER_FAX());
        addToDatabase(itemDatabase.getSEWER_MANAGE_DIARY());
        addToDatabase(itemDatabase.getLAB_SECURITY_MANUAL());
        addToDatabase(itemDatabase.getP_EPSILON_REPORT());
        addToDatabase(itemDatabase.getUSER_REGISTRATION());
        addToDatabase(itemDatabase.getVACCINE_SYNTHESIS());

    }

    private void initialize(Characters character){
        switch (character) {
            //Leon's standard inventory
            case Characters.LEON -> {
                if (equipments.isEmpty()) {
                    addToInventory(itemDatabase.getLIGHTER());
                    addToInventory(itemDatabase.getHK_VP70());
                    addToInventory(itemDatabase.getKNIFE());
                }
            }
            //Claire's standard inventory
            case Characters.CLAIRE -> {
                if (equipments.isEmpty()) {
                    addToInventory(itemDatabase.getLOCKPICK());
                    addToInventory(itemDatabase.getBROWNING_HP());
                    addToInventory(itemDatabase.getKNIFE());
                }
            }
            //Ada's standard inventory
            case Characters.ADA -> {
                if (equipments.isEmpty()) {
                    Ammunition initialAmmo = itemDatabase.getHANDGUN_BULLETS();
                    initialAmmo.setQuantity(initialAmmo.updateQuantity(initialAmmo.getQuantity(), 3));
                    addToInventory(itemDatabase.getADA_PICTURE());
                    addToInventory(itemDatabase.getBROWNING_HP());
                    addToInventory(initialAmmo);
                    addToInventory(itemDatabase.getFIRST_AID_SPRAY());
                }
            }
            //Sherry's standard inventory
            case Characters.SHERRY -> {
                if (equipments.isEmpty()) {
                    addToInventory(itemDatabase.getSHERRY_PICTURE());
                    addToInventory(itemDatabase.getFIRST_AID_SPRAY());
                }
            }
        }
    }

    private void addToDatabase(Item item){
        database.add(item);
    }

    private Item getFromDatabase(Item itemToGet){
        for (Item item : database) {
            if (item.getId().equals(itemToGet.getId())) {
                return item;
            }
        }
        return null;
    }

    private void addToInventory(Item item) {
        equipments.add(item);
    }

    //private because technically you should be able to remove an item from your inventory only by using it or by sending it to the item box
    private void removeFromInventory(Item item){
        equipments.remove(item);
    }

    private void addToFiles(Item item) {
        archive.add(item);
    }

    private void addToItemBox(Item item){
        itemBox.add(item);
    }

    private void removeFromItemBox(Item item){
        itemBox.remove(item);
    }

    public void listInventory(){
        System.out.println("\n---------------------------------------------------------"+ this.getCharacters() + " | INVENTORY--------------------------------------------------------\n");
        for (Item item : equipments) {
                System.out.println(item);
        }
    }

    public void listFiles(){
        System.out.println("\n-----------------------------------------------------------"+ this.getCharacters() + " | FILES----------------------------------------------------------\n");
        for (Item item : archive) {
            System.out.println(item);
        }
    }

    public void listItemBox(){
        System.out.println("\n----------------------------------------------------------"+ this.getCharacters() + " | ITEM BOX--------------------------------------------------------\n");
        for (Item item : itemBox){
                System.out.println(item);
        }
    }

    private Item getItemById (Item itemToSearch, boolean searchItemBox) {
        List<Item> targetList = searchItemBox ? itemBox : equipments;
        for (Item item : targetList) {
            if (item != null && item.getId().equals(itemToSearch.getId())) {
                return item;
            }
        }
        return null;
    }

    private Item getFile (Item item) {
        for (Item file : archive) {
            if (file != null && file.getId().equals(item.getId())){
                return file;
            }
        }
        return null;
    }

    @Override
    public void collectItem(Boolean confirm, Item itemToCollect) {
        Item item = getFromDatabase(itemToCollect);
        switch (item) {
            case null -> System.out.println("Item not found");
            case Ammunition ammo -> {
                for (Item inventoryItem : equipments) {
                    if (inventoryItem instanceof Ammunition && inventoryItem.getName().equals(ammo.getName())) {
                        switch (ammo.getAmmoType()) {
                            case AmmoType.HANDGUN_BULLETS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 15);
                            case AmmoType.SHOTGUN_SHELLS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 7);
                            case AmmoType.BOWGUN_BOLTS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 18);
                            case AmmoType.GRENADE_ROUNDS, AmmoType.ACID_ROUNDS, AmmoType.FLAME_ROUNDS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 6);
                            case AmmoType.MAGNUM_BULLETS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 8);
                            case AmmoType.MACHINEGUN_BULLETS -> ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 100);
                        }
                        return;
                    }
                }
                addToInventory(ammo);
            }
            case KeyItem inkRibbon -> {
                for (Item inventoryItem : equipments) {
                    if (inventoryItem instanceof KeyItem) {
                        if (((KeyItem) inventoryItem).getTypeKey() == KeyType.INK_RIBBON) {
                            ((KeyItem) inventoryItem).setQuantity(((KeyItem) inventoryItem).getQuantity() + 3); //standard ink ribbon quantity
                            return;
                        }
                    }
                }
                addToInventory(inkRibbon);
            }
            case File file -> addToFiles(file);
            default -> addToInventory(item);
        }
    }

    //TODO: create method that hold item 1's position and sets item created to it
    @Override
    public void combineItems(Item itemA, Item itemB) {
        Item item1 = getItemById(itemA, false);
        Item item2 = getItemById(itemB, false);

        if (item1 instanceof RecoveryItem herb1 && item2 instanceof RecoveryItem herb2) {
            RecoveryItem combinedHerb = herb1.mixHerb(herb2);
            if (combinedHerb != null) {
                this.removeFromInventory(item1);
                this.removeFromInventory(item2);
                addToInventory(combinedHerb);
                System.out.println("\nHerbs combined successfully!");
            }
        } else if (item1 instanceof Weapon && item2 instanceof Ammunition || item1 instanceof Ammunition && item2 instanceof Weapon) {
            Weapon weapon = (item1 instanceof Weapon) ? (Weapon) item1 : (Weapon) item2;
            Ammunition ammo = (item1 instanceof Ammunition) ? (Ammunition) item1 : (Ammunition) item2;

            ReloadResultRecord reloadResult = weapon.reloadWeapon(ammo);
            Ammunition returnedAmmo = reloadResult.returnedAmmo();
            if (returnedAmmo != null) {
                boolean ammoAdded = false;
                for (Item item : equipments) {
                    if (item instanceof Ammunition inventoryAmmo) {
                        if (inventoryAmmo.getAmmoType() == returnedAmmo.getAmmoType()) {
                            inventoryAmmo.setQuantity(inventoryAmmo.getQuantity() + returnedAmmo.getQuantity());
                            ammoAdded = true;
                            break;
                        }
                    }
                }
                if (!ammoAdded) {
                    addToInventory(returnedAmmo);
                }
            }
            if (weapon.getTypeWeapon() != WeaponType.INFINITE_WEAPON) {
                if (ammo.getQuantity() <= 0) {
                    this.removeFromInventory(ammo);
                }
            }
        } else if (item1 instanceof Weapon && item2 instanceof Parts || item1 instanceof Parts && item2 instanceof Weapon) {
            Weapon weapon = (item1 instanceof Weapon) ? (Weapon) item1 : (Weapon) item2;
            Parts parts = (item1 instanceof Parts) ? (Parts) item1 : (Parts) item2;
            Weapon customWeapon = weapon.upgradeWeapon(parts);
            if (customWeapon != null) {
                this.removeFromInventory(parts);
                this.removeFromInventory(weapon);
                addToInventory(customWeapon);
                System.out.println("\nWeapon customized successfully!");
            } else {
                System.out.println("\nThere is no need to combine these.");
            }
        } else if (item1 instanceof KeyItem key1 && item2 instanceof KeyItem key2) {
            KeyItem combinedKeyItem = key1.combineKeyItems(key2);
            if (combinedKeyItem != null) {
                this.removeFromInventory(item1);
                this.removeFromInventory(item2);
                addToInventory(combinedKeyItem);
                System.out.println("\nItems combined successfully!");
            } else {
                System.out.println("\nThere is no need to combine these.");
            }
        } else {
            System.out.println("\nCannot combine these items.");
        }
    }

    @Override
    public void itemBoxIn(Item item){
        Item itemToStorage = getItemById(item, false);
        if (itemToStorage != null) {
            addToItemBox(itemToStorage);
            removeFromInventory(itemToStorage);
        } else {
            System.out.println("\nError: item not found.");
        }
    }

    @Override
    public void itemBoxOut(Item item){
        Item itemToGetFromStorage = getItemById(item, true);
        if(itemToGetFromStorage != null) {
            addToInventory(itemToGetFromStorage);
            removeFromItemBox(itemToGetFromStorage);
        } else {
            System.out.println("\nError: item not found.");
        }
    }

    //fires a weapon and calculates ammo use with fireCount()
    @Override
    public void useWeapon(Item itemWeapon, int count){
        if (count == 0) {
            count = 1;
        }
        Item item = getItemById(itemWeapon, false);
        switch (item) {
            case null -> System.out.println("\nWeapon not found");
            case Weapon weaponInUse -> weaponInUse.fireCount(itemWeapon.getName(), count);
            case Knife knifeInUse -> knifeInUse.swingCount(itemWeapon.getName(), count);
            default -> {
            }
        }
    }

    @Override
    public void readFile(Item item){
        Item file = getFile(item);
        if (file != null){
            if (file instanceof File fileToRead){
                System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(fileToRead.getDescription());
            }
        } else {
            System.out.println("\nError: file not found.");
        }
    }

    //method to develop films
    @Override
    public void darkRoom(Item film){
        Item item = getItemById(film, false);
        if (item instanceof KeyItem filmToDevelop) {
            if (filmToDevelop.getTypeKey() == KeyType.FILM) {
                File developedFile = filmToDevelop.developFilm(filmToDevelop);
                if (developedFile != null) {
                    addToFiles(developedFile);
                    removeFromInventory(filmToDevelop);
                    readFile(developedFile);
                }
            }
        }
    }

}