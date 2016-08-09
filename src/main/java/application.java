package main.java;

import adapter.ducks.DuckAdapter;
import adapter.ducks.MallardDuck;
import adapter.ducks.Turkey;

/*
* ADAPTER
* Convert the interface of a class into another interface clients expect. */
public class application {
    public static void main(String[] args) {
        System.out.println("I am alive!");
        TurkeyTestDrive.main(null);
    }

    public static class TurkeyTestDrive {
        public static void main(String[] args) {
            MallardDuck duck = new MallardDuck();
            Turkey duckAdapter = new DuckAdapter(duck);

            for(int i=0;i<10;i++) {
                System.out.println("The DuckAdapter says...");
                duckAdapter.gobble();
                duckAdapter.fly();
            }
        }
    }
}
