package OOP;

public class InterfaceMain{

    public static void main (String[] args){
        InterfaceImplement obj1 = new InterfaceImplement();

        // Calling methods from all interfaces
        obj1.run();
        obj1.color();
        obj1.sound();
        obj1.displayType(); //can call default/static method from instance
        System.out.println("name : "+obj1.name);
    }

}
