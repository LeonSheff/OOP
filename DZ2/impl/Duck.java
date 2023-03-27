package DZ2.impl;

import DZ2.Animal;
import DZ2.Flyable;
import DZ2.Runnable;
import DZ2.Swimmable;

public class Duck extends Animal implements Flyable, Runnable, Swimmable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }
}