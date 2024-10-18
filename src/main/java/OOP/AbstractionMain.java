package OOP;

public class AbstractionMain {
    public static void main(String[] args){
       // AbstractionAnimal cat = new AbstractionAnimal(); //abstract class can not be directly instantiated
        AbstractionAnimal cat = new AbstractionCat();
        cat.makeSound();
        System.out.println("name : "+cat.name);

    }
}
