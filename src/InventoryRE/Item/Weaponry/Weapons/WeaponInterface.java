package InventoryRE.Item.Weaponry.Weapons;

import InventoryRE.Item.Weaponry.Ammunition.Ammunition;

public interface WeaponInterface {

    ReloadResultRecord reloadWeapon(Ammunition ammo);
    Ammunition unloadAmmo(); // specific for grenade launchers
    void fireCount(String name, int count);

}
