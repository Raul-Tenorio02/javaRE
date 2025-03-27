package InventoryRE.Inventories;

import InventoryRE.Items.Files.File;
import InventoryRE.Items.Item;
import InventoryRE.Items.ItemDatabase;
import InventoryRE.Items.Key.KeyItem;
import InventoryRE.Items.Key.KeyType;
import InventoryRE.Items.Recovery.RecoveryItem;
import InventoryRE.Items.Weaponry.Ammunition.AmmoType;
import InventoryRE.Items.Weaponry.Ammunition.Ammunition;
import InventoryRE.Items.Weaponry.WeaponParts.Parts;
import InventoryRE.Items.Weaponry.Weapons.ReloadRecord;
import InventoryRE.Items.Weaponry.Weapons.Weapon;
import InventoryRE.Items.Weaponry.Knife.Knife;
import InventoryRE.Items.Weaponry.Weapons.WeaponType;

import java.util.*;

public class Inventory {

    private final List<Item> equipments;
    private final List<Item> itemBox;
    private final List<Item> archive;
    private final List<Item> database;
    private final ItemDatabase itemDatabase;
    private Characters characters;

    private Characters getCharacters() {
        return characters;
    }

    private void setCharacters(Characters characters) {
        this.characters = characters;
    }

    private Weapon equipWeapon(Weapon equippedWeapon) {
        return equippedWeapon;
    }

    private void addToDatabase(Item item){
        database.add(item);
    }

    private void addAllToDatabase(List<Item> items) {
        items.forEach(this::addToDatabase);
    }

    private Optional<Item> getFromDatabase(int itemToGet){
        return database.stream()
                .filter(item -> Objects.equals(item.getId(), itemToGet))
                .findFirst();
    }

    private void addToInventory(Item item) {
        if (equipments.size() >= 8) {
            System.out.println("\nYou cannot carry any more items.");
            return;
        }
        equipments.add(item);
    }

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

