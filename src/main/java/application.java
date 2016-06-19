package main.java;

import factory.pizzas.Pizza;
import factory.pizzas.PizzaStore;
import factory.pizzas.SimplePizzaFactory;

public class application {
    public static void main(String[] args) {
        System.out.println("I am alive!");

        PizzaTestDrive.main(null);
    }

    public static class PizzaTestDrive {

        public static void main(String[] args) {
            SimplePizzaFactory factory = new SimplePizzaFactory();
            PizzaStore store = new PizzaStore(factory);

            Pizza pizza = store.orderPizza("cheese");
            System.out.println("We ordered a " + pizza.getName() + "\n");

            pizza = store.orderPizza("veggie");
            System.out.println("We ordered a " + pizza.getName() + "\n");
        }
    }
}
