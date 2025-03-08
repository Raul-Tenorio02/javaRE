# OBJECT-ORIENTED INVENTORY SYSTEM

This project aims to recreate some of the main features of the classic Resident Evil 2 inventory and item management system. It allows you to create items, list them in your inventory, update their characteristics, or merge two items to generate a new one with special attributes. Additionally, you can transfer items between your inventory and the item box.

⚠️ Disclaimer: This is NOT a game, but a backend system for data manipulation inspired by Resident Evil's inventory mechanics.

Feel free to fork this project ;)

# Current Features

1. ArrayList-based data structure. 
2. Usage of generics, enums, interfaces, abstract classes, final classes, records, method overriding, and overloading. 
3. Item combination system, like mixing herbs, reloading and upgrading weapons, and crafting specific key items. 
4. Inventory storage system, allowing you to deposit and retrieve items from the item box. 
5. Comprehensive listing methods for the entire inventory system, including the item box, archive, and equipments. 
6. Weapon usage mechanics. (Not strictly an inventory feature, but increase the use of other methods)
7. Film development system, allowing you to reveal hidden contents. 
8. File reading system.

# Known Issues & Limitations

1. Some methods may contain bugs, logic mistakes or unexpected behaviors.
2. Some features are still under development.

# Planned Features

1. Refactoring with Hash, Streams, and other optimizations.
2. Frontend development (currently in progress).
3. Database integration (currently in progress).
4. Full web version using RESTful API concepts with Spring Boot and JPA/Hibernate (currently in progress).

# Getting Started

1. Download the project's ZIP file and open it in your IDE.
2. Some predefined inventories are already set up:

         Inventory<Object> Leon = new Inventory<>();
         Inventory<Object> Claire = new Inventory<>();
         Inventory<Object> Ada = new Inventory<>();
         Inventory<Object> Sherry = new Inventory<>();

3. You can start calling methods. Here are some examples:

         Leon.collectItem(true, ItemDatabase.<item_here>);
         // Adds an item to Leon's inventory.
         
         Leon.listInventory();
         // Lists all items in the inventory.
         
         Leon.itemBoxIn(ItemDatabase.<item_here>);
         // Stores an item in the item box.
         
         Leon.itemBoxOut(ItemDatabase.<item_here>);
         // Retrieves an item from the item box.
         
         Leon.listItemBox();
         // Lists all stored items in the item box.
         
         Claire.combineItems(ItemDatabase.<item1>, ItemDatabase.<item2>);
         // Combines two items (e.g., mixing herbs, upgrading weapons).
         
         Claire.useWeapon(ItemDatabase.<weapon_here>, <number_of_uses>);
         // Uses a weapon, reducing its durability or ammo.
         
         Claire.darkRoom(ItemDatabase.<film_here>);
         // Develops a film, revealing hidden content.
         
         Claire.readFile(ItemDatabase.<file_here>);
         // Reads an in-game document.
         
         Claire.listFiles();
         // Opens the archive section.

# Recent Updates

1. Introduced ItemDatabase to properly instantiate all objects for easier reference.
2. Created collectItem() and made addToInventory() private.
3. Refactored multiple methods to be private and final for better encapsulation.