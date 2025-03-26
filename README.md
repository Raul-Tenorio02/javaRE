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

1. Some features can present logic mistakes or unexpected behaviors.
2. Some features are still under development.

# Planned Features

1. Refactoring with Streams, and other optimizations (currently in progress).
2. Frontend development (currently in progress).
3. Database integration (currently in progress).
4. Full web version using RESTful API concepts with Spring Boot and JPA/Hibernate (currently in progress).
5. Improve commenting.
6. Add Try/Catch.

# Getting Started

1. Download the project's ZIP file and open it in your IDE.
2. All predefined inventories are already set up:
3. Run the application and start exploring.

# Recent Updates

1. Introduced ItemDatabase to properly instantiate all objects for easier reference.
2. Created collectItem() and made addToInventory() private.
3. Refactored multiple methods to be private and final for better encapsulation.
4. Refactored use of Generics to extend Item in order to solve cast exceptions.
5. Implemented use of Hash (Map and Set) to increase performance and reduce code.
6. Improved use of ternary operator and switch case to increase performance and reduce code.
7. Refactored getItemByName to getItem (using Object directly as a parameter), eliminating issues with items that have the same name but different internal attributes.
8. Refactored to initialize all inventories at once with predefined starting items.
9. Moved Characters inventories to Inventory Class and declared them static.
10. Reordered packages to improve architecture. 
11. Started implementing a CLI.
12. Started using streams.