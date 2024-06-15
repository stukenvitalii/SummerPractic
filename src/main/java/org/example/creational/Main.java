package org.example.creational;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");

        if (dog != null) {
            dog.sound(); // Output: Woof!
        } else {
            System.out.println("Unknown animal type");
        }

        if (cat != null) {
            cat.sound(); // Output: Meow!
        } else {
            System.out.println("Unknown animal type");
        }
    }
}

