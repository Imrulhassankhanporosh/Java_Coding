package OOP;

public class InheritanceMain {

    public static void main(String[] args){

        InheritanceAnimal animal = new InheritanceAnimal();
        animal.sound();

        InheritanceCat cat = new InheritanceCat();
        cat.sound();

        //runtime polymorphism
//        The actual object type (Cat-subclass) at runtime determines which version of the sound() method is executed, even if the object
//        is referred to by the Animal(superclass) reference type. This is an example of runtime polymorphism in action.

        // Create an Animal reference for a Cat object
        InheritanceAnimal cat1=new InheritanceCat();
        cat1.sound(); // Output: The cat meows. (Runtime Polymorphism)

//        Static Methods: Static methods cannot be overridden. If a static method is defined in both the superclass
//        and subclass, the method in the subclass hides the one in the superclass (this is called method hiding).

//        Method Hiding: Static methods are hidden, not overridden, and the method to be executed depends on the reference
//        type, not the object type.

        cat.staticRun(); // output : Static method executed in cat class : Cat runs
        cat1.staticRun(); // output : Static method executed in animal class : Animal runs






    }

}
