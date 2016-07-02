package main.java;

import strategy.RubberDuck;

public class application {
    static RubberDuck rubberDuck = new RubberDuck();

    public static void main(String[] args) {
        System.out.println("I am alive!");
        rubberDuck.display();
    /* Strategy:
    * The context is the RubberDuck.
    *
    * A ducks flying behavior is encapsulated in a 'flyBehavior' class;
    * in this case, the 'FlyNoWay' class.
    * This makes it's flying behavior interchangeable and decoupled from itself,
    *
    * Utilizing the 'flyBehavior' interface we are...
    * favoring compostion over inheritance.*/
        rubberDuck.performFly();
    }
}
