package InventoryRE.Items.Weaponry.Weapons;

import InventoryRE.Items.Item;
import InventoryRE.Items.ItemDatabase;
import InventoryRE.Items.ItemType;
import InventoryRE.Items.Weaponry.Ammunition.AmmoType;
import InventoryRE.Items.Weaponry.Ammunition.Ammunition;
import InventoryRE.Items.Weaponry.WeaponParts.PartType;
import InventoryRE.Items.Weaponry.WeaponParts.Parts;

import java.util.*;
import java.util.function.Supplier;

public class Weapon extends Item implements WeaponInterface {

    private int magazine;
    private int maxCapacity;
    private final WeaponType typeWeapon;
    private AmmoType loadedAmmo;
    private FireType fireType;

    ItemDatabase itemDatabase = new ItemDatabase();

    // basically knives
    public Weapon(int id, String name, String description, ItemType type, WeaponType typeWeapon) {
        super(id, name, description, type);
        this.typeWeapon = typeWeapon;
    }

    // fire weapons
    public Weapon(int id, String name, String description, ItemType type, WeaponType typeWeapon, int magazine, int maxCapacity, FireType fireType) {
        this(id, name, description, type, typeWeapon);
        this.magazine = magazine;
        this.maxCapacity = maxCapacity;
        this.fireType = fireType;
    }

    // grenade launcher's specific reloading/switch ammo system
    public Weapon(int id, String name, String description, ItemType type, WeaponType typeWeapon, int magazine, int maxCapacity, FireType fireType, AmmoType loadedAmmo) {
        this(id, name, description, type, typeWeapon, magazine, maxCapacity, fireType);
        this.loadedAmmo = loadedAmmo;
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

    public WeaponType getTypeWeapon() {
        return typeWeapon;
    }

    private int getFireRate() {
        return (this.fireType == FireType.BURST) ? 3 : 1;
    }

    @Override
    public String toString() {
        if (!isInfiniteWeapon()) {
            if (this.getTypeWeapon() == WeaponType.KNIFE) {
                return "| " + getName() + " | " + getDescription();
            }
            return "| " + getName() + " | " + getDescription()
                    + " | Magazine: " + getMagazine() + " | Capacity: " + getMaxCapacity();
        } else {
            return " | " + getName() + " | " + getDescription() + " | Magazine: ∞";
        }
    }

    //reloading and upgrading weapons according to their individual attributes
    private boolean isWeapon() {
        return EnumSet.of(ItemType.WEAPON, ItemType.SPECIAL).contains(this.getType());
    }

    private boolean isInfiniteWeapon() {
        return Optional.ofNullable(this.getTypeWeapon())
                .map(type -> type == WeaponType.INFINITE_WEAPON)
                .orElse(false);
    }

    @Override
    public ReloadRecord reloadWeapon(Ammunition ammo) {
        if (!isWeapon()) {
            System.out.println("\nCannot combine these items.");
            return new ReloadRecord(this, null);
        }

        if (!isCompatibleAmmo(ammo)) {
            System.out.println("\nThere is no need to combine these.");
            return new ReloadRecord(this, null);
        }

        Ammunition returnedAmmo = Optional.ofNullable(loadedAmmo)
                .filter(loaded -> typeWeapon == WeaponType.GRENADE_LAUNCHER && loaded != ammo.getAmmoType())
                .map(loaded -> unloadAmmo())
                .orElse(null);

        loadedAmmo = ammo.getAmmoType();

        int ammoNeeded = getMaxCapacity() - getMagazine();
        this.magazine += Math.min(ammo.getQuantity(), ammoNeeded);
        ammo.setQuantity(ammo.getQuantity() - ammoNeeded);

        System.out.println("\nWeapon reloaded successfully!");

        return new ReloadRecord(this, returnedAmmo);

    }

    @Override
    public Weapon upgradeWeapon(Parts part) {
        if (this.getType() != ItemType.WEAPON || part.getType() != ItemType.PART) {
            System.out.println("These items cannot be combined");
            return null;
        }

        Map<Integer, Map<PartType, Supplier<Weapon>>> upgradeMap = Map.of(
                2, Map.of(PartType.HANDGUN_PARTS, itemDatabase::getHK_VP70_BURST),
                5, Map.of(PartType.SHOTGUN_PARTS, itemDatabase::getREMINGTON_M1100),
                11, Map.of(PartType.MAGNUM_PARTS, itemDatabase::getDESERT_EAGLE_CUSTOM)
        );

        return Optional.ofNullable(upgradeMap.get(this.getId()))
                .map(parts -> parts.get(part.getTypePart()))
                .map(Supplier::get)
                .orElse(null);
    }

    private boolean isCompatibleAmmo(Ammunition ammo) {
        Map<WeaponType, Set<AmmoType>> ammoMap = Map.of(
                WeaponType.HANDGUN, Set.of(AmmoType.HANDGUN_BULLETS),
                WeaponType.SHOTGUN, Set.of(AmmoType.SHOTGUN_SHELLS),
                WeaponType.BOWGUN, Set.of(AmmoType.BOWGUN_BOLTS),
                WeaponType.GRENADE_LAUNCHER, Set.of(AmmoType.GRENADE_ROUNDS, AmmoType.ACID_ROUNDS, AmmoType.FLAME_ROUNDS),
                WeaponType.MAGNUM, Set.of(AmmoType.MAGNUM_BULLETS),
                WeaponType.MACHINE_GUN, Set.of(AmmoType.MACHINEGUN_BULLETS)
        );
        return ammoMap.getOrDefault(this.typeWeapon, Set.of()).contains(ammo.getAmmoType());
    }

    @Override
    public Ammunition unloadAmmo() {
        if (loadedAmmo == null) return null;

        Map<AmmoType, Supplier<Ammunition>> ammoSupplier = Map.of(
                AmmoType.GRENADE_ROUNDS, itemDatabase::getGRENADE_ROUNDS,
                AmmoType.ACID_ROUNDS, itemDatabase::getACID_ROUNDS,
                AmmoType.FLAME_ROUNDS, itemDatabase::getFLAME_ROUNDS
        );

        return Optional.ofNullable(ammoSupplier.get(loadedAmmo))
                .map(Supplier::get)
                .map(ammo -> {
                    ammo.setTypeAmmo(loadedAmmo);
                    ammo.setQuantity(this.magazine);
                    this.magazine = 0;
                    return ammo;
                })
                .orElse(null);
    }

    // extension of useWeapon() method from Inventory
    //TODO: create section to handle specific grenade rounds behavior
    @Override
    public void weaponUseCount(int count) {
        if (this.getTypeWeapon() == WeaponType.KNIFE) {
            System.out.println("\nYou've stabbed an enemy!");
        } else {
            int bulletsUsed = count * getFireRate();
            if (isInfiniteWeapon()) {
                System.out.println("\nYou've shot an enemy with your \"" + getName() + "\"!");
                return;
            }
            if (this.getMagazine() == 0) {
                System.out.println("\nYour weapon is empty!");
            } else {
                if (bulletsUsed >= this.getMagazine()) {
                    setMagazine(0);
                    System.out.println("\nYou've shot an enemy with your \"" + getName() + "\"! Now your weapon is empty");
                } else {
                    setMagazine(getMagazine() - bulletsUsed);
                    System.out.println("\nYou've shot an enemy with your \"" + getName() + "\"!");
                }
            }
        }
    }

}