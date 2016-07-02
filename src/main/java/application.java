package main.java;

import state.gumball.GumballMachineTestDrive;

public class application {
    public static void main(String[] args) {
        System.out.println("I am alive!");
        /*
        * State:
        * Allows an object to alter its behavior when its internal state changes.
        * State behavior is encapsulated and decoupled from the context via interfaces.
        *
        * Same pattern as Strategy.*/
        GumballMachineTestDrive.main(null);
    }
}
