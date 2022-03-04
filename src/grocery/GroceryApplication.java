package grocery;

import java.util.*;
import util.Input;

public class GroceryApplication {
    public static void main(String[] args) {
        // COLLECTIONS OBJS
        HashMap<String, Item> groceries = new HashMap<>();
        ArrayList<Item> beverageItems = new ArrayList<>();
        ArrayList<Item> foodItems = new ArrayList<>();
        ArrayList<Item> personalCareItems = new ArrayList<>();
        ArrayList<Item> householdItems = new ArrayList<>();
        ArrayList<Item> otherItems = new ArrayList<>();

        Input in = new Input();
        System.out.print("Create Grocery List?: ");
        boolean isCreatingList = in.yesNo();

        if(isCreatingList){
            System.out.print("Enter new item?: ");
            boolean isEnteringNewItem = in.yesNo();
            while(isEnteringNewItem){
                // CATEGORY PROMPT
                System.out.println("1. Beverage");
                System.out.println("2. Food");
                System.out.println("3. Personal Care");
                System.out.println("4. Household");
                System.out.println("5. Other");
                System.out.print("Enter Category: ");
                int categoryInput = in.getInt(1,5);

                // NAME PROMPT
                System.out.print("Enter name: ");
                String nameInput = in.getString();

                // QUANTITY PROMPT
                System.out.print("Enter quantity: ");
                int quantityInput = Integer.parseInt(in.getString());

                // CREATE AND ADD NEW ITEM
                if(groceries.containsKey(nameInput)){  // item already exists, increase qty.
                    Item currentItem = groceries.get(nameInput);
                    currentItem.setQuantity(currentItem.getQuantity() + quantityInput);
                } else {
                    Item newItem = createNewItem(nameInput, categoryInput, quantityInput);
                    groceries.put(nameInput, newItem);
                }

                // FINALIZE OR ADD ANOTHER ITEM
                System.out.print("Enter another item? ");
                isEnteringNewItem = in.yesNo();
            }

            // CATEGORIZE ITEMS
            for (Map.Entry<String, Item> item : groceries.entrySet()) {
                String currentCategory = item.getValue().getCategory();
                switch(currentCategory){
                    case "beverage":
                        beverageItems.add(item.getValue());
                        break;
                    case "food":
                        foodItems.add(item.getValue());
                        break;
                    case "personal care":
                        personalCareItems.add(item.getValue());
                        break;
                    case "household":
                        householdItems.add(item.getValue());
                        break;
                    case "other":
                        otherItems.add(item.getValue());
                        break;
                    default:
                        break;
                }
            }

            // SORT
            Collections.sort(beverageItems, Item.itemNameComparator);
            Collections.sort(foodItems, Item.itemNameComparator);
            Collections.sort(personalCareItems, Item.itemNameComparator);
            Collections.sort(householdItems, Item.itemNameComparator);
            Collections.sort(otherItems, Item.itemNameComparator);

            // PRINTING OPTIONS
            boolean isPrinting = true;
            while(isPrinting){
                System.out.println(" ");
                System.out.println("1. Show All Items");
                System.out.println("2. Show Beverage Items");
                System.out.println("3. Show Food Items");
                System.out.println("4. Show Personal Care Items");
                System.out.println("5. Show Household Items");
                System.out.println("6. Show Other/Misc Items");
                System.out.println("7. Exit");
                int printOption = in.getInt(1,7);

                switch(printOption){
                    case 1:
                        printList(beverageItems);
                        printList(foodItems);
                        printList(personalCareItems);
                        printList(householdItems);
                        printList(otherItems);
                        break;
                    case 2:
                        printList(beverageItems);
                        break;
                    case 3:
                        printList(foodItems);
                        break;
                    case 4:
                        printList(personalCareItems);
                        break;
                    case 5:
                        printList(householdItems);
                        break;
                    case 6:
                        printList(otherItems);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        isPrinting = false;
                        break;
                }
            }
        }
    }

    public static Item createNewItem(String name, int category, int quantity){
        String categoryStr = "";
        switch(category){
            case 1:
                categoryStr = "beverage";
                break;
            case 2:
                categoryStr = "food";
                break;
            case 3:
                categoryStr = "personal care";
                break;
            case 4:
                categoryStr = "household";
                break;
            case 5:
                categoryStr = "other";
                break;
        }
        return new Item(name, categoryStr, quantity);
    }

    public static void printList(ArrayList<Item> list){
        for(Item item : list){
            item.displayItemInfo();
        }
    }
}
