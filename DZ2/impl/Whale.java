package DZ2.impl;

import DZ2.Animal;
import DZ2.Swimmable;

public class Whale extends Animal implements Swimmable {
    public Whale(String name, String color) {
        super(name, color, 0);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 30;
    }
}