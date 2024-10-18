package OOP;

public class InheritanceAnimal {

    public String name ="Imrul Hassan";

//    public void sound(){
//        System.out.println("Animal makes sound");
//    }

    // Protected method in superclass

    protected void sound(){
        System.out.println("Animal makes sound");
    }

    public static void staticRun(){
        System.out.println("Static method executed in animal class : Animal runs");
    }

    public InheritanceAnimal(){
        System.out.println("Superclass constructor called");
    }
}

