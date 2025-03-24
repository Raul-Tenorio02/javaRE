package InventoryRE.Item;

public abstract class Item {

    private int id;
    private String name, description;
    private ItemType type;

    public Item() {}

    public Item(int id, String name, String description, ItemType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public int getId() { return id; }

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
