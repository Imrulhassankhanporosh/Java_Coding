package OOP;

public class Encapsulation {

    private String name;
    int roll;
    String dept;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getCalled() {
        System.out.println("Get Called by the object.");
    }

    public void publicMethod() {
        System.out.println("This is the public method.");
        privateMethod();   // Calling the private method within the same class

    }

    // A public method that can be accessed from outside
    public Encapsulation(int roll, String dept) {
        this.roll = roll;
        this.dept = dept;
    }

    // A private method that can only be accessed within this class
    private void privateMethod() {
        System.out.println("This is the private method.");
    }

}

