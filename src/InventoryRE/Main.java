package InventoryRE;

import java.util.InputMismatchException;
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
            try {
                System.out.println("\n----------------------------RE2's INVENTORY (1998) REBUILT ON JAVA--------------------------");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.print("Type here: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("\nInvalid input!");
                    scanner.next();
                    continue;
                }
                opt_menu = scanner.nextInt();
                scanner.nextLine();
                switch (opt_menu) {
                    case 1:
                        int opt_character;
                        System.out.println("\nSelect any character:");
                        System.out.println("1. Claire");
                        System.out.println("2. Leon");
                        System.out.println("3. Ada");
                        System.out.println("4. Sherry");
                        System.out.print("Type here: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("\nInvalid input!");
                            scanner.next();
                            continue;
                        }
                        opt_character = scanner.nextInt();
                        scanner.nextLine();
                        switch (opt_character) {
                            case 1 -> Claire.startCLI();
                            case 2 -> Leon.startCLI();
                            case 3 -> Ada.startCLI();
                            case 4 -> Sherry.startCLI();
                            default -> System.out.println("\nInvalid character selection. Try again.");
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
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input!");
                scanner.nextLine();

            } catch (Exception e) {
                System.err.println("\nAn unexpected error occurred: " + e.getMessage());
            }
        }
    }
}