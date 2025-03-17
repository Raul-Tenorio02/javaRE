package InventoryRE.Item;

import InventoryRE.Item.Files.File;
import InventoryRE.Item.Key.KeyItem;
import InventoryRE.Item.Key.KeyType;
import InventoryRE.Item.Recovery.RecoveryItem;
import InventoryRE.Item.Recovery.RecoveryType;
import InventoryRE.Item.Weaponry.Ammunition.AmmoType;
import InventoryRE.Item.Weaponry.Ammunition.Ammunition;
import InventoryRE.Item.Weaponry.Knife.Knife;
import InventoryRE.Item.Weaponry.WeaponParts.PartType;
import InventoryRE.Item.Weaponry.WeaponParts.Parts;
import InventoryRE.Item.Weaponry.Weapons.FireType;
import InventoryRE.Item.Weaponry.Weapons.Weapon;
import InventoryRE.Item.Weaponry.Weapons.WeaponType;

public final class ItemDatabase {

    //WEAPONS
    public Knife getKNIFE() {
        return new Knife(1L, "Knife", "\"A combat knife. It could come in handy...\"", ItemType.WEAPON, WeaponType.INFINITE_WEAPON);
    }

    public Weapon getHK_VP70(){
        return new Weapon(2L, "H&K VP70", "\"Manufactured by H&K, Germany. It uses 9mm parabellum rounds.\"", ItemType.WEAPON, WeaponType.HANDGUN, 18, 18);
    }

    public Weapon getHK_VP70_BURST(){
        return new Weapon(3L,"H&K VP70 Burst", "\"VP70 with a stock holster. Capable of firing three round auto bursts.\"", ItemType.SPECIAL, WeaponType.HANDGUN , 18, 18, FireType.BURST);
    }

    public Weapon getBROWNING_HP(){
        return new Weapon(4L,"Browning HP", "\"Manufactured by FN, Belgium. It uses 9mm parabellum rounds.\"", ItemType.WEAPON, WeaponType.HANDGUN, 13, 13);
    }

    public Weapon getREMINGTON_1100P(){
        return new Weapon(5L,"Remington M1100-P", "\"It uses 12 gauge rounds. Smaller than a standard M1100, as its barrel is cut.\"", ItemType.WEAPON, WeaponType.SHOTGUN, 5, 5);
    }

    public Weapon getREMINGTON_M1100(){
        return new Weapon(6L,"Remington M1100", "\"M1100 full size semi-automatic. The longer barrel results in more concentrated blasts.\"", ItemType.SPECIAL, WeaponType.SHOTGUN, 7, 7);
    }

    public Weapon getBOW_GUN(){
        return new Weapon(7L,"Bow Gun", "\"A powerful box gun primarily used to hunt large game.", ItemType.WEAPON, WeaponType.BOWGUN, 18, 18, FireType.BURST);
    }

    public Weapon getCOLT_SAA(){
        return new Weapon(8L,"Colt S.A.A", "\"Colt S.A.A. Artillery Model. Used by cowboys in the Wild West. Designed for a quick draw.\"", ItemType.WEAPON, WeaponType.HANDGUN, 6, 6);
    }

    public Weapon getM79_GL(){
        return new Weapon(9L,"M79 Grenade launcher", "\"Various rounds can be used. The cut stock causes a greater recoil. Made in the USA.\"", ItemType.WEAPON, WeaponType.GRENADE_LAUNCHER, 6, 255, AmmoType.GRENADE_ROUNDS);
    }

    public Weapon getMAC11(){
        return new Weapon(10L,"MAC11 Sub Machine Gun", "\"Manufactured by Military Armament CORP. It uses DOT380 rounds.", ItemType.WEAPON, WeaponType.MACHINE_GUN, 100, 100);
    }

    public Weapon getDESERT_EAGLE(){
        return new Weapon(11L,"Desert Eagle 50A.E", "\"A high caliber magnum pistol. It uses powerful DOT50A.E rounds. By IMI, Israel.\"", ItemType.WEAPON, WeaponType.MAGNUM, 8, 8);
    }

    public Weapon getDESERT_EAGLE_CUSTOM(){
        return new Weapon(12L,"Desert Eagle 50A.E Custom", "\"10 inch barrel is put on to D.E.50A.E. It can fire DOT50A.E. rounds more powerfully.\"", ItemType.SPECIAL, WeaponType.MAGNUM, 8, 8);
    }

    public Weapon getSPARK_SHOT(){
        return new Weapon(13L,"Spark Shot", "\"High voltage gun to repel experimental animals. It uses Spark Shot rounds and has a range of 10 feet\"", ItemType.WEAPON, WeaponType.SPARKSHOT, 100, 100);
    }

    public Weapon getFLAMETHROWER(){
        return new Weapon(14L,"Flamethrower", "\"Chemical fuel flamethrower made by Umbrella Inc. The fuel is fed from a small cartridge.\"", ItemType.WEAPON, WeaponType.FLAMETHROWER, 100, 100);
    }

    public Weapon getROCKET_LAUNCHER(){
        return new Weapon(15L,"Rocket Launcher", "\"A rocket launcher. One shot from this should kill any enemy.\"", ItemType.WEAPON, WeaponType.INFINITE_WEAPON, 1, 1);
    }

