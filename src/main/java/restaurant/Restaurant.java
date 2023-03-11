package restaurant;

public class Restaurant {
    // STUDIO 5.6: RESTAURANT MENU CONTINUED
    // TODO: Create a class called Restaurant, and add a public static void main(String[] args) method.
    public static void main(String[] args) {
        // TODO: Create several items and add them to a menu.
        // instantiate menu items (using imo's menu)
        MenuItem item1 = new MenuItem("Deluxe Pizza", "Imo's Original & favorite specialty pizza. Imo's Pizza sauce, Provel® cheese, sausage, bacon, mushroom, onion, & green pepper.", 25.75, "Pizzas");
        MenuItem item2 = new MenuItem("Veggie Pizza", "Imo's Pizza sauce, Provel® cheese, mushroom, onion, green pepper, black olives, & tomato.", 25.75, "Pizzas");
        MenuItem item3 = new MenuItem("All Meat Pizza", "Imo's Pizza sauce, Provel® cheese, sausage, Canadian bacon, bacon, & pepperoni.", 25.75, "Pizzas");
        MenuItem item4 = new MenuItem("BBQ Chicken Pizza", "BBQ sauce, Provel® cheese, chicken, & onion.", 21.65, "Pizzas");
        MenuItem item5 = new MenuItem("Cheese Only Pizza", "Classic & delicious with a generous topping of Provel® cheese.", 18.95, "Pizzas");
        MenuItem item6 = new MenuItem("Toasted Ravioli", "Imo's exclusive toasted ravioli with a side of meat sauce.", 7.99, "Appetizers");
        MenuItem item7 = new MenuItem("Garlic Cheese Bread", "Lightly golden baked hoagie with garlic butter & melted Provel® cheese.", 4.99, "Appetizers");
        MenuItem item8 = new MenuItem("Cinnimos", "Bread bites coated with cinnamon sugar icing.", 4.50, "Desserts");

        // create a menu - instantiate a menu
        Menu menu = new Menu(); // can use the default constructor

        // add menu items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);
        menu.addItem(item7);
        menu.addItem(item8);

        // TODO: Print the entire, updated menu to the screen.
        System.out.println(menu);

        // TODO: Print an individual menu item to the screen.
//        System.out.println(item1);

        // TODO: Delete an item from a menu, then reprint the menu.
        // delete menu item from menu
        menu.removeItem(item4); // remove item4
        // reprint the menu
        System.out.println(menu);

        // TODO (BONUS MISSION): try to add a duplicate menu item
        // try to add an item that already exists but with different variable name
        MenuItem item9 = new MenuItem("Toasted Ravioli", "Imo's exclusive toasted ravioli with a side of meat sauce.", 7.99, "Appetizers");
        menu.addItem(item9);
        // make sure item wasn't added twice
        System.out.println(menu);
    }
}
