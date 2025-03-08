package InventoryRE.Weaponry.Weapons;

import InventoryRE.Weaponry.Ammunition.Ammunition;

public interface WeaponInterface {

    ReloadResultRecord reloadWeapon(Ammunition ammo);
    int updateAmmoLeft(int quantity, int ammoNeeded);
    Ammunition unloadAmmo(); // specific for grenade launchers
    void fireCount(String name, int count);

}
