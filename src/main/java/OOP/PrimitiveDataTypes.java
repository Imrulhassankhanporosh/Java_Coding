package OOP;

import java.util.Scanner;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input from the user

        System.out.print("Enter an integer: ");
        int myInt = sc.nextInt();
        System.out.println("Integer entered: " + myInt);

        // Taking float input from the user

        System.out.print("Enter an float: ");
        float myFloat = sc.nextFloat();
        System.out.println("float entered: " + myFloat);

        // Taking double input from the user

        System.out.print("Enter an double: ");
        double myDouble = sc.nextDouble();
        System.out.println("Double entered: " + myDouble);

        // Taking String input from the user

        sc.nextLine();
        System.out.print("Enter a String ");
        String myString = sc.nextLine();
        System.out.println("String entered: " + myString);


    }
}
