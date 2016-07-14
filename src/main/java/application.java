package main.java;

import singleton.subclass.CoolerSingleton;
import singleton.subclass.HotterSingleton;
import singleton.subclass.Singleton;

public class application {
    public static void main(String[] args) {
        System.out.println("I am alive!");

		SingletonTestDrive.main(null);
    }

	public static class SingletonTestDrive {
        public static void main(String[] args) {
            Singleton foo = CoolerSingleton.getInstance();
            Singleton bar = HotterSingleton.getInstance();
            System.out.println(foo);
            System.out.println(bar);
         }
    }
}
