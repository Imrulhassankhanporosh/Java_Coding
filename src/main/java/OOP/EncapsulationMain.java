package OOP;

public class EncapsulationMain {

    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation(10, "CSE");

        // Trying to access the private variable from outside the class
        //System.out.println("Name :"+obj1.name);  // This will cause a compilation error

        // Accessing the private variable using getter setter method
        obj1.setName("Imrul");
        System.out.println("Name :" + obj1.getName() + " Roll :" + obj1.roll + " Dept :" + obj1.dept);

        // Accessing the public method
        obj1.publicMethod();

        // Trying to access the private method from outside the class
        // obj1.privateMethod();  // This will cause a compilation error

    }
}
