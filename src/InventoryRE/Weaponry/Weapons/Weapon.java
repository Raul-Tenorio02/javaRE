package InventoryRE.Weaponry.Weapons;

import InventoryRE.Inventory.Item;
import InventoryRE.Inventory.ItemDatabase;
import InventoryRE.Inventory.ItemType;
import InventoryRE.Weaponry.Ammunition.AmmoType;
import InventoryRE.Weaponry.Ammunition.Ammunition;
import InventoryRE.Weaponry.WeaponParts.PartType;
import InventoryRE.Weaponry.WeaponParts.Parts;
import InventoryRE.Weaponry.WeaponParts.UpgradeWeaponsInterface;

import java.util.List;
import java.util.Map;

public class Weapon extends Item implements WeaponInterface, UpgradeWeaponsInterface {

    private int magazine;
    private final int maxCapacity;
    WeaponType typeWeapon;
    AmmoType loadedAmmo;
    FireType fireType;

    ItemDatabase itemDatabase = new ItemDatabase();

    public Weapon(Long id, String name, String description, ItemType type, WeaponType typeWeapon, int magazine, int maxCapacity) {
        super(id, name, description, type);
        this.magazine = magazine;
        this.maxCapacity = maxCapacity;
        this.typeWeapon = typeWeapon;
    }

    // overloading constructor to implement grenade launcher's specific reloading/switch ammo system
    public Weapon(Long id, String name, String description, ItemType type, WeaponType typeWeapon, int magazine, int maxCapacity, AmmoType loadedAmmo) {
        this(id, name, description, type, typeWeapon, magazine, maxCapacity);
        this.loadedAmmo = loadedAmmo;
    }

    // overloading constructor to add fire rate attribute
    public Weapon(Long id, String name, String description, ItemType type, WeaponType typeWeapon, int magazine, int maxCapacity, FireType fireType) {
        this(id, name, description, type, typeWeapon, magazine, maxCapacity);
        this.fireType = fireType;
    }

    public int getMagazine() {
        return magazine;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public WeaponType getTypeWeapon(){
        return typeWeapon;
    }

    @Override
    public String toString() {
        if (!isInfiniteWeapon()) {
            return "{" + getName() + ", " + getDescription()
                    + ", Magazine: " + getMagazine() + ", Capacity: " + getMaxCapacity()
                    + "}";
        }
        return "{" + getName() + ", " + getDescription() + ", Magazine: ∞" + "}";
    }

    private boolean isWeapon() {
        return this.getType() == ItemType.WEAPON || this.getType() == ItemType.SPECIAL;
    }

    private boolean isInfiniteWeapon() {
        return this.getTypeWeapon() == WeaponType.INFINITE_WEAPON;
    }

    @Override
    public ReloadResultRecord reloadWeapon(Ammunition ammo) {
        if(!isWeapon()) {
            System.out.println("\nCannot combine these items.");
            return new ReloadResultRecord(this, null);
        }
        Ammunition returnedAmmo = null;
        if (typeWeapon == WeaponType.GRENADE_LAUNCHER && isCompatibleAmmo(ammo)) {
            if (loadedAmmo != ammo.getAmmoType()) {
                returnedAmmo = unloadAmmo();
                loadedAmmo = ammo.getAmmoType();
            }
        }
        if (isCompatibleAmmo(ammo)) {
            int ammoNeeded = getMaxCapacity() - getMagazine();
            this.magazine += Math.min(ammo.getQuantity(), ammoNeeded);
            ammo.setQuantity(ammo.getQuantity() - ammoNeeded);
            System.out.println("\nWeapon reloaded successfully!");
        } else {
            System.out.println("\nThere is no need to combine these.");
        }
        return new ReloadResultRecord(this, returnedAmmo);
    }

    @Override
    public Weapon upgradeWeapon(Parts part){
        if (this.getType() != ItemType.WEAPON || part.getType() != ItemType.PART) {
            System.out.println("These items cannot be combined");
            return null;
        }
        if (this.getName().equalsIgnoreCase("H&K VP70") && part.getTypePart() == PartType.HANDGUN_PARTS) {
            return itemDatabase.getHK_VP70_BURST();
        } else if (this.getName().equalsIgnoreCase("Remington 1100P") && part.getTypePart() == PartType.SHOTGUN_PARTS) {
            return itemDatabase.getREMINGTON_M1100();
        } else if (this.getName().equalsIgnoreCase("Desert Eagle") && part.getTypePart() == PartType.MAGNUM_PARTS) {
            return itemDatabase.getDESERT_EAGLE_CUSTOM();
        }
        return null;
    }

    private boolean isCompatibleAmmo(Ammunition ammo) {
        Map<WeaponType, List<AmmoType>> ammoMap = Map.of(
                WeaponType.HANDGUN, List.of(AmmoType.HANDGUN_BULLETS),
                WeaponType.SHOTGUN, List.of(AmmoType.SHOTGUN_SHELLS),
                WeaponType.BOWGUN, List.of(AmmoType.BOWGUN_BOLTS),
                WeaponType.GRENADE_LAUNCHER, List.of(AmmoType.GRENADE_ROUNDS, AmmoType.ACID_ROUNDS, AmmoType.FLAME_ROUNDS),
                WeaponType.MAGNUM, List.of(AmmoType.MAGNUM_BULLETS),
                WeaponType.MACHINE_GUN, List.of(AmmoType.MACHINEGUN_BULLETS)
        );
        return ammoMap.getOrDefault(this.typeWeapon, List.of()).contains(ammo.getAmmoType());
    }

    @Override
    public Ammunition unloadAmmo(){
        if (loadedAmmo != null) {
            Ammunition returnedAmmo;
            switch (loadedAmmo){
                case AmmoType.GRENADE_ROUNDS -> {
                    returnedAmmo = itemDatabase.getGRENADE_ROUNDS();
                    returnedAmmo.setTypeAmmo(this.loadedAmmo);
                    returnedAmmo.setQuantity(this.magazine);
                    this.magazine = 0;
                    return returnedAmmo;
                }
                case AmmoType.ACID_ROUNDS -> {
                    returnedAmmo = itemDatabase.getACID_ROUNDS();
                    returnedAmmo.setTypeAmmo(this.loadedAmmo);
                    returnedAmmo.setQuantity(this.magazine);
                    this.magazine = 0;
                    return returnedAmmo;
                }
                case AmmoType.FLAME_ROUNDS -> {
                    returnedAmmo = itemDatabase.getFLAME_ROUNDS();
                    returnedAmmo.setTypeAmmo(this.loadedAmmo);
                    returnedAmmo.setQuantity(this.magazine);
                    this.magazine = 0;
                    return returnedAmmo;
                }
            }
        }
        return null;
    }

    //TODO: create section to handle specific grenade rounds behavior
    @Override
    public void fireCount(String name, int count) {
        int fireRate = (this.fireType == FireType.BURST) ? 3 : 1;
        if (isInfiniteWeapon()) {
            System.out.println("\nYou've shot an enemy with your \"" + getName() + "\" " + count + "x!");
        } else {
            int bulletsUsed = count * fireRate;
            if (bulletsUsed > this.getMagazine()) {
                count = this.getMagazine() / fireRate;
                setMagazine(0);
                System.out.println("\nYou've shot an enemy with your \"" + getName() + "\" " + count + "x! Now your weapon is empty");
            } else {
                setMagazine(getMagazine() - bulletsUsed);
                System.out.println("\nYou've shot an enemy with your \"" + getName() + "\" " + count + "x!");
            }
        }
    }

}