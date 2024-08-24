package org.example;



public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Blue","Honda", 2001);
        car1.set_name("Imrul");
        //car1.name;    Can not call private member without set/set method

        System.out.println("Color : "+car1.color+ " \nBrand : "+car1.model+" \nyear : "+car1.year+ " \nName : "+car1.get_Name());

        MethodOverloading calc = new MethodOverloading();

        // Calling the different overloaded methods
        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(5, 10, 15);
        double sum3 = calc.add(2.5, 3.5);
        String concat = calc.add("Hello ", "world!");

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
        System.out.println("Concatenated string: " + concat);

        // Create an object of the Dog class
        Dog myDog = new Dog("Buddy");

        // Access encapsulated data using the getter method
        System.out.println("Dog's name: " + myDog.getName());

        // Call the overridden method
        myDog.makeSound();
    }
}