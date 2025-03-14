package InventoryRE.Inventory;

public abstract class Item {

    // i'm still getting used on commenting my projects, sorry for that :v
    private Long id;
    private String name, description;
    ItemType type;

    public Item() {}

    public Item(Long id, String name, String description, ItemType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ItemType getType() {
        return type;
    }


}
