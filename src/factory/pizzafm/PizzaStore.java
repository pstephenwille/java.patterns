package factory.pizzafm;

public abstract class PizzaStore {

    /*
    * FACTORY METHOD */
    abstract Pizza createPizza(String item);

    /*
    * AN OPERATION */
    public Pizza orderPizza(String type) {
        /*
        * The subclass will determine which 'type' of Pizza to make, cheese, veggie, etc..
        *
        * Program to the Pizza interface, not each implementation. */
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