    //INFINITE WEAPONS
    public Weapon getINFINITE_MAC11(){
        return new Weapon(16L,"MAC11 Sub Machine Gun", "\"Manufactured by Military Armament CORP. It uses DOT380 rounds.", ItemType.WEAPON, WeaponType.MACHINE_GUN, 1, 1);
    }

    public Weapon getINFINITE_ROCKET_LAUNCHER(){
        return new Weapon(17L,"Rocket Launcher", "\"A rocket launcher. One shot from this should kill any enemy.\"", ItemType.WEAPON, WeaponType.INFINITE_WEAPON, 1, 1);
    }

    public Weapon getGATLING_GUN(){
        return new Weapon(18L,"Gatling Gun", "\"A powerful weapon that sprays bullets into targets. I should be able to defeat any enemy with this.\"", ItemType.WEAPON, WeaponType.INFINITE_WEAPON, 1, 1);
    }

    //PARTS
    public Parts getHANDGUN_PARTS(){
        return new Parts(19L,"Hand Gun Parts","\"They look like parts for a gun.\"",ItemType.PART, PartType.HANDGUN_PARTS);
    }

    public Parts getSHOTGUN_PARTS(){
        return new Parts(20L,"Shotgun Parts","\"They look like parts for a shotgun.\"", ItemType.PART, PartType.SHOTGUN_PARTS);
    }

    public Parts getMAGNUM_PARTS(){
        return new Parts(21L,"Magnum Parts","\"They look like parts for a magnum.\"", ItemType.PART, PartType.MAGNUM_PARTS);
    }

    //AMMUNITION
    public Ammunition getHANDGUN_BULLETS(){
        return new Ammunition(22L,"Hand Gun Bullets", "\"9x19 parabellum rounds that can be used for either the H&K VP70 or Browning HP.\"",ItemType.AMMUNITION, AmmoType.HANDGUN_BULLETS, 15);
    }

    public Ammunition getSHOTGUN_SHELLS(){
        return new Ammunition(23L,"Shotgun Shells", "\"For the Remington M1100 series.\"", ItemType.AMMUNITION, AmmoType.SHOTGUN_SHELLS, 7);
    }

    public Ammunition getBOW_GUN_BOLTS(){
        return new Ammunition(24L,"Bow Gun Bolts", "\"Compact iron bolts that can be used with the bow gun.\"", ItemType.AMMUNITION, AmmoType.BOWGUN_BOLTS, 18);
    }

    public Ammunition getGRENADE_ROUNDS(){
        return new Ammunition(25L, "Grenade Rounds", "\"Grenade bearing Rounds. For the M79 Grenade Launcher.\"", ItemType.AMMUNITION, AmmoType.GRENADE_ROUNDS, 6);
    }

    public Ammunition getACID_ROUNDS(){
        return new Ammunition(26L,"Acid Rounds", "\"Grenade Acid Rounds. For the M79 Grenade Launcher.\"", ItemType.AMMUNITION, AmmoType.ACID_ROUNDS, 6);
    }

    public Ammunition getFLAME_ROUNDS(){
        return new Ammunition(27L,"Flame Rounds", "\"Grenade Flame Rounds. For the M79 Grenade Launcher.\"", ItemType.AMMUNITION, AmmoType.FLAME_ROUNDS, 6);
    }

    public Ammunition getMAGNUM_BULLETS(){
        return new Ammunition(28L,"Magnum Bullets", "\"DOT50A.E rounds. Magnum rounds for the Desert Eagle.\"", ItemType.AMMUNITION, AmmoType.MAGNUM_BULLETS, 8);
    }

    public Ammunition getMACHINE_GUN_BULLETS(){
        return new Ammunition(29L,"Machine Gun Bullets", "\"DOT380 rounds. A magazine for the Ingram M11.\"", ItemType.AMMUNITION, AmmoType.MACHINEGUN_BULLETS, 100);
    }

