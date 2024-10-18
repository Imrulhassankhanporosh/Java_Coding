package OOP;

public class StaticMain {
    public static void main(String[] args) {

        // Calling static variables and methods without creating an object

        System.out.println("Print the static variable count : "+Static.count);
        System.out.println("Print the static_variable : "+Static.static_variable);

        System.out.println("Print the add : "+Static.add(10.15,12.25));
        System.out.println("Print the multiplication : "+Static.multiply(10,12));

        Static obj1 = new Static();
        obj1.display();





    }
}
