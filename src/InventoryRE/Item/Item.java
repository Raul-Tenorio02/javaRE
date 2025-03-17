package InventoryRE.Item;

public abstract class Item {

    private Long id;
    private String name, description;
    private ItemType type;

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
