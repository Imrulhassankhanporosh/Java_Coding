package OOP;

interface InterfaceAnimal {
    void run();

    String name = "public static final value";

    // can have Default/static method (has a body) in java 8+
    default void displayType() {
        System.out.println("This is a vehicle.");
    }
}

interface InterfaceDog{
    void color();

}
interface InterfaceCat{
    void sound();
}

// Class implementing multiple interfaces
class InterfaceImplement implements InterfaceAnimal,InterfaceCat,InterfaceDog{

    @Override
    public void run(){
        System.out.println("runs");
    }

    @Override
    public void color(){
        System.out.println("color");
    }

    @Override
    public void sound(){
        System.out.println("sound");
    }

}
