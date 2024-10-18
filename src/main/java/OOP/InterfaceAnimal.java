package OOP;

interface InterfaceAnimal {
    void run();

    String name = "public static final value";
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
