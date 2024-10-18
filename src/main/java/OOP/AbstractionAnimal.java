package OOP;

public abstract class AbstractionAnimal {
    public static final String name = "Imrul";

    // Abstract method (no implementation)
    public abstract void makeSound();

    public void run(){
        System.out.println("non abstract method is called.");
    }

    public AbstractionAnimal(){
        System.out.println("Constructor of Abstract class is called. Name is : "+name);
    }
}
