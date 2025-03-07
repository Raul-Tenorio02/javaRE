package InventoryRE;

import InventoryRE.Files.File;
import InventoryRE.Key.KeyItem;
import InventoryRE.Key.KeyType;
import InventoryRE.Recovery.RecoveryItem;
import InventoryRE.Weaponry.Ammunition.Ammunition;
import InventoryRE.Weaponry.WeaponParts.Parts;
import InventoryRE.Weaponry.Weapons.ReloadResultRecord;
import InventoryRE.Weaponry.Weapons.Weapon;
import InventoryRE.Weaponry.Knife.Knife;
import InventoryRE.Weaponry.Weapons.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> implements InventoryInterface{

    // delimits item manipulation by creating 3 lists that interact with each other
    private List<T> equipments;
    private List<T> itemBox;
    private List<T> archive;
    private List<T> database;

    public Inventory() {
        this.equipments = new ArrayList<>();
        this.itemBox = new ArrayList<>();
        this.archive = new ArrayList<>();
        this.database = new ArrayList<>();

        //WEAPONS
        addToDatabase(ItemDatabase.KNIFE);
        addToDatabase(ItemDatabase.HK_VP70);
        addToDatabase(ItemDatabase.BROWNING_HP);
        addToDatabase(ItemDatabase.REMINGTON_1100P);
        addToDatabase(ItemDatabase.BOW_GUN);
        addToDatabase(ItemDatabase.COLT_SAA);
        addToDatabase(ItemDatabase.M79_GL);
        addToDatabase(ItemDatabase.MAC11);
        addToDatabase(ItemDatabase.DESERT_EAGLE);
        addToDatabase(ItemDatabase.SPARK_SHOT);
        addToDatabase(ItemDatabase.ROCKET_LAUNCHER);
        addToDatabase(ItemDatabase.GATLING_GUN);

        //WEAPON PARTS
        addToDatabase(ItemDatabase.HANDGUN_PARTS);
        addToDatabase(ItemDatabase.SHOTGUN_PARTS);
        addToDatabase(ItemDatabase.MAGNUM_PARTS);

        //AMMUNITION
        addToDatabase(ItemDatabase.HANDGUN_BULLETS);
        addToDatabase(ItemDatabase.SHOTGUN_SHELLS);
        addToDatabase(ItemDatabase.BOW_GUN_BOLTS);
        addToDatabase(ItemDatabase.GRENADE_ROUNDS);
        addToDatabase(ItemDatabase.ACID_ROUNDS);
        addToDatabase(ItemDatabase.FLAME_ROUNDS);
        addToDatabase(ItemDatabase.MAGNUM_BULLETS);
        addToDatabase(ItemDatabase.MACHINE_GUN_BULLETS);

        //KEY ITEMS
        addToDatabase(ItemDatabase.LIGHTER);
        addToDatabase(ItemDatabase.LOCKPICK);
        addToDatabase(ItemDatabase.ADA_PICTURE);
        addToDatabase(ItemDatabase.SHERRY_PICTURE);
        addToDatabase(ItemDatabase.SMALL_KEY);
        addToDatabase(ItemDatabase.INK_RIBBON);
        addToDatabase(ItemDatabase.BLUE_CARD_KEY);
        addToDatabase(ItemDatabase.CABIN_KEY);
        addToDatabase(ItemDatabase.FILM_1);
        addToDatabase(ItemDatabase.FILM_2);
        addToDatabase(ItemDatabase.FILM_3);
        addToDatabase(ItemDatabase.FILM_4);
        addToDatabase(ItemDatabase.UNICORN_MEDAL);
        addToDatabase(ItemDatabase.SPADE_KEY);
        addToDatabase(ItemDatabase.DIAMOND_KEY);
        addToDatabase(ItemDatabase.VIRGIN_HEART);
        addToDatabase(ItemDatabase.VALVE_HANDLE);
        addToDatabase(ItemDatabase.PLASTIC_BOMB);
        addToDatabase(ItemDatabase.DETONATOR);
        addToDatabase(ItemDatabase.HEART_KEY);
        addToDatabase(ItemDatabase.RED_CARD_KEY);
        addToDatabase(ItemDatabase.BOMB_DET);
        addToDatabase(ItemDatabase.SQUARE_CRANK);
        addToDatabase(ItemDatabase.CORD);
        addToDatabase(ItemDatabase.CLUB_KEY);
        addToDatabase(ItemDatabase.KING_PLUG);
        addToDatabase(ItemDatabase.ROOK_PLUG);
        addToDatabase(ItemDatabase.KNIGHT_PLUG);
        addToDatabase(ItemDatabase.BISHOP_PLUG);
        addToDatabase(ItemDatabase.EAGLE_STONE);
        addToDatabase(ItemDatabase.SERPENT_STONE);
        addToDatabase(ItemDatabase.BLUE_STONE_LEFT);
        addToDatabase(ItemDatabase.BLUE_STONE_RIGHT);
        addToDatabase(ItemDatabase.JAGUAR_STONE);
        addToDatabase(ItemDatabase.MANHOLE_OPENER);
        addToDatabase(ItemDatabase.GOLD_COGWHEEL);
        addToDatabase(ItemDatabase.EAGLE_MEDAL);
        addToDatabase(ItemDatabase.WOLF_MEDAL);
        addToDatabase(ItemDatabase.WEAPON_BOX_KEY);
        addToDatabase(ItemDatabase.DOWN_KEY);
        addToDatabase(ItemDatabase.UP_KEY);
        addToDatabase(ItemDatabase.FUSE_CASE);
        addToDatabase(ItemDatabase.MAIN_FUSE);
        addToDatabase(ItemDatabase.LAB_CARD_KEY);
        addToDatabase(ItemDatabase.MO_DISK);
        addToDatabase(ItemDatabase.POWER_ROOM_KEY);
        addToDatabase(ItemDatabase.VACCINE_CART);
        addToDatabase(ItemDatabase.BASE_VACCINE);
        addToDatabase(ItemDatabase.VACCINE_CART);
        addToDatabase(ItemDatabase.BASE_VACCINE);
        addToDatabase(ItemDatabase.VACCINE);
        addToDatabase(ItemDatabase.G_VIRUS);
        addToDatabase(ItemDatabase.MASTER_KEY);
        addToDatabase(ItemDatabase.PLATFORM_KEY);
        addToDatabase(ItemDatabase.JOINT_N_PLUG);
        addToDatabase(ItemDatabase.JOINT_S_PLUG);
        addToDatabase(ItemDatabase.LOCKER_KEY);

        //RECOVERY ITEMS
        addToDatabase(ItemDatabase.GREEN_HERB);
        addToDatabase(ItemDatabase.RED_HERB);
        addToDatabase(ItemDatabase.BLUE_HERB);
        addToDatabase(ItemDatabase.FIRST_AID_SPRAY);
        addToDatabase(ItemDatabase.MIXED_HERB_GG);
        addToDatabase(ItemDatabase.MIXED_HERB_GR);
        addToDatabase(ItemDatabase.MIXED_HERB_GB);
        addToDatabase(ItemDatabase.MIXED_HERB_GGG);
        addToDatabase(ItemDatabase.MIXED_HERB_GGB);
        addToDatabase(ItemDatabase.MIXED_HERB_GRB);

        //FILES
        addToDatabase(ItemDatabase.POLICE_MEMORANDUM);
        addToDatabase(ItemDatabase.CHRIS_DIARY);
        addToDatabase(ItemDatabase.MAIL_TO_CHRIS);
        addToDatabase(ItemDatabase.OPERATION_REPORT1);
        addToDatabase(ItemDatabase.MEMO_TO_LEON);
        addToDatabase(ItemDatabase.OPERATION_REPORT2);
        addToDatabase(ItemDatabase.CHIEF_DIARY);
        addToDatabase(ItemDatabase.FILM_A);
        addToDatabase(ItemDatabase.FILM_B);
        addToDatabase(ItemDatabase.FILM_C);
        addToDatabase(ItemDatabase.FILM_D);
        addToDatabase(ItemDatabase.PATROL_REPORT);
        addToDatabase(ItemDatabase.SECRETARY_DIARY_A);
        addToDatabase(ItemDatabase.SECRETARY_DIARY_B);
        addToDatabase(ItemDatabase.WATCHMAN_DIARY);
        addToDatabase(ItemDatabase.MAIL_TO_THE_CHIEF);
        addToDatabase(ItemDatabase.SEWER_MANAGER_FAX);
        addToDatabase(ItemDatabase.SEWER_MANAGE_DIARY);
        addToDatabase(ItemDatabase.LAB_SECURITY_MANUAL);
        addToDatabase(ItemDatabase.P_EPSILON_REPORT);
        addToDatabase(ItemDatabase.USER_REGISTRATION);
        addToDatabase(ItemDatabase.VACCINE_SYNTHESIS);

    }

    private void addToDatabase(Item item){
        database.add((T) item);
    }

    private T getFromDatabase(String name){
        for (T item : database) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    private void addToInventory(T item) {
        equipments.add(item);
    }

    //private because technically you should be able to remove an item from your inventory only by using it or by sending it to the item box
    private void removeFromInventory(T item){
        equipments.remove(item);
    }

    public void listInventory(){
        System.out.println("\n---------------------------------------------------------INVENTORY--------------------------------------------------------\n");
        for (T item : equipments) {
                System.out.println(item);
        }
    }

    private void addToFiles(T item) {
        archive.add(item);
    }

    public void listFiles(){
        System.out.println("\n-----------------------------------------------------------FILES----------------------------------------------------------\n");
        for (T item : archive) {
            System.out.println(item);
        }
    }

    private void addToItemBox(T item){
        itemBox.add(item);
    }

    private void removeFromItemBox(T item){
        itemBox.remove(item);
    }

    public void listItemBox(){
        System.out.println("\n----------------------------------------------------------ITEM BOX--------------------------------------------------------\n");
        for (T item : itemBox){
                System.out.println(item);
        }
    }

    private T getItemByName (String name, boolean searchItemBox) {
        List<T> targetList = searchItemBox ? itemBox : equipments;
        for (T item : targetList) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    private T getFileByName (String name) {
        for (T file : archive) {
            if (file != null && file.getName().equalsIgnoreCase(name)){
                return file;
            }
        }
        return null;
    }

    //TODO: refactor to be more readable
    @Override
    public void collectItem(Boolean confirm, Item itemToCollect){
        T item = getFromDatabase(itemToCollect.getName());
        if ( item == null) {
            System.out.println("Item not found");
            return;
        }
        if (item instanceof Ammunition ammo){
            for (T inventoryItem : equipments){
                if (inventoryItem instanceof Ammunition && inventoryItem.getName().equals(ammo.getName())) {
                    ((Ammunition) inventoryItem).setQuantity(ammo.getQuantity() + 15);
                    return;
                }
            }
            addToInventory((T) ammo);
        } else if (item instanceof KeyItem inkRibbon) {
            for (T inventoryItem : equipments) {
                if (inventoryItem instanceof KeyItem) {
                    if (((KeyItem) inventoryItem).getTypeKey() == KeyType.INK_RIBBON) {
                        ((KeyItem) inventoryItem).setQuantity(((KeyItem) inventoryItem).getQuantity() + 3);
                        return;
                    }
                }
            }
            addToInventory((T) inkRibbon);
        } else if (item instanceof File) {
            addToFiles(item);
        } else {
            addToInventory(item);
        }
    }

    //TODO: create method that hold item 1's position and sets item created to it
    @Override
    public void combineItems(Item itemA, Item itemB) {
        T item1 = getItemByName(itemA.getName(), false);
        T item2 = getItemByName(itemB.getName(), false);

        if (item1 instanceof RecoveryItem herb1 && item2 instanceof RecoveryItem herb2) {
            RecoveryItem combinedHerb = herb1.mixHerb(herb2);
            if (combinedHerb != null){
                this.removeFromInventory(item1);
                this.removeFromInventory(item2);
                addToInventory((T) combinedHerb);
                System.out.println("\nHerbs combined successfully!");
            } else {
                System.out.println("\nThere is no need to combine these.");
            }
        } else if (item1 instanceof Weapon && item2 instanceof Ammunition || item1 instanceof Ammunition && item2 instanceof Weapon) {
            Weapon weapon = (Weapon) item1;
            Ammunition ammo = (Ammunition) item2;
            ReloadResultRecord reloadResult = weapon.reloadWeapon(ammo);
            Ammunition returnedAmmo = reloadResult.returnedAmmo();
            if (returnedAmmo != null) {
                boolean ammoAdded = false;
                for (T item : equipments) {
                    if (item instanceof Ammunition inventoryAmmo) {
                        if (inventoryAmmo.getAmmoType() == returnedAmmo.getAmmoType()) {
                            inventoryAmmo.setQuantity(inventoryAmmo.getQuantity() + returnedAmmo.getQuantity());
                            ammoAdded = true;
                            break;
                        }
                    }
                }
                if(!ammoAdded){
                    addToInventory((T) returnedAmmo);
                }
            }
            if(weapon.getTypeWeapon() != WeaponType.INFINITE_WEAPON) {
                if (ammo.getQuantity() <= 0) {
                    this.removeFromInventory((T) ammo);
                    System.out.println("\nWeapon reloaded sucessfully!");
                } else {
                    System.out.println("\nWeapon reloaded sucessfully!");
                }
            }
        } else if (item1 instanceof Weapon && item2 instanceof Parts || item1 instanceof Parts && item2 instanceof Weapon) {
            Weapon weapon = (Weapon) item1;
            Parts parts = (Parts) item2;

            Weapon customWeapon = weapon.upgradeWeapon(parts);
            if (customWeapon != null){
                this.removeFromInventory((T) parts);
                this.removeFromInventory((T) weapon);
                addToInventory((T) customWeapon);
                System.out.println("\nWeapon customized sucessfully!");
            } else {
                System.out.println("\nThere is no need to combine these.");
            }
        } else {
            System.out.println("\nCannot combine these items.");
        }
    }

    @Override
    public void itemBoxIn(Item item){
        T itemToStorage = getItemByName(item.getName(), false);
        if (itemToStorage != null) {
            addToItemBox(itemToStorage);
            removeFromInventory(itemToStorage);
        } else {
            System.out.println("\nError: item not found.");
        }
    }

    @Override
    public void itemBoxOut(Item item){
        T itemToGetFromStorage = getItemByName(item.getName(), true);
        if(itemToGetFromStorage != null) {
            addToInventory(itemToGetFromStorage);
            removeFromItemBox(itemToGetFromStorage);
        } else {
            System.out.println("\nError: item not found.");
        }
    }

    @Override
    public void useWeapon(Item itemWeapon, int count){
        if (count == 0) {
            count = 1;
        }
        T item = getItemByName(itemWeapon.getName(), false);
        if (item == null) {
            System.out.println("\nWeapon not found");
            return;
        }
        //TODO: refactor firecount
        if (item instanceof Weapon weaponInUse) {
            weaponInUse.fireCount(itemWeapon.getName(), count);
        } else if (item instanceof Knife knifeInUse) {
            knifeInUse.swingCount(itemWeapon.getName(), count);
        }
    }

    @Override
    public void readFile(String name){
        T file = getFileByName(name);
        if (file != null){
            if (file instanceof File fileToRead){
                System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
                System.out.println(fileToRead.getDescription());
            }
        } else {
            System.out.println("\nError: file not found.");
        }
    }

    //method to develop films
    @Override
    public void darkRoom(Item film){
        T item = getItemByName(film.getName(), false);
        if (item instanceof KeyItem filmToDevelop) {
            if (filmToDevelop.getTypeKey() == KeyType.FILM) {
                File developedFile = filmToDevelop.developFilm(filmToDevelop.getFilmID());
                if (developedFile != null) {
                    addToFiles((T) developedFile);
                    removeFromInventory((T) filmToDevelop);
                    readFile(developedFile.getName());
                }
            }
        }
    }

}