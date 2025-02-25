package InventoryRE.Key;

import InventoryRE.Files.File;
import InventoryRE.Item;
import InventoryRE.ItemType;

public final class KeyItem extends Item implements FilmInterface{

    KeyType typeKey;
    private int uses;

    public KeyItem(String name, String description, ItemType type, KeyType typeKey) {
        super(name, description, type);
        this.typeKey = typeKey;
    }

    public KeyItem(String name, String description, ItemType type, KeyType typeKey , int uses) {
        super(name, description, type);
        this.typeKey = typeKey;
        this.uses = uses;
    }

    public int getUses() {
        return uses;
    }

    public KeyType getTypeKey() {
        return typeKey;
    }

    @Override
    public String toString() {
        if (typeKey == KeyType.INK_RIBBON) {
            return "{" + getName() + ", " + getDescription() + ", " + getUses() + "}";
        }
        return "{" + getName() + ", " + getDescription() + "}";
    }

    @Override
    public File revealFilm(String name) {
        File fileRevealed;
        if (this.typeKey == KeyType.FILM) {
            if (this.getName().equals("Film A")) {
                fileRevealed = new File("FILM A", """

                                                                                   FILM A
                        
                                                                          Code G Human Body Experiment
                        
                                                                                9/15  15:24
                        """, ItemType.FILE);
                return fileRevealed;
            } else if (this.getName().equals("Film B")) {
                fileRevealed = new File("FILM B", """

                                                                                   FILM B
                        
                        Pictured in front of the Arukas tailor.
                        Regressed into a zombie within two hours.
                        
                        Subject repeatedly complained about severe agitation of the epidermis in addition to feelings of nausea.
                        This happened up to the moment he lost conscience.
                        
                        """, ItemType.FILE);
                return fileRevealed;
            } else if (this.getName().equals("Film C")) {
                fileRevealed = new File("FILM C", """

                                                                                   FILM C
                        
                        Development Code: T-103
                        
                        Due to accelerated metabolism relative to the earlier 00 series, this subject possesses exemplary regenerative capabilities.
                        
                                                                                                                                   PH-X016 File Data
                        
                        """, ItemType.FILE);
                return fileRevealed;
            } else if (this.getName().equals("Film D")) {
                fileRevealed = new File("FILM D", """
                        
                                                                                   FILM D
                        
                        """, ItemType.FILE);
                return fileRevealed;
            }
        } else {
            System.out.println("This item cannot be revealed.");
        }
        return null;
    }
}
