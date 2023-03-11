package restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // STUDIO 4.8: RESTAURANT MENU
    // TODO: declare the two private fields, MenuItems and lastUpdated
    // use the empty constructor to create a new array list
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated; // automatically null until we give it a value

    // STUDIO 5.6: RESTAURANT MENU CONTINUED
    // TODO: Define getters and setters.
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // TODO: define custom toString() method
    // create the toString method that will print the menu
    @Override
    public String toString() {
        // use stringbuilder to print and format menu
        // build appetizers section
        StringBuilder appetizers = new StringBuilder();
        // loop through menuItems: for each item in menuItems
        for (MenuItem item : menuItems) {
            // check if item is an appetizer
            if (item.getCategory().equals("Appetizers")) { // if category is appetizer
                // use .append StringBuilder method attach value to string
                appetizers.append(item.toString()); // call toString method from MenuItems class
            }
        }

        // build pizzas section
        StringBuilder pizzas = new StringBuilder();
        // loop through menuItems: for each item in menuItems
        for (MenuItem item : menuItems) {
            // check if item is an appetizer
            if (item.getCategory().equals("Pizzas")) { // if category is appetizer
                // use .append StringBuilder method attach value to string
                pizzas.append(item.toString()); // call toString method from MenuItems class
            }
        }

        // build desserts section
        StringBuilder desserts = new StringBuilder();
        // loop through menuItems: for each item in menuItems
        for (MenuItem item : menuItems) {
            // check if item is an appetizer
            if (item.getCategory().equals("Desserts")) { // if category is appetizer
                // use .append StringBuilder method attach value to string
                desserts.append(item.toString()); // call toString method from MenuItems class
            }
        }

        return "IMO'S PIZZA MENU"
                // call generic toString method to ensure its a string not a StringBuilder
                + "\n\nAPPETIZERS" + appetizers.toString()
                + "\n\nPIZZAS" + pizzas.toString()
                + "\n\nDESSERTS" + desserts.toString();
    }


    // TODO: A way to add and remove menu items from the menu.
    // define addItem()
    // create a method to add items to our arraylist menuItems by passing in menu items
    void addItem(MenuItem newItem) {
        // (bonus mission) make sure you don't add duplicates
        // (bonus mission) create message to print
        String message = "This item is already on the menu.";
        // (bonus mission) check if item already exists (item value itself, not strings)
        if (menuItems.contains(newItem)) { // if menuItems contains newItem
            System.out.println(message); // print message
            return;
        }
        // (bonus mission) loop through the entire menu to check for duplicate strings
        for (MenuItem item : menuItems) { // for each item in menuItems
            if (item.equals(newItem)) { // if an item equals newItem (uses MenuItem class custom equals method)
                System.out.println(message); // print message
                return;
            }
        }
        // use .add method to add items as they're passed in
        menuItems.add(newItem);
        // update the last updated date
        lastUpdated = new Date(); // will give current date when an item is added
    }

    // define removeItem()
    // create a method to remove items from our arraylist menuItems by passing in menu items
    void removeItem(MenuItem item) {
        // use .remove method to remove items as they're passed in
        menuItems.remove(item);
        // update the last updated date
        lastUpdated = new Date(); // will give current date when an item is added
    }
    }




