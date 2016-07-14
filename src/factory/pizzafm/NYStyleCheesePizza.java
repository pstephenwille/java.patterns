package factory.pizzafm;

/*
* Creates products through inheritance. */
public class NYStyleCheesePizza extends Pizza {
    /*
    * CONCRETE PRODUCT
    *
    * encapsulate what varies */
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
