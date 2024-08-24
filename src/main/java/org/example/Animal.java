package org.example;

// Define a base class 'Animal'
public class Animal {
    // Encapsulation: private attribute
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("Animal sound");
    }

    // Getter method to access the private name
    public String getName() {
        return name;
    }
}

// Define a subclass 'Dog' that inherits from 'Animal'
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Call the superclass (Animal) constructor
    }

    // Polymorphism: Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
