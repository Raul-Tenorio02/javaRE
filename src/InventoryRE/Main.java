package InventoryRE;

import java.util.Scanner;

import static InventoryRE.Inventory.Inventory.Claire;
import static InventoryRE.Inventory.Inventory.Leon;
import static InventoryRE.Inventory.Inventory.Ada;
import static InventoryRE.Inventory.Inventory.Sherry;

public class Main {

    /*                          OG Resident Evil 2's Inventory rebuilt in Java

                                      author: Raul-Tenorio02 on GitHub
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opt_menu = 0;
        while (opt_menu != 2) {
            System.out.println("\n----------------------------RE2's INVENTORY (1998) REBUILT ON JAVA--------------------------");
            System.out.println("1. Start");
            System.out.println("2. Exit");
            System.out.print("Type here: ");
            opt_menu = scanner.nextInt();
            scanner.nextLine();
            switch (opt_menu) {
                case 1:
                    System.out.println("\nSelect any character:");
                    System.out.println("1. Claire");
                    System.out.println("2. Leon");
                    System.out.println("3. Ada");
                    System.out.println("4. Sherry");
                    System.out.print("Type here: ");
                    int opt_character = scanner.nextInt();
                    scanner.nextLine();
                    switch (opt_character){
                        //TODO: CLAIRE
                        case 1:
                            int opt_CL1 = 0;
                            while (opt_CL1 != 5) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Open Item Section");
                                System.out.println("2. Open File Section");
                                System.out.println("3. Open Item Box");
                                System.out.println("4. Collect items");
                                System.out.println("5. Exit");
                                System.out.print("Type here: ");
                                opt_CL1 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_CL1) {
                                    case 1:
                                        int opt_CL2 = 0;
                                        while (opt_CL2 != 4) {
                                            Claire.listInventory();
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Fire a weapon.");
                                            System.out.println("2. Combine items.");
                                            System.out.println("3. Reveal a file's content.");
                                            System.out.println("4. Return.");
                                            System.out.print("Type here: ");
                                            opt_CL2 = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_CL2) {
                                                case 1:
                                                    System.out.println("\nWhich weapon do you want to fire?");
                                                    System.out.print("Type here (ID): ");
                                                    int opt_gun = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.useWeapon(opt_gun, 1);
                                                    break;
                                                case 2:
                                                    Claire.listInventory();
                                                    System.out.println("\nSelect items to combine (ID).");
                                                    System.out.print("Item 1: ");
                                                    int item1 = scanner.nextInt();
                                                    scanner.nextLine();
                                                    System.out.print("Item 2: ");
                                                    int item2 = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.combineItems(item1, item2);
                                                    Claire.listInventory();
                                                    break;
                                                case 3:
                                                    Claire.listInventory();
                                                    System.out.println("\n---------------------------DARK ROOM--------------------------");
                                                    System.out.println("Choose a file to develop (ID)");
                                                    System.out.print("Type here: ");
                                                    int fileToReveal = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.darkRoom(fileToReveal);
                                                    break;
                                                case 4:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        int opt_CL3 = 0;
                                        while (opt_CL3 != 2) {
                                            Claire.listFiles();
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Read a file.");
                                            System.out.println("2. Return.");
                                            System.out.print("Type here: ");
                                            opt_CL3 = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_CL3) {
                                                case 1:
                                                    System.out.println("\nChoose a file (ID): ");
                                                    System.out.print("Type here: ");
                                                    int fileToRead = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.readFile(fileToRead);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        int opt_itemBox = 0;
                                        while (opt_itemBox != 3) {
                                            Claire.listItemBox();
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Storage Item.");
                                            System.out.println("2. Retrieve Item.");
                                            System.out.println("3. Return.");
                                            System.out.print("Type here: ");
                                            opt_itemBox = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_itemBox) {
                                                case 1:
                                                    Claire.listInventory();
                                                    System.out.println("\nSelect an item to storage (ID).");
                                                    System.out.print("Type here: ");
                                                    int itemToStorage = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.itemBoxIn(itemToStorage);
                                                    Claire.listItemBox();
                                                    break;
                                                case 2:
                                                    System.out.println("\nSelect an item to retrieve (ID).");
                                                    System.out.print("Type here: ");
                                                    int itemToRetrieve = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Claire.itemBoxOut(itemToRetrieve);
                                                    Claire.listInventory();
                                                    break;
                                                case 3:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        Claire.listDatabase();
                                        System.out.println("\nSelect an item to collect (ID).");
                                        System.out.print("Type here: ");
                                        int itemToCollect = scanner.nextInt();
                                        scanner.nextLine();
                                        Claire.collectItem(true, itemToCollect);
                                        Claire.listInventory();
                                        break;
                                    case 5:
                                        System.out.println("\nReturning to Main Menu...");
                                        break;
                                    default:
                                        System.out.println("\nPlease, insert a valid option.");
                                        break;
                                }
                            }
                            break;
                        //TODO: LEON
                        case 2:
                            int opt_LE1 = 0;
                            while (opt_LE1 != 5) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Open Item Section");
                                System.out.println("2. Open File Section");
                                System.out.println("3. Open Item Box");
                                System.out.println("4. Collect items");
                                System.out.println("5. Exit");
                                System.out.print("Type here: ");
                                opt_LE1 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_LE1) {
                                    case 1:
                                        int opt_LE2 = 0;
                                        while (opt_LE2 != 4) {
                                            Leon.listInventory();
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Fire a weapon.");
                                            System.out.println("2. Combine items.");
                                            System.out.println("3. Reveal a file's content.");
                                            System.out.println("4. Return.");
                                            System.out.print("Type here: ");
                                            opt_LE2 = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_LE2) {
                                                case 1:
                                                    System.out.println("\nWhich weapon do you want to fire?");
                                                    System.out.print("Type here (ID): ");
                                                    int opt_gun = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Leon.useWeapon(opt_gun, 1);
                                                    break;
                                                case 2:
                                                    Leon.listInventory();
                                                    System.out.println("\nSelect items to combine (ID).");
                                                    System.out.print("Item 1: ");
                                                    int item1 = scanner.nextInt();
                                                    scanner.nextLine();
                                                    System.out.print("Item 2: ");
                                                    int item2 = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Leon.combineItems(item1, item2);
                                                    Leon.listInventory();
                                                    break;
                                                case 3:
                                                    Leon.listInventory();
                                                    System.out.println("\n---------------------------DARK ROOM--------------------------");
                                                    System.out.println("Choose a file to develop (ID)");
                                                    System.out.print("Type here: ");
                                                    int fileToReveal = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Leon.darkRoom(fileToReveal);
                                                    break;
                                                case 4:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        int opt_LE3 = 0;
                                        while (opt_LE3 != 2) {
                                            Leon.listFiles();
                                            System.out.println("\nWhat do you want to do next?");
                                            System.out.println("1. Read a file.");
                                            System.out.println("2. Return.");
                                            System.out.print("Type here: ");
                                            opt_LE3 = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (opt_LE3) {
                                                case 1:
                                                    System.out.println("\nChoose a file (ID): ");
                                                    System.out.print("Type here: ");
                                                    int fileToRead = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Leon.readFile(fileToRead);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        Leon.listItemBox();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Storage Item.");
                                        System.out.println("2. Retrieve Item.");
                                        System.out.println("3. Return.");
                                        System.out.print("Type here: ");
                                        int opt_set_itemBox = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_set_itemBox) {
                                            case 1:
                                                Leon.listInventory();
                                                System.out.println("\nSelect an item to storage (ID).");
                                                System.out.print("Type here: ");
                                                int itemToStorage = scanner.nextInt();
                                                scanner.nextLine();
                                                Leon.itemBoxIn(itemToStorage);
                                                Leon.listItemBox();
                                                break;
                                            case 2:
                                                System.out.println("\nSelect an item to retrieve (ID).");
                                                System.out.print("Type here: ");
                                                int itemToRetrieve = scanner.nextInt();
                                                scanner.nextLine();
                                                Leon.itemBoxOut(itemToRetrieve);
                                                Leon.listInventory();
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    case 4:
                                        Leon.listDatabase();
                                        System.out.println("\nSelect an item to collect (ID).");
                                        System.out.print("Type here: ");
                                        int itemToCollect = scanner.nextInt();
                                        scanner.nextLine();
                                        Leon.collectItem(true, itemToCollect);
                                        Leon.listInventory();
                                        break;
                                    case 5:
                                        System.out.println("\nReturning to Main Menu...");
                                        break;
                                    default:
                                        System.out.println("\nPlease, insert a valid option.");
                                        break;
                                }
                            }
                            break;
                        //TODO: ADA
                        case 3:
                            int opt_AD1 = 0;
                            while (opt_AD1 != 5) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Open Item Section");
                                System.out.println("2. Open File Section");
                                System.out.println("3. Open Item Box");
                                System.out.println("4. Collect items");
                                System.out.println("5. Exit");
                                System.out.print("Type here: ");
                                opt_AD1 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_AD1) {
                                    case 1:
                                        Ada.listInventory();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Fire a weapon.");
                                        System.out.println("2. Combine items.");
                                        System.out.println("3. Reveal a file's content.");
                                        System.out.println("4. Return.");
                                        System.out.print("Type here: ");
                                        int opt_AD2 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_AD2) {
                                            case 1:
                                                System.out.println("\nWhich weapon do you want to fire?");
                                                System.out.print("Type here (ID): ");
                                                int opt_gun = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.useWeapon(opt_gun, 1);
                                                break;
                                            case 2:
                                                Ada.listInventory();
                                                System.out.println("\nSelect items to combine (ID).");
                                                System.out.print("Item 1: ");
                                                int item1 = scanner.nextInt();
                                                scanner.nextLine();
                                                System.out.print("Item 2: ");
                                                int item2 = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.combineItems(item1, item2);
                                                Ada.listInventory();
                                                break;
                                            case 3:
                                                Ada.listInventory();
                                                System.out.println("\n---------------------------DARK ROOM--------------------------");
                                                System.out.println("Choose a file to develop (ID)");
                                                System.out.print("Type here: ");
                                                int fileToReveal = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.darkRoom(fileToReveal);
                                                break;
                                            case 4:
                                                break;
                                        }
                                        break;
                                    case 2:
                                        Ada.listFiles();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Read a file.");
                                        System.out.println("2. Return.");
                                        System.out.print("Type here: ");
                                        int opt_AD3 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_AD3) {
                                            case 1:
                                                System.out.println("\nChoose a file (ID): ");
                                                System.out.print("Type here: ");
                                                int fileToRead = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.readFile(fileToRead);
                                                break;
                                            case 2:
                                                break;
                                        }
                                    case 3:
                                        Ada.listItemBox();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Storage Item.");
                                        System.out.println("2. Retrieve Item.");
                                        System.out.println("3. Return.");
                                        System.out.print("Type here: ");
                                        int opt_set_itemBox = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_set_itemBox) {
                                            case 1:
                                                Ada.listInventory();
                                                System.out.println("\nSelect an item to storage (ID).");
                                                System.out.print("Type here: ");
                                                int itemToStorage = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.itemBoxIn(itemToStorage);
                                                Ada.listItemBox();
                                                break;
                                            case 2:
                                                System.out.println("\nSelect an item to retrieve (ID).");
                                                System.out.print("Type here: ");
                                                int itemToRetrieve = scanner.nextInt();
                                                scanner.nextLine();
                                                Ada.itemBoxOut(itemToRetrieve);
                                                Ada.listInventory();
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    case 4:
                                        Ada.listDatabase();
                                        System.out.println("\nSelect an item to collect (ID).");
                                        System.out.print("Type here: ");
                                        int itemToCollect = scanner.nextInt();
                                        scanner.nextLine();
                                        Ada.collectItem(true, itemToCollect);
                                        Ada.listInventory();
                                        break;
                                    case 5:
                                        System.out.println("\nReturning to Main Menu...");
                                        break;
                                    default:
                                        System.out.println("\nPlease, insert a valid option.");
                                        break;
                                }
                            }
                            break;
                        //TODO: SHERRY
                        case 4:
                            int opt_SH1 = 0;
                            while (opt_SH1 != 5) {
                                System.out.println("\nWhat do you want to do next?");
                                System.out.println("1. Open Item Section");
                                System.out.println("2. Open File Section");
                                System.out.println("3. Collect items");
                                System.out.println("4. Exit");
                                opt_SH1 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opt_SH1) {
                                    case 1:
                                        Sherry.listInventory();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Combine items.");
                                        System.out.println("2. Reveal a file's content.");
                                        System.out.println("3. Return.");
                                        System.out.print("Type here: ");
                                        int opt_setSH2 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_setSH2) {
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
                                                Sherry.listInventory();
                                                System.out.println("\n---------------------------DARK ROOM--------------------------");
                                                System.out.println("Choose a file to develop (ID)");
                                                System.out.print("Type here: ");
                                                int fileToReveal = scanner.nextInt();
                                                scanner.nextLine();
                                                Sherry.darkRoom(fileToReveal);
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    case 2:
                                        Sherry.listFiles();
                                        System.out.println("\nWhat do you want to do next?");
                                        System.out.println("1. Read a file.");
                                        System.out.println("2. Return.");
                                        System.out.print("Type here: ");
                                        int opt_setSH3 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opt_setSH3) {
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
                                    case 3:
                                        Sherry.listDatabase();
                                        System.out.println("\nSelect an item to collect (ID).");
                                        System.out.print("Type here: ");
                                        int itemToCollect = scanner.nextInt();
                                        scanner.nextLine();
                                        Sherry.collectItem(true, itemToCollect);
                                        Sherry.listInventory();
                                        break;
                                    case 4:
                                        System.out.println("\nReturning to Main Menu...");
                                        break;
                                    default:
                                        System.out.println("\nPlease, insert a valid option.");
                                        break;
                                }
                            }
                            break;
                        default:
                            System.out.println("\nPlease, insert a valid option.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nClosing application...");
                    scanner.close();
                    break;
                default:
                    System.out.println("\nPlease, insert a valid option.");
                    break;
            }
        }
    }
}