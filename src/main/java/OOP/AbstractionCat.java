package OOP;

public class AbstractionCat extends AbstractionAnimal {

    // Implementation of the abstract method
    @Override
    public void makeSound(){
        System.out.println("Cat sounds");
        super.run(); // accessing the non-abstract method.
      //  super.makeSound();  //abstract method can not be accessed directly
    }

    public AbstractionCat(){
        super(); //accessing the constructor of the abstract class
        System.out.println("cat constructor called");
    }
}
