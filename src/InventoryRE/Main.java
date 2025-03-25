package InventoryRE;

import InventoryRE.Items.Item;
import InventoryRE.Items.ItemType;

import java.util.Scanner;

import static InventoryRE.Inventories.Inventory.Claire;
import static InventoryRE.Inventories.Inventory.Leon;
import static InventoryRE.Inventories.Inventory.Ada;
import static InventoryRE.Inventories.Inventory.Sherry;

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
                    switch (opt_character) {
                        case 1:
                            Claire.startCLI();
                            break;
                        case 2:
                            Leon.startCLI();
                            break;
                        case 3:
                            Ada.startCLI();
                            break;
                        case 4:
                            Sherry.startCLI();
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