package grocery;

import java.util.Comparator;

public class Item {
    protected String name;
    protected String category;
    protected int quantity;

    public Item(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayItemInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Quantity: " + this.getQuantity());
    }

    public static Comparator<Item> itemNameComparator = new Comparator<Item>() {
        @Override
        public int compare(Item item1, Item item2) {
           String itemName1 = item1.getName().toLowerCase();
           String itemName2 = item2.getName().toLowerCase();
           return itemName1.compareTo(itemName2);
        }
    };
}