    private void printList(String title, List<Item> items) {
        System.out.println("\n---------------------------------------------------------"+ title + "--------------------------------------------------------\n");
        items.forEach(item -> System.out.println("ID: " + item.getId() + " " + item));
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    private void listInventory(){
        printList(getCharacters() + " | INVENTORY", equipments);
    }

    private void listFiles(){
        printList(getCharacters() + " | FILES", archive);
    }

    private void listItemBox(){
        printList(getCharacters() + " | ITEM BOX", itemBox);
    }

    private void listDatabase(){
        printList("ITEM DATABASE", database);
    }

    private Item getItemById (int itemToSearch) {
        return equipments.stream()
                .filter(item -> item != null && Objects.equals(item.getId(), itemToSearch))
                .findFirst()
                .orElse(null);
    }

    private Item getFileById (int item) {
        return archive.stream()
                .filter(file -> file != null && Objects.equals(file.getId(), item))
                .findFirst()
                .orElse(null);
    }

    public static Inventory Leon = new Inventory(Characters.LEON);
    public static Inventory Claire = new Inventory(Characters.CLAIRE);
    public static Inventory Ada = new Inventory(Characters.ADA);
    public static Inventory Sherry = new Inventory(Characters.SHERRY);

    public Inventory(Characters character) {
        this.equipments = new ArrayList<>();
        this.itemBox = new ArrayList<>();
        this.archive = new ArrayList<>();
        this.database = new ArrayList<>();
        itemDatabase = new ItemDatabase();

        initialize(character);
        setCharacters(character);

        addAllToDatabase(
                List.of(
                        //WEAPONS
                        itemDatabase.getKNIFE(), itemDatabase.getHK_VP70(), itemDatabase.getBROWNING_HP(),
                        itemDatabase.getREMINGTON_1100P(), itemDatabase.getBOW_GUN(), itemDatabase.getCOLT_SAA(),
                        itemDatabase.getM79_GL(), itemDatabase.getMAC11(), itemDatabase.getDESERT_EAGLE(),
                        itemDatabase.getSPARK_SHOT(), itemDatabase.getFLAMETHROWER(), itemDatabase.getROCKET_LAUNCHER(),
                        //custom weapons are declared in Weapon Class

                        //INFINITE WEAPONS
                        itemDatabase.getINFINITE_MAC11(), itemDatabase.getINFINITE_ROCKET_LAUNCHER(), itemDatabase.getGATLING_GUN(),

                        //WEAPON PARTS
                        itemDatabase.getHANDGUN_PARTS(), itemDatabase.getSHOTGUN_PARTS(), itemDatabase.getMAGNUM_PARTS(),

                        //AMMUNITION
                        itemDatabase.getHANDGUN_BULLETS(), itemDatabase.getSHOTGUN_SHELLS(), itemDatabase.getBOW_GUN_BOLTS(),
                        itemDatabase.getGRENADE_ROUNDS(), itemDatabase.getACID_ROUNDS(), itemDatabase.getFLAME_ROUNDS(),
                        itemDatabase.getMAGNUM_BULLETS(), itemDatabase.getMACHINE_GUN_BULLETS(),

                        //KEY ITEMS
                        itemDatabase.getLIGHTER(), itemDatabase.getLOCKPICK(), itemDatabase.getADA_PICTURE(), itemDatabase.getSHERRY_PICTURE(),
                        itemDatabase.getSMALL_KEY(), itemDatabase.getINK_RIBBON(), itemDatabase.getBLUE_CARD_KEY(),
                        itemDatabase.getCABIN_KEY(), itemDatabase.getFILM_1(), itemDatabase.getFILM_2(), itemDatabase.getFILM_3(),
                        itemDatabase.getFILM_4(), itemDatabase.getUNICORN_MEDAL(), itemDatabase.getSPADE_KEY(),
                        itemDatabase.getDIAMOND_KEY(), itemDatabase.getVIRGIN_HEART(), itemDatabase.getVALVE_HANDLE(),
                        itemDatabase.getPLASTIC_BOMB(), itemDatabase.getDETONATOR(), itemDatabase.getHEART_KEY(),
                        itemDatabase.getRED_CARD_KEY(), itemDatabase.getSQUARE_CRANK(), itemDatabase.getCORD(),
                        itemDatabase.getCLUB_KEY(), itemDatabase.getKING_PLUG(), itemDatabase.getROOK_PLUG(),
                        itemDatabase.getKNIGHT_PLUG(), itemDatabase.getBISHOP_PLUG(), itemDatabase.getEAGLE_STONE(),
                        itemDatabase.getSERPENT_STONE(), itemDatabase.getBLUE_STONE_LEFT(), itemDatabase.getBLUE_STONE_RIGHT(),
                        itemDatabase.getMANHOLE_OPENER(), itemDatabase.getGOLD_COGWHEEL(), itemDatabase.getEAGLE_MEDAL(),
                        itemDatabase.getWOLF_MEDAL(), itemDatabase.getWEAPON_BOX_KEY(), itemDatabase.getDOWN_KEY(),
                        itemDatabase.getUP_KEY(), itemDatabase.getFUSE_CASE(), itemDatabase.getMAIN_FUSE(),
                        itemDatabase.getLAB_CARD_KEY(), itemDatabase.getMO_DISK(), itemDatabase.getPOWER_ROOM_KEY(),
                        itemDatabase.getVACCINE_CART(), itemDatabase.getBASE_VACCINE(), itemDatabase.getVACCINE(),
                        itemDatabase.getG_VIRUS(), itemDatabase.getMASTER_KEY(), itemDatabase.getPLATFORM_KEY(),
                        itemDatabase.getJOINT_N_PLUG(), itemDatabase.getJOINT_S_PLUG(), itemDatabase.getLOCKER_KEY(),

                        //RECOVERY ITEMS
                        itemDatabase.getGREEN_HERB(), itemDatabase.getRED_HERB(),
                        itemDatabase.getBLUE_HERB(), itemDatabase.getFIRST_AID_SPRAY(),

                        //FILES
                        itemDatabase.getPOLICE_MEMORANDUM(), itemDatabase.getCHRIS_DIARY(), itemDatabase.getMAIL_TO_CHRIS(),
                        itemDatabase.getOPERATION_REPORT1(), itemDatabase.getMEMO_TO_LEON(), itemDatabase.getOPERATION_REPORT2(),
                        itemDatabase.getCHIEF_DIARY(), itemDatabase.getPATROL_REPORT(), itemDatabase.getSECRETARY_DIARY_A(),
                        itemDatabase.getSECRETARY_DIARY_B(), itemDatabase.getWATCHMAN_DIARY(), itemDatabase.getMAIL_TO_THE_CHIEF(),
                        itemDatabase.getSEWER_MANAGER_FAX(), itemDatabase.getSEWER_MANAGE_DIARY(), itemDatabase.getLAB_SECURITY_MANUAL(),
                        itemDatabase.getP_EPSILON_REPORT(), itemDatabase.getUSER_REGISTRATION(), itemDatabase.getVACCINE_SYNTHESIS()
                )
        );
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

    public void startCLI() {
        Scanner scanner = new Scanner(System.in);
        Inventory characterInUse = null;
        Weapon equippedWeapon = null;

        switch (this.getCharacters()) {
            case CLAIRE -> characterInUse = Claire;
            case LEON -> characterInUse = Leon;
            case ADA -> characterInUse = Ada;
            case SHERRY -> characterInUse = Sherry;
        }

        int opt_set1 = 0;
        if (this.equals(Leon) || this.equals(Claire) || this.equals(Ada)) {
            while (opt_set1 != 6) {
                System.out.println("\nWhat do you want to do next?");
                System.out.println("1. Open Inventory");
                System.out.println("2. Open Item Box");
                System.out.println("3. Collect items");
                System.out.println("4. Fire a weapon.");
                System.out.println("5. Exit");
                System.out.print("Type here: ");
                opt_set1 = scanner.nextInt();
                scanner.nextLine();
                switch (opt_set1) {
                    case 1:
                        if (characterInUse != null) {
                            characterInUse.listInventory();
                            int opt_set2 = 0;
                            while (opt_set2 != 4) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Open File section.");
                                System.out.println("2. Equip weapon.");
                                System.out.println("3. Combine items.");
                                System.out.println("4. Reveal a file's content.");
                                System.out.println("5. Return.");
                                System.out.print("Type here: ");
                                opt_set2 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_set2) {
                                    case 1:
                                        System.out.println("\nWhich weapon do you want to equip?");
                                        System.out.print("Type here (ID): ");
                                        int opt_gun = scanner.nextInt();
                                        scanner.nextLine();
                                        equippedWeapon = characterInUse.equipWeapon((Weapon) getItemById(opt_gun));
                                        break;
                                    case 2:
                                        System.out.println("\nSelect items to combine (ID).");
                                        System.out.print("Item 1: ");
                                        int item1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.print("Item 2: ");
                                        int item2 = scanner.nextInt();
                                        scanner.nextLine();
                                        characterInUse.combineItems(item1, item2);
                                        characterInUse.listInventory();
                                        break;
                                    case 3:
                                        System.out.println("\n---------------------------DARK ROOM--------------------------");
                                        System.out.println("Choose a file to develop (ID)");
                                        System.out.print("Type here: ");
                                        int fileToReveal = scanner.nextInt();
                                        scanner.nextLine();
                                        characterInUse.darkRoom(fileToReveal);
                                        break;
                                    case 4:
                                        characterInUse.listFiles();
                                        int opt_set3 = 0;
                                        while (opt_set3 != 2) {
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Read a file.");
                                            System.out.println("2. Return.");
                                            System.out.print("Type here: ");
                                            opt_set3 = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_set3) {
                                                case 1:
                                                    System.out.println("\nChoose a file (ID): ");
                                                    System.out.print("Type here: ");
                                                    int fileToRead = scanner.nextInt();
                                                    scanner.nextLine();
                                                    characterInUse.readFile(fileToRead);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        break;
                                }
                            }
                        }
                        break;
                    case 2:
                        if (characterInUse != null) {
                            characterInUse.listItemBox();
                            int opt_itemBox = 0;
                            while (opt_itemBox != 3) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Storage Item.");
                                System.out.println("2. Retrieve Item.");
                                System.out.println("3. Return.");
                                System.out.print("Type here: ");
                                opt_itemBox = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_itemBox) {
                                    case 1:
                                        characterInUse.listInventory();
                                        System.out.println("\nSelect an item to storage (ID).");
                                        System.out.print("Type here: ");
                                        int itemToStorage = scanner.nextInt();
                                        scanner.nextLine();
                                        characterInUse.itemBoxTransfer(itemToStorage, true);
                                        characterInUse.listItemBox();
                                        break;
                                    case 2:
                                        characterInUse.listItemBox();
                                        System.out.println("\nSelect an item to retrieve (ID).");
                                        System.out.print("Type here: ");
                                        int itemToRetrieve = scanner.nextInt();
                                        scanner.nextLine();
                                        characterInUse.itemBoxTransfer(itemToRetrieve, false);
                                        characterInUse.listInventory();
                                        break;
                                    case 3:
                                        break;
                                }
                            }
                        }
                        break;
                    case 3:
                        if (characterInUse != null) {
                        characterInUse.listDatabase();
                        System.out.println("\nSelect an item to collect (ID).");
                        System.out.print("Type here: ");
                        int itemToCollect = scanner.nextInt();
                        scanner.nextLine();
                        characterInUse.collectItem(itemToCollect);
                        characterInUse.listInventory();
                        }
                        break;
                    case 4:
                        if (equippedWeapon == null) {
                            System.out.println("\nYou're not equipped with any weapons.");
                        } else {
                            int stopFire = 0;
                            while (stopFire != 2) {
                                characterInUse.useWeapon(equippedWeapon.getId());
                                System.out.println("Keep firing?");
                                System.out.println("1. Yes.");
                                System.out.println("2. No.");
                                System.out.print("Type here: ");
                                stopFire = scanner.nextInt();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("\nReturning to Main Menu...");
                        break;
                    default:
                        System.out.println("\nPlease, insert a valid option.");
                        break;
                }
            }
        } else {
            while (opt_set1 != 5) {
                System.out.println("\nWhat do you want to do next?");
                System.out.println("1. Open Inventory");
                System.out.println("2. Collect items");
                System.out.println("3. Exit");
                opt_set1 = scanner.nextInt();
                scanner.nextLine();
                switch (opt_set1) {
                    case 1:
                        Sherry.listInventory();
                        int opt_set2 = 0;
                        while (opt_set2 != 2) {
                            System.out.println("\nWhat do you want to do next?");
                            System.out.println("1. Combine items.");
                            System.out.println("2. Open File Section.");
                            System.out.println("3. Return.");
                            System.out.print("Type here: ");
                            opt_set2 = scanner.nextInt();
                            scanner.nextLine();
                            switch (opt_set2) {
                                case 1:
                                    System.out.println("\nSelect items to combine (ID).");
                                    System.out.print("Item 1: ");
                                    int item1 = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Item 2: ");
                                    int item2 = scanner.nextInt();
                                    scanner.nextLine();
                                    Sherry.combineItems(item1, item2);
                                    Sherry.listInventory();
                                    break;
                                case 2:
                                    Sherry.listFiles();
                                    int opt_set3 = 0;
                                    while (opt_set3 != 2) {
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Read a file.");
                                        System.out.println("2. Return.");
                                        System.out.print("Type here: ");
                                        opt_set3 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_set3) {
                                            case 1:
                                                System.out.println("\nChoose a file (ID): ");
                                                System.out.print("Type here: ");
                                                int fileToRead = scanner.nextInt();
                                                scanner.nextLine();
                                                Sherry.readFile(fileToRead);
                                                break;
                                            case 2:
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    break;
                            }
                        }
                        break;
                    case 2:
                        Sherry.listDatabase();
                        System.out.println("\nSelect an item to collect (ID).");
                        System.out.print("Type here: ");
                        int itemToCollect = scanner.nextInt();
                        scanner.nextLine();
                        Sherry.collectItem(itemToCollect);
                        Sherry.listInventory();
                        break;
                    case 3:
                        System.out.println("\nReturning to Main Menu...");
                        break;
                    default:
                        System.out.println("\nPlease, insert a valid option.");
                        break;
                }
            }
        }
    }

    private void collectItem(int itemToCollect) {
        getFromDatabase(itemToCollect).ifPresentOrElse(
                item -> {
                    switch (item) {
                        case Ammunition ammo -> stackAmmo(ammo);
                        case KeyItem inkRibbon -> stackInkRibbon(inkRibbon);
                        case File file -> addToFiles(file);
                        default -> addToInventory(item);
                    }
                    },
                () -> System.out.println("Item not found")
        );
    }

    private void stackAmmo(Ammunition ammo) {
        equipments.stream()
                .filter(inventoryItem -> inventoryItem instanceof Ammunition && inventoryItem.getName().equals(ammo.getName()))
                .findFirst()
                .ifPresentOrElse(inventoryItem -> {
                        Ammunition inventoryAmmo = (Ammunition) inventoryItem;
                        updateAmmo(inventoryAmmo, ammo.getAmmoType());
                        }, () -> addToInventory(ammo));
    }

    private void updateAmmo(Ammunition inventoryAmmo, AmmoType ammoType) {
        int quantityToAdd = switch (ammoType) {
            case HANDGUN_BULLETS -> 15;
            case SHOTGUN_SHELLS -> 7;
            case BOWGUN_BOLTS -> 18;
            case GRENADE_ROUNDS, ACID_ROUNDS, FLAME_ROUNDS -> 6;
            case MAGNUM_BULLETS -> 8;
            case MACHINEGUN_BULLETS -> 100;
        };
        inventoryAmmo.setQuantity(inventoryAmmo.getQuantity() + quantityToAdd);
    }

    private void stackInkRibbon(KeyItem keyItem) {
        equipments.stream()
                .filter(inventoryItem -> inventoryItem instanceof KeyItem)
                .map(inventoryItem -> (KeyItem) inventoryItem)
                .filter(key -> key.getTypeKey() == KeyType.INK_RIBBON)
                .findFirst()
                .ifPresentOrElse(inventoryItem -> inventoryItem.setQuantity(inventoryItem.getQuantity() + 3),
                        () -> addToInventory(keyItem));
    }

    //TODO: create method that hold item 1's position and sets item created to it
    private void combineItems(int itemA, int itemB) {
        Item item1 = getItemById(itemA);
        Item item2 = getItemById(itemB);
        if (item1 instanceof RecoveryItem herb1 && item2 instanceof RecoveryItem herb2) {
            combineHerbs(herb1, herb2);
        } else if (item1 instanceof Weapon && item2 instanceof Ammunition || item1 instanceof Ammunition && item2 instanceof Weapon) {
            combineWeaponWithAmmo(item1, item2);
        } else if (item1 instanceof Weapon && item2 instanceof Parts || item1 instanceof Parts && item2 instanceof Weapon) {
           combineWeaponWithParts(item1, item2);
        } else if (item1 instanceof KeyItem keyItem1 && item2 instanceof KeyItem keyItem2) {
            craftKeyItems(keyItem1, keyItem2);
        } else {
            System.out.println("\nCannot combine these items.");
        }
    }

    private void combineHerbs(RecoveryItem herb1, RecoveryItem herb2) {
        RecoveryItem combinedHerb = herb1.mixHerb(herb2);
        if (combinedHerb != null) {
            this.removeFromInventory(herb1);
            this.removeFromInventory(herb2);
            addToInventory(combinedHerb);
            System.out.println("\nHerbs combined successfully!");
        }
    }

    private void combineWeaponWithAmmo(Item item1, Item item2) {
        //treating casting exception
        if (item1 instanceof Weapon && item2 instanceof Ammunition || item1 instanceof Ammunition && item2 instanceof Weapon) {
            Weapon weapon = (item1 instanceof Weapon) ? (Weapon) item1 : (Weapon) item2;
            Ammunition ammo = (item1 instanceof Ammunition) ? (Ammunition) item1 : (Ammunition) item2;
            ReloadRecord reloadResult = weapon.reloadWeapon(ammo);
            Ammunition returnedAmmo = reloadResult.returnedAmmo();
            if (returnedAmmo != null) {
                updateInventoryAmmo(returnedAmmo);
            }
            if (weapon.getTypeWeapon() != WeaponType.INFINITE_WEAPON && ammo.getQuantity() <= 0) {
                this.removeFromInventory(ammo);
            }
        }
    }

    private void updateInventoryAmmo(Ammunition returnedAmmo) {
        equipments.stream()
                .filter(item -> item instanceof Ammunition && ((Ammunition) item).getAmmoType() == returnedAmmo.getAmmoType())
                .peek(item -> ((Ammunition) item).setQuantity(((Ammunition) item).getQuantity() + returnedAmmo.getQuantity()))
                .findFirst()
                .orElseGet(() -> {
                    addToInventory(returnedAmmo);
                    return returnedAmmo;
                });
    }

    private void combineWeaponWithParts(Item item1, Item item2) {
        //treating casting exception
        if (item1 instanceof Weapon && item2 instanceof Parts || item1 instanceof Parts && item2 instanceof Weapon) {
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
        }
    }

    private void craftKeyItems(KeyItem item1, KeyItem item2) {
        KeyItem combinedKeyItem = item1.combineKeyItems(item2);
        if (combinedKeyItem != null) {
            this.removeFromInventory(item1);
            this.removeFromInventory(item2);
            addToInventory(combinedKeyItem);
            System.out.println("\nItems combined successfully!");
        } else {
            System.out.println("\nThere is no need to combine these.");
        }
    }

    private void itemBoxTransfer(int itemID, boolean toItemBox){
        Item item = getItemById(itemID);
        if (item != null && toItemBox) {
            addToItemBox(item);
            removeFromInventory(item);
        } else if (item != null) {
            addToInventory(item);
            removeFromItemBox(item);
        } else {
            System.out.println("\nError: item not found.");
        }
    }

    //fires a weapon and calculates ammo use with fireCount()
    private void useWeapon(int weaponID){
        Item item = getItemById(weaponID);
        switch (item) {
            case null -> System.out.println("\nWeapon not found");
            case Weapon weaponInUse -> weaponInUse.fireCount( 1); //count could be used for calculating damage
            case Knife knifeInUse -> knifeInUse.swingCount( 1);
            default -> {}
        }
    }

    private void readFile(int fileID){
        Item file = getFileById(fileID);
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
    private void darkRoom(int film){
        Item item = getItemById(film);
        if (item instanceof KeyItem filmToDevelop) {
            if (filmToDevelop.getTypeKey() == KeyType.FILM) {
                File developedFile = filmToDevelop.developFilm(filmToDevelop);
                if (developedFile != null) {
                    addToFiles(developedFile);
                    removeFromInventory(filmToDevelop);
                    readFile(developedFile.getId());
                }
            }
        }
    }

}