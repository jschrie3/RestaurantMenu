package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    // STUDIO 4.8: RESTAURANT MENU
    // TODO: Each menu item has a price, description, and category (appetizer, main course, or dessert)
    // declare the menu item fields
    // all fields can be private and we can use getters, setter, instance methods to access them
    private String name; // menu item name
    private String description; // description of menu item
    private double price; // price of item
    private String category; // appetizer, main course, dessert
    // TODO: The app should know when the menu was last updated, so visitors can see that
    //  the restaurant is constantly changing and adding exciting new items
    private Date dateAdded; // date item was added to menu

    // TODO: define constructor to take values for first four fields as parameters
    // initialize dateAdded to the current date
    // MenuItem constructor does not need a return method and must be named the same as the class
    // so java knows it is a constructor
    public MenuItem(String name, String description, double price, String category) {
        // since parameters have the same name, we use THIS keyword
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        // now we can initialize dateAdded
        // we don't need to pass anything in as a parameter, we can call the date constructor
        this.dateAdded = new Date(); // the default is the current date
    }

    // STUDIO 5.6: RESTAURANT MENU CONTINUED
    // TODO: Define getters and setters.
    // generate getters and setters with IntelliJ
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    // only need the getter for dateAdded
    public Date getDateAdded() {
        return dateAdded;
    }

    // TODO: define custom toString() method
    // generate toString method (right-click > generate > toString()) for first 4, then customize
    @Override
    public String toString() {
        // indicate if an item is new using ternary operator
        // if it is new, print " - NEW!" or if its not new print nothing
        // ? is a ternary operator, syntax: (Condition) ? (Statement1) : (Statement2);
        String newText = isNew() ? " - NEW!" : "";
        // the newText will generate based on conditional above
        return "\n\u2022 " + name + newText + " | " // the u2022 makes a bullet point
                + "$" + price + " + tax" + "\n"
                + description;
    }


    // TODO: define custom equals() method
    // make sure there are no duplicate items by using equals string method to compare strings
    @Override
    public boolean equals(Object toBeCompared) {
        // reference check
        if (this == toBeCompared) {
            return true;
        }
        // null check
        if (this == null) {
            return false;
        }
        // class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        // cast otherItem as a MenuItem object so it can use MenuItem class methods
        MenuItem otherItem = (MenuItem) toBeCompared;
        // compares name of the toBeCompared item to otherItem name
        // will return false if the toBeCompared item does not match an item on the menu
        return this.name.equals(otherItem.getName());
    }

    // TODO: define instance method isNew()
    Boolean isNew() {
        // subtract item's dateAdded from today's date

        // return true if it's less than 90 days
        return true;
    }

}
