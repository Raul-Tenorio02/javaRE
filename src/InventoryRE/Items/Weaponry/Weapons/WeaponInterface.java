package InventoryRE.Items.Weaponry.Weapons;

import InventoryRE.Items.Weaponry.Ammunition.Ammunition;

public interface WeaponInterface {

    ReloadRecord reloadWeapon(Ammunition ammo);
    Ammunition unloadAmmo(); // specific for grenade launchers
    void fireCount(int count);

}
