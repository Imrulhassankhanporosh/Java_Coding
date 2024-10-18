package OOP;

public class Static {

    static int count = 0;
    static int static_variable = 10 ;

    public int non_static =20;

    static {
        System.out.println("Static block executed.");
        static_variable = 100;
    }

    static double add(double a, double b){
        // Can not call non-static variable or method from static method
        // System.out.println("Display the static variable : "+non_static);
        //display();
        return a+b;

    }

    static int multiply(int a, int b){
        return a*b;
    }

    public void display(){
        System.out.println("Display the static variable : "+static_variable);
    }
}