    //KEY ITEMS
    public KeyItem getLIGHTER(){
        return new KeyItem(30L, "Lighter", "\"An oil lighter.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getLOCKPICK(){
        return new KeyItem(31L, "Lockpick", "\"A lockpick. I can unlock the simple locks with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getADA_PICTURE(){
        return new KeyItem(32L, "Ada's Picture", "\"A picture taken fairly recently.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getSHERRY_PICTURE(){
        return new KeyItem(33L, "Sherry's Picture", "\"A picture taken fairly recently.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getSMALL_KEY(){
        return new KeyItem(34L, "Small Key", "\"It looks like the key to a desk.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getINK_RIBBON(){
        return new KeyItem(35L, "Ink Ribbon", "\"I can type in my progress with this.\"", ItemType.KEY, KeyType.INK_RIBBON, 3);
    }

    public KeyItem getBLUE_CARD_KEY(){
        return new KeyItem(36L, "Blue Card Key", "\"A plastic card. It reads: Hall electronic lock.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getCABIN_KEY(){
        return new KeyItem(37L, "Cabin Key", "\"I can access the cabin in the rear with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getFILM_1(){
        return new KeyItem(38L, "Film", "\"I can't tell what's on the film until I develop it.\"", ItemType.KEY, KeyType.FILM);
    }

    public KeyItem getFILM_2(){
        return new KeyItem(39L, "Film", "\"I can't tell what's on the film until I develop it.\"", ItemType.KEY, KeyType.FILM);
    }

    public KeyItem getFILM_3(){
        return new KeyItem(40L, "Film", "\"I can't tell what's on the film until I develop it.\"", ItemType.KEY, KeyType.FILM);
    }

    public KeyItem getFILM_4(){
        return new KeyItem(41L, "Film", "\"I can't tell what's on the film until I develop it.\"", ItemType.KEY, KeyType.FILM);
    }

    public KeyItem getUNICORN_MEDAL(){
        return new KeyItem(42L, "Unicorn Medal", "\"Something is engraved on the back. 'Please guide me to the beautiful maiden who turned into stone as she waited for me.'\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getSPADE_KEY(){
        return new KeyItem(43L, "Spade Key", "\"It's in the shape of a spade.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getDIAMOND_KEY(){
        return new KeyItem(44L, "Diamond Key", "\"It's in the shape of a diamond.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getVIRGIN_HEART(){
        return new KeyItem(45L, "Virgin Heart", "\"A blood-red jewel about the size of a fist.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getVALVE_HANDLE(){
        return new KeyItem(46L, "Valve Handle", "\"I can open/close the valves with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getPLASTIC_BOMB(){
        return new KeyItem(47L, "Plastic Bomb", "\"Enough C4 to clear the wall, but it needs a detonator.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getDETONATOR(){
        return new KeyItem(48L, "Detonator", "\"It's a charge detonator. It's useless by itself.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getHEART_KEY(){
        return new KeyItem(49L, "Heart Key", "\"It's in the shape of a heart.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getRED_CARD_KEY(){
        return new KeyItem(50L, "Red Card Key", "\"A plastic card. It reads: Weapon Storage.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getBOMB_DET(){
        return new KeyItem(51L, "Bomb & Det.", "\"I can clear the wreckage away with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getSQUARE_CRANK(){
        return new KeyItem(52L, "Square Crank", "\"The end is square-shaped.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getCORD(){
        return new KeyItem(53L, "Cord", "\"A cord to connect wires on small electric devices.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getCLUB_KEY(){
        return new KeyItem(54L, "Club Key", "\"It's in the shape of a club.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getKING_PLUG(){
        return new KeyItem(55L, "King Plug", "\"A plug of some sort in the shape of a king.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getROOK_PLUG(){
        return new KeyItem(56L, "Rook Plug", "\"A plug of some sort in the shape of a rook.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getKNIGHT_PLUG(){
        return new KeyItem(57L, "Knight Plug", "\"A plug of some sort in the shape of a knight.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getBISHOP_PLUG(){
        return new KeyItem(58L, "Bishop Plug", "\"A plug of some sort in the shape of a bishop.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getEAGLE_STONE(){
        return new KeyItem(59L, "Eagle Stone", "\"A six inch stone with an eagle etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getSERPENT_STONE(){
        return new KeyItem(60L, "Serpent Stone", "\"A six inch stone with a snake etched on the side.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getBLUE_STONE_LEFT(){
        return new KeyItem(61L, "Blue Stone (left piece)", "\"Half of an animal is etched on the stone fragment.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getBLUE_STONE_RIGHT(){
        return new KeyItem(62L, "Blue Stone (right piece)", "\"Half of an animal is etched on the stone fragment.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getJAGUAR_STONE(){
        return new KeyItem(63L, "Jaguar Stone", "\"A six inch stone with a jaguar etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getMANHOLE_OPENER(){
        return new KeyItem(64L, "Manhole Opener", "\"A tool to open the manhole lid.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getGOLD_COGWHEEL(){
        return new KeyItem(65L, "Gold Cogwheel", "\"It's gold-plated. It looks like a large clock cog.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getEAGLE_MEDAL(){
        return new KeyItem(66L, "Eagle Medal", "\"An eagle is etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getWOLF_MEDAL(){
        return new KeyItem(67L, "Wolf Medal", "\"A wolf is etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getWEAPON_BOX_KEY(){
        return new KeyItem(68L, "Weapon Box Key", "\"An odd-shaped key. Umbrella's logo is on the key ring...\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getDOWN_KEY(){
        return new KeyItem(69L, "Down Key", "\"A control panel key. The letter 'D' is etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getUP_KEY(){
        return new KeyItem(70L, "Up Key", "\"A control panel key. The letter 'U' is etched.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getFUSE_CASE(){
        return new KeyItem(71L, "Fuse Case", "\"A case for industrial fuses. It's been designed for superconductor fuses.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getMAIN_FUSE(){
        return new KeyItem(72L, "Main Fuse", "\"I can restore the power to the lab with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getLAB_CARD_KEY(){
        return new KeyItem(73L, "Lab Card Key", "\"It looks like a card key for lab access.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getMO_DISK(){
        return new KeyItem(74L, "MO Disk", "\"The label says 'For Cargo Room Verification'.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getPOWER_ROOM_KEY(){
        return new KeyItem(75L, "Power Room Key", "\"It looks unique. Now I can access the power room.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getVACCINE_CART(){
        return new KeyItem(76L, "Vaccine Cart", "\"Used to create the vaccine. I need the base vaccine first.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getBASE_VACCINE(){
        return new KeyItem(77L, "Base Vaccine", "\"Vaccine cartridge processed with the activator.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getVACCINE(){
        return new KeyItem(78L, "Vaccine", "\"I can save Sherry with this.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getG_VIRUS(){
        return new KeyItem(79L, "G-virus", "\"A purple object in a gel-like state.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getMASTER_KEY(){
        return new KeyItem(80L, "Master Key", "\"It looks very important.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getPLATFORM_KEY(){
        return new KeyItem(81L, "Platform Key", "\"I have to hurry and get that train operational!\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getJOINT_N_PLUG(){
        return new KeyItem(82L, "Joint N Plug", "\"High power plug. Used to activate large generators.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getJOINT_S_PLUG(){
        return new KeyItem(83L, "Joint S Plug", "\"High power plug. Used to activate large generators.\"", ItemType.KEY, KeyType.GENERAL);
    }

    public KeyItem getLOCKER_KEY(){
        return new KeyItem(84L, "Locker Key", "\"There must be an unopened locker somewhere.\"", ItemType.KEY, KeyType.GENERAL);
    }


    //RECOVERY ITEMS
    public RecoveryItem getGREEN_HERB(){
        return new RecoveryItem(85L, "Green Herb", "\"Special herbs that grow in the Raccoon City region.\"", ItemType.RECOVERY, RecoveryType.GREEN);
    }

    public RecoveryItem getRED_HERB(){
        return new RecoveryItem(86L, "Red Herb", "\"Special herbs that grow in the Raccoon City region.\"", ItemType.RECOVERY, RecoveryType.RED);
    }

    public RecoveryItem getBLUE_HERB(){
        return new RecoveryItem(87L, "Blue Herb", "\"Special herbs that grow in the Raccoon City region.\"", ItemType.RECOVERY, RecoveryType.BLUE);
    }

    public RecoveryItem getFIRST_AID_SPRAY(){
        return new RecoveryItem(88L, "First Aid Spray", "\"This will completely restore my vitality.\"", ItemType.RECOVERY, RecoveryType.FIRST_AID);
    }

    public RecoveryItem getMIXED_HERB_GG(){
        return new RecoveryItem(89L, "Mixed Herb G+G", "\"A mixture of 2 green herbs.\"", ItemType.RECOVERY, RecoveryType.GG);
    }

    public RecoveryItem getMIXED_HERB_GR(){
        return new RecoveryItem(90L, "Mixed Herb G+R", "\"A mixture of 1 green herb and 1 red herb.\"", ItemType.RECOVERY, RecoveryType.GR);
    }

    public RecoveryItem getMIXED_HERB_GB(){
        return new RecoveryItem(91L, "Mixed Herb G+B", "\"A mixture of 1 green herb and 1 blue herb.\"", ItemType.RECOVERY, RecoveryType.GB);
    }

    public RecoveryItem getMIXED_HERB_GGG(){
        return new RecoveryItem(92L, "Mixed Herb G+G+B", "\"A mixture of 2 green herbs and 1 blue herb.\"", ItemType.RECOVERY, RecoveryType.GGB);
    }

    public RecoveryItem getMIXED_HERB_GGB(){
        return new RecoveryItem(93L, "Mixed Herb G+G+G", "\"A mixture of 3 green herbs.\"", ItemType.RECOVERY, RecoveryType.GGG);
    }

    public RecoveryItem getMIXED_HERB_GRB(){
        return new RecoveryItem(94L, "Mixed Herb G+R+B", "\"A mixture of 1 green herb, 1 red herb, and 1 blue herb.\"", ItemType.RECOVERY, RecoveryType.GRB);
    }



    //FILES
    public File getPOLICE_MEMORANDUM(){
        return new File(96L, "Police Memorandum", """
        
                                                                                POLICE MEMORANDUM

                            8/23/1998
                            This letter is just to inform everyone about the recent movement of equipment that has happened during the precinct's rearrangement.
        
                            The safe with four digit lock has been moved from S.T.A.R.S. office on the second floor, to the eastern office on the first floor.
        
                            "2236"
        
                            Raccoon Police Liaison Dept.
        """, ItemType.FILE);
    }

    public File getCHRIS_DIARY(){
        return new File(97L,"Chris's Diary", """

                
                                                                                    CHRIS'S DIARY

                            August 8th
                            I talked to the chief today once again, but he refused to listen to me. I know for certain that Umbrella conducted T-virus research in that mansion.
                            Anyone infected turns into a zombie.
                            But the entire mansion went up in that explosion; along with any incriminating evidence. 
                            Since Umbrella employs so many people in this town, no one is willing to talk about the incident.
                            It looks like I'm running out of options.
            
            
                            August 17th
                            We've been receiving a lot of local reports about strange monsters appearing at random throughout the city. This must be the work of Umbrella. 
            
            
                            August 24th
                            With the help of Jill and Barry, I finally obtained information vital to this case. 
                            Umbrella has begun research on the new G-virus, a variation of the original T-virus. Haven't they done enough damage already?!
                            We talked it over, and have decided to fly to the main Umbrella HQ in Europe. 
                            I won't tell my sister about this trip because doing so could put her in danger.
                            Please forgive me Claire.

                """, ItemType.FILE);
    }

    public File getMAIL_TO_CHRIS(){
        return new File(98L,"Mail to Chris", """

                                                                              FEDERAL POLICE DEPT.
                                                                        - INTERNAL INVESTIGATION REPORT

                            Mr. Chris Redfield
                            Raccoon City Police Dept.
                            S.T.A.R.S. division
            
                            As per your request, we have conducted our internal investigation and discovered the following information:
            
                            Regarding the G-virus currently under development by Umbrella Inc.
            
                            So far it is unconfirmed that the G-virus even exists. We're continuing with our investigation.
            
                            Regarding Mr. Brian Irons, Chief of the Raccoon City Police Dept.
            
                            Mr. Irons has allegedly received a large sum of funds in bribes from Umbrella Inc. over the last five years. 
                            He was apparently involved in the cover up of the mansion lab case along with several other incidents in which Umbrella appears to have direct involvement.
                            Mr. Irons had been arrested under suspicion of rape on two separate counts during his years as a university student. 
                            He underwent psychiatric evaluation as a result of the charges but was released due to circumstantial evidence as well as his phenomenal academic standing.
            
                            As such, extreme caution is advised when dealing with him.
            
                            Jack Hamilton,
                            Section Chief
                            Internal Investigations
                            United States Federal Police Department

                """, ItemType.FILE);
    }

    public File getOPERATION_REPORT1(){
        return new File(99L,"Operation Report 1", """

                                                                                            OPERATION REPORT

                                    - Operation Report -
                    
                                    September 26th
                    
                                    The Raccoon Police Dept. was unexpectedly attacked by zombies. Many have been injured. Even more were killed. 
                                    During the attack, our communications equipment was destroyed and we longer have contact with the outside.
                    
                                    We have decided to carry out an operation with the intent of rescuing any possible survivors as well as to prevent this disaster from spreading beyond Raccoon City. 
                                    The details of the operation are as follows:
                    
                                    Security of armaments and ammunition.
                    
                                    Chief Irons has voiced concern regarding the issue of terrorism due to a series of recent unresolved incidents. 
                                    On the very day before the zombies' attack, he made the decision to relocate all weapons to scattered intervals throughout the building as a temporary measure to prevent their possible seizure. 
                                    Unfortunately, this decision made it extremely difficult for us to locate all ammunition caches.
                                    It has become our top priority to recover these scattered munitions.
                    
                                    To unlock the weapon storage.
                    
                                    As stated earlier, it will be extremely difficult to secure all the ammunition. However, a considerable supply still remains in the underground weapon storage. 
                                    Unfortunately, the person in charge of the card key used to access the weapon storage is missing and we have been unable to locate the key. 
                                    One of the breakers went down during the battle and the electronic locks are not functioning in certain areas. 
                                    It has become a top priority to restore the power in the power room and secure those locks.
                    
                                    Recorder: David Ford
                    
                    
                                    - Operation Report -
                    
                                    September 27th
                    
                                    1:00PM. The west barricade has been broken through and another exchange ensued. We sheltered the injured in the confiscation room on the first floor temporarily. 
                                    Twelve more people were injured in the battle.
                    
                                    Recorder: David Ford
                    
                    
                                    - Additional Report -
                    
                                    Three additional people were killed following the sudden appearance of an as of yet unknown creature.
                                    This creature is identified by missing patches of skin and razor-like claws. 
                                    However, its most distinguishing characteristic is its lance-like tongue, capable of piercing a human torso in an instant.
                                    Their numbers as well as their location remains unknown. 
                                    We have tentatively named this creature the "licker" and are currently in the process of developing countermeasures to deal with this new threat.

                """, ItemType.FILE);
    }

    public File getMEMO_TO_LEON(){
        return new File(100L,"Memo to Leon", """

                                                                                          MEMO TO LEON

                                                To Leon S. Kennedy,
                                                Congratulations on your assignment to the Raccoon City police department.
                                                We all look forward to having you as part of our team and promise to take good care of you.
                                                Welcome aboard!
                    
                                                From all the guys at the R.P.D.

                """, ItemType.FILE);
    }

    public File getOPERATION_REPORT2(){
        return new File(101L,"Operation Report 2", """

                                                                                        OPERATION REPORT 2

                            - Operation Report -
            
                            September 28th
            
                            Early morning 2:30AM. Zombies overran the operation room and another battle broke out. We lost four more people, including David.
                            We're down to four people, including myself. We failed to secure the weapons cache and hope for our survival continues to diminish.
                            We won't last much longer... We agreed upon a plan to escape through the sewer. There's a path leading from the precinct underground to the sewage disposal plant. We should be able to access the sewers through there. The only drawback is that there is now guarantee the sewage disposal plant is free of any possible dangers. We know our chances in the sewers are slim, but anything would be better than simply waiting here to die.
                            In order to buy more time, we locked the only door leading to the underground, which is located in the eastern office. We left the key behind in the western office since it's unlikely that any of those creatures have the intelligence to find it and unlock the door.
            
                            I pray that this operation report will be helpful to whoever may find it.
            
                            Recorder: Elliot Edward

                """, ItemType.FILE);
    }

    public File getCHIEF_DIARY(){
        return new File(102L,"Chief's Diary", """

                                                                                            CHIEF'S DIARY

                            September 23rd
                            It's all over. Those imbeciles from Umbrella have finally done it... Despite all their promises, they've ruined my town. Soon the streets will be infested with zombies. I'm beginning to think that I may be infected myself. I'll kill everyone in town if this turns out to be true!!!
            
            
                            September 24th
                            I was successful in spreading confusion among the police as planned. I've made sure that no one from the outside will come to help.
                            With the delays in police actions, no one will have the chance to escape my city alive. I've seen to it personally that all escape routes from inside the precinct have been cut off as well.
                            There are several survivors still attempting to escape through the lower levels, but I'll make sure no one gets out.
            
            
                            September 26th
                            I've had a change of heart about the remaining survivors inside the precinct. I've decided to hunt them down myself.
                            I shot Ed in the back through the heart less than an hour ago. I watched him writhe in pain upon the floor in a pool of his own blood. The expression on his face was positively exquisite. He died with his eyes wide open, staring up at me. It was beautiful.
                            I wonder if the mayor's daughter is still alive? I let her escape so I could enjoy hunting her down later...
                            I'm going to enjoy my new trophy. Yes, frozen forever in the pose I choose to give her.

                """, ItemType.FILE);
    }

    public File getFILM_A(){
        return new File(103L,"FILM A", """

                                                                                               FILM A

                                                                                    Code G Human Body Experiment

                                                                                            9/15  15:24

              """, ItemType.FILE);
    }

    public File getFILM_B(){
        return new File(104L,"FILM B", """

                                                                                               FILM B

                                                        Pictured in front of the Arukas tailor.
                                                        Regressed into a zombie within two hours.

                                                        Subject repeatedly complained about severe agitation of the epidermis in addition to feelings of nausea.
                                                        This happened up to the moment he lost conscience.

              """, ItemType.FILE);
    }

    public File getFILM_C(){
        return new File(105L,"FILM C", """

                                                                                               FILM C

                                                Development Code: T-103
    
                                                Due to accelerated metabolism relative to the earlier 00 series, this subject possesses exemplary regenerative capabilities.

                                                                                        PH-X016 File Data

              """, ItemType.FILE);
    }

    public File getFILM_D(){
        return new File(106L,"FILM D", """

                                                                                               FILM D

                    """, ItemType.FILE);
    }


    //FILES

    public File getPATROL_REPORT(){
        return new File(107L,"Patrol Report", """
                                                                                            PATROL REPORT

                            Report summary for patrol conducted on the streets of Raccoon City on August 10, 1998.
                            Observations: Several reports of strange activities and sightings of unidentified individuals near the police department. Nothing conclusive at this point, but officers are advised to remain cautious.
            
                            No significant incidents to report at this time.
                """, ItemType.FILE);
    }

    public File getSECRETARY_DIARY_A(){
        return new File(108L,"Secretary's Diary A", """
                                                                                           SECRETARY'S DIARY A

                            April 6th
                            I accidentally moved one of the stone statues on the second floor when I leaned against it. When the chief found out about it, he was furious. I swear the guy nearly bit my head off, screaming at me never to touch the statue again. If it's so important, then maybe he shouldn't have put it out in the open like that...
            
                            April 7th
                            I heard that all the art pieces from the chief's collection are rare items, literally worth hundreds of thousands of dollars. I don't know which is the bigger mystery: where he finds those tacky things, or where he's getting the money to pay for them.
            
                            May 10th
                            I wasn't surprised to see the chief come in today with yet another large picture frame in his hands. This time it was a really disturbing painting depicting a nude person being hanged. I was appalled by the expression on the chief's face as he leered at that painting. Why anyone would consider something like that to be a work of art is beyond my comprehension...
                """, ItemType.FILE);
    }

    public File getSECRETARY_DIARY_B(){
        return new File(109L,"Secretary's Diary B", """
                                                                                           SECRETARY'S DIARY B

                            June 8th
                            As I was straightening up the chief's room, he burst through the door with a furious look on his face. It's only been 2 months since I've started working here, but that was the second time I've seen him like this. The last time was when I bumped into that statue, only this time he looked even more agitated than ever. I seriously thought for a moment that he was going to hurt me.
            
                            June 15th
                            I finally discovered what the chief has been hiding all along... If he finds out that I know, my life will be in serious danger. It's getting late already. I'm just going to have to take this a day at a time...
                """, ItemType.FILE);
    }

    public File getWATCHMAN_DIARY(){
        return new File(110L,"Watchman's Diary", """
                                                                                            WATCHMAN'S DIARY

                            August 11th
                            I finally had the chance to see blue skies for the first time in ages, but it did little to lift my spirits. I was reprimanded by the chief for neglecting my duties while I was up on the clock tower. There's only one thing I still don't understand: the chief seemed to be more concerned about the fact that I was up on the tower rather than that I was neglecting my duties. Why was access to the tower prohibited in the first place anyway?
            
                            September 5th
                            I recently talked to the old man who works in the scrap yard out back. His name is Thomas. He's a quiet man and really seems to enjoy chess. He even went so far as to design a special key and lock engraved with chess pieces on them for one of the doors in the disposal yard. We made plans to play chess tomorrow night. I can't help but wonder how good he is. One thing that's been bothering me about him is the way that he's always scratching himself... Does he have some sort of skin disease or is he just rude?
            
                            September 9th
                            Thomas was a much better player than I had imagined. I used to think of myself as a fairly decent player, but he did a pretty good job of humbling me. About the only thing I imagine that could match his skills in chess is his appetite. All the guy did was talk about food throughout the entire game. He sounded fairly healthy, but he didn't look quite right... I wonder if he's okay.
            
                            September 12th
                            I was supposed to play another game of chess with Thomas, but we had to cancel because he hasn't been feeling too well. He stopped by to see me, but I told him to go back and rest since he literally looked like the walking dead. He insisted he was just fine, but I could tell he was really having problems. Come to think of it, I haven't been feeling too good myself lately...
                """, ItemType.FILE);
    }

    public File getMAIL_TO_THE_CHIEF(){
        return new File(111L,"Mail to the Chief", """
                                                                                            MAIL TO THE CHIEF

                            To: Mr. Brian Irons, Chief of the Raccoon City Police Dept.
            
                            We have lost the mansion lab facility due to the renegade operative, Albert Wesker. Fortunately, his interference will have no lasting effects upon our continued virus research. Our only present concern is the presence of the remaining S.T.A.R.S. members: Redfield, Valentine, Burton, Chambers and Vickers. If it comes to light that S.T.A.R.S. have any evidence as to the activities of our research, dispose of them in a way that would appear to be purely accidental. Continue to monitor their progress and make certain their knowledge does not go public. Annette will continue to be your contact throughout this affair.
            
                            William Birkin
            
                            To: Mr. Brian Irons, Chief of the Raccoon City Police Dept.
            
                            I have deposited the amount of US $10,000 to the account for your services this term as per our agreement. The development of the G-virus scheduled to replace the T-virus, is near completion. Once completed, I am certain that I will be appointed to be a member of the executive board for Umbrella Inc. It is imperative that we proceed with extreme caution. Redfield and the remaining S.T.A.R.S. members are still attempting to uncover information on the project. Continue to monitor their activities and block all attempts to investigate the underground research facilities.
            
                            William Birkin
            
                            To: Mr. Brian Irons, Chief of the Raccoon City Police Dept.
            
                            We have a problem. I have received information informing me that Umbrella HQ has sent spies to recover my research on the G-virus. There are an unknown number of agents involved. They must not be allowed to take this project away from me as it represents my entire life's work. Search the city thoroughly for any suspicious persons. Detain any such individuals by whatever means deemed necessary and contact me immediately through Annette. With these precautions, any possible threat should be eliminated. I will not allow anyone to steal my work on the G-virus. Not even Umbrella...
            
                            William Birkin
                """, ItemType.FILE);
    }

    public File getSEWER_MANAGER_FAX(){
        return new File(112L,"Sewer Manager Fax", """
                                                                                            SEWER MANAGER FAX

                            -User List of the Connecting Facility-
            
                            On the first and third Wednesdays of the month, Angelica Margaret, chief of maintenance, will make use of the facilities. Be sure to reduce the moisture levels in the facility by activating the fan, as the equipment she will be using is susceptible to the effects of water vapors.
            
                            On the 28th of every month, the chemical transporter Don Weller will use the facility. The chemicals he will be transporting are extremely volatile. Extreme caution should be observed throughout their transport.
            
                            On the 6th and 16th of every month, police chief Brian Irons will visit the facility to attend the regular meeting that takes place in the lab.
            
                            On the fourth Friday of every other month, William Birkin will use the facility to conduct a training seminar for the Chicago branch of Umbrella Inc. As the probability of an attack upon William Birkin will be high, take every measure conceivable to guard his life.
            
                            You will be informed of all other potential visitors and the times they will arrive as needed. Guide these individuals to their destination safely. We expect nothing but the best from you.
            
                            Charles Coleman
                            Secretary Chief
                            Umbrella Headquarters
                """, ItemType.FILE);
    }

    public File getSEWER_MANAGE_DIARY(){
        return new File(113L,"Sewer Manager Diary", """
                                                                                            SEWER MANAGER DIARY

                            June 28th
                            It's been a while, but I saw Don today and we talked after completing our work. He told me he had been sick in bed until yesterday. 
                            It really doesn't come as much of a surprise given how long he's been working here. He was sweating like a horse and kept scratching his body while we were talking. 
                            I asked if he was hot, but he just looked at me funny. What's wrong with him anyway?
            
                            July 7th
                            Chief Irons has been visiting the lab quite often lately. I don't know what he's doing over there but he always looks grim. 
                            The expression on his face has been even more unsettling than usual... My guess is that it's because of Dr. Birkin's impossible requests. 
                            The chief has my sympathies though. After all he's done for the town, he doesn't deserve this.
            
                            July 21st
                            I rarely drink because I'm on the graveyard shift, but I don't suppose I have much to complain about it since this is how I make my living.
            
                            August 16th
                            Chief Irons came in late today, looking grimmer than his usual self. I tried to joke with him to cheer him up but he wasn't amused. 
                            He pulled his gun and threatened to shoot me! I was able to calm him down, but that guy must have some serious problems. He knows he can't enter the lab without my help and my medal. 
                            This is what it means for the chief "to serve and protect"!?
            
                            August 21st
                            William informed me that the police and media have begun their investigation on Umbrella's affairs. 
                            He said that the investigation will be citywide and that there is a possibility they'll even search through the sewers. He asked me to suspend all Umbrella sewer facility operations until the investigation has concluded. 
                            The sewer will still be used for passage, but he stressed that I have to be extremely cautious and that I'd lose my job if anyone finds out about this operation.
                """, ItemType.FILE);
    }

    public File getLAB_SECURITY_MANUAL(){
        return new File(114L,"Lab Security Manual", """
                                                                                        LABORATORY SECURITY MANUAL

                            Laboratory Security Manual
                            -Security measures in case of an emergency-
            
                            In the instance of an uncontainable biohazardous breakout, all security measures will be directed toward the underground transport facility.
            
                            In the instance that any abnormalities are detected among cargo in transit, all materials will automatically be transported from the loading zone to the designated high-speed train. 
                            At which point, all materials will be isolated and disposed of immediately.
            
                            In the instance of a Class 1 emergency, the entire train will be purged and disposed of without delay.
            
                            In the instance that the lab itself becomes contaminated, the northern most route currently used to transport materials to and from the facility will be designated as the emergency escape route. 
                            This route will secure passage to the relay point outside the city limits.
            
                            Disclosure about any information regarding research conducted here, or the existence of this facility, is strictly prohibited. 
                            Since it is top priority to keep all research classified, escape access may be denied under certain extenuating circumstances.
                """, ItemType.FILE);
    }

    public File getP_EPSILON_REPORT(){
        return new File(115L,"P-epsilon report", """
                                                                                  INVESTIGATIVE REPORT ON P-EPSILON GAS

                            -This report demands immediate attention-
            
                            The P-epsilon gas has been proven capable of incapacitating all known B.O.W.s (Bio Organic Weapon). As such, it has been designated for emergency usage in the event of a B.O.W. escape. 
                            Reports based on data collected during prior incidents indicate the potential for negative side effects.
            
                            The P-epsilon gas has proven to weaken the B.O.W.s' cellular functions. However, prolonged or repeated exposures will result in the creation of adaptive antibodies to the agent. 
                            Furthermore, some species have been observed to absorb the P-epsilon gas as a source of nutrition and use the toxins extracted against anything perceived as a threat.
            
                            Use of P-epsilon gas should be severely limited to extreme cases only.
            
                            We strongly request the authority to re-evaluate the P-epsilon gas deployment system. We would like this re-evaluation to take place immediately.
            
                            2nd R&D Room/Security Team
                """, ItemType.FILE);
    }

    public File getUSER_REGISTRATION(){
        return new File(116L,"User Registration", """
                                                                                             USER REGISTRATION

                                                                         Temporary User Registration for the Culture Experiment Room.
                
                                                                         User Name: "GUEST"
                                                                         Password: None
                
                                                                         Valid for 24 hours.
                """, ItemType.FILE);
    }

    public Item getVACCINE_SYNTHESIS(){
        return new File(117L,"Vaccine Synthesis", """
                                                          INSTRUCTIONS FOR THE SYNTHESIS OF THE G-VIRUS ANTIGEN: G-VACCINE. CODE NAMED "DEVIL."

                Any beings infected by the G-virus will reproduce through the impregnation of an embryo within another living being. 
                Unless rejected by the host, the embryo will undertake a process of gradual cellular invasion, infecting the host's cells on a molecular level as it rewrites their DNA. 
                Once the metamorphosis is complete, the host will be capable of continuing this cycle of self-replication. The duration of time for the process to run its course will vary from subject to subject. 
                In the early stages of cellular invasion, it is possible to halt progression of the metamorphosis through the administration of the G-vaccine antigen.

                The following procedure details its synthesis.

                The vaccine creation requires the base vaccine. This can be arranged by the activator VAM. First set the empty cartridge to the VAM and activate it. 
                After several moments the process will be complete and the white-colored base vaccine will be set in the cartridge automatically. Then confirm the green light is on, remove the cartridge and proceed to the next step.

                Once the base vaccine has been prepared, set it in the vaccine synthesis machine located in the P-4 level experiment room. The machine is fully automated and only requires the user to push the sequence start switch. 
                At this point, the program will run automatically and synthesis will be complete within approximately 10 seconds.

                As the synthesis of DEVIL is an extremely delicate process, the quality will vary with slight shocks or changes in temperature. Careful handling is required for the proper results.
                """, ItemType.FILE);
    }

    //TODO: add nintendo 64 version's files

}
