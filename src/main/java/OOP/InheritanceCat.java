package OOP;

public class InheritanceCat extends InheritanceAnimal {

    // Overriding with a more accessible method (public)

//    Here, the sound() method in the Cat class has been overridden to be public, which is more accessible than the protected method
//    in the Animal class.
    @Override
    public void sound(){
        System.out.println("Cat makes sound Meow");
        super.sound();  // method of superclass called
    }

    public InheritanceCat(){
        super();     // should be in first statement , constructor of superclass is created
        System.out.println("super variable called: "+super.name);  // variable of superclass called
    }

    public static void staticRun(){
        System.out.println("Static method executed in cat class : Cat runs");
    }

}

