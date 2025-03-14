# OBJECT-ORIENTED INVENTORY SYSTEM

This project aims to recreate some of the main features of the classic Resident Evil 2 inventory and item management system. It allows you to create items, list them in your inventory, update their characteristics, or merge two items to generate a new one with special attributes. Additionally, you can transfer items between your inventory and the item box.

⚠️ Disclaimer: This is NOT a game, but a backend system for data manipulation inspired by Resident Evil's inventory mechanics.

Feel free to fork this project ;)

# Current Features

1. ArrayList-based data structure. 
2. Usage of enums, interfaces, abstract classes, final classes, records, overriding & overloading, Hash (Set/Map).
3. Item combination system, like mixing herbs, reloading and upgrading weapons, and crafting specific key items. 
4. Inventory storage system, allowing you to deposit and retrieve items from the item box. 
5. Comprehensive listing methods for the entire inventory system, including the item box, archive, and equipments. 
6. Weapon usage mechanics. (Not strictly an inventory feature, but adds to the complexity of the project)
7. Film development system, allowing you to reveal hidden contents. 
8. File reading system.

# Known Issues & Limitations

1. Some methods may contain bugs, logic mistakes or unexpected behaviors.
2. Some features are still under development.

# Planned Features

1. Refactoring with Streams, and other optimizations.
2. Frontend development (currently in progress).
3. Database integration (currently in progress).
4. Full web version using RESTful API concepts with Spring Boot and JPA/Hibernate (currently in progress).

# Getting Started

1. Download the project's ZIP file and open it in your IDE.
2. All predefined inventories are already set up:

        ItemDatabase db = new ItemDatabase(); // use db to properly acess items in inventory
        Inventory Leon = new Inventory(Characters.LEON);
        Inventory Claire = new Inventory(Characters.CLAIRE);
        Inventory Ada = new Inventory(Characters.ADA);
        Inventory Sherry = new Inventory(Characters.SHERRY);

3. You can start calling methods. Here are some examples:

         Leon.collectItem(true, db.<item_here>);
         // Adds an item to Leon's inventory.
         
         Leon.listInventory();
         // Lists all items in the inventory.
         
         Leon.itemBoxIn(db.<item_here>);
         // Stores an item in the item box.
         
         Leon.itemBoxOut(db.<item_here>);
         // Retrieves an item from the item box.
         
         Leon.listItemBox();
         // Lists all stored items in the item box.
         
         Claire.combineItems(db.<item1>, db.<item2>);
         // Combines two items (e.g., mixing herbs, upgrading weapons).
         
         Claire.useWeapon(db.<weapon_here>, <number_of_uses>);
         // Uses a weapon, reducing its ammo.
         
         Claire.darkRoom(db.<film_here>);
         // Develops a film, revealing hidden content.
         
         Claire.readFile(db.<file_here>);
         // Reads a document.
         
         Claire.listFiles();
         // Opens the archive section.

# Recent Updates

1. Introduced ItemDatabase to properly instantiate all objects for easier reference.
2. Created collectItem() and made addToInventory() private.
3. Refactored multiple methods to be private and final for better encapsulation.
4. Refactored use of Generics to extend Item in order to solve cast exceptions.
5. Implemented use of Hash (Map and Set) to increase performance and reduce code.
6. Improved use of ternary operator and switch case to increase performance and reduce code.
7. Refactored getItemByName to getItem (using Object directly as a parameter), eliminating issues with items that have the same name but different internal attributes.
8. Refactored to initialize all inventories at once with predefined starting items.