package InventoryRE.Items.Weaponry.Weapons;

import InventoryRE.Items.Weaponry.Ammunition.Ammunition;
import InventoryRE.Items.Weaponry.WeaponParts.Parts;

public interface WeaponInterface {

    ReloadRecord reloadWeapon(Ammunition ammo);
    Ammunition unloadAmmo(); // specific for grenade launchers
    void weaponUseCount(int count);
    Weapon upgradeWeapon(Parts part);

}
