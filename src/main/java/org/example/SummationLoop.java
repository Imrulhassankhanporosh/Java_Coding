package org.example;


import java.util.Scanner;

public class SummationLoop {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Number of Input : ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Prompt user to enter elements
        System.out.println("Enter " + n + " numbers:");

        // Read numbers into the array

        int sum =0;

        for (int i =0;i<n;i++)
        {
            numbers[i]=scanner.nextInt();
            sum = sum+numbers[i];    // adding the provided input numbers

        }

        // Calculate sum using a for loop

//        int sum =0;
//
//        for (int i=0;i<n;i++)
//        {
//            sum = sum+numbers[i];
//        }

        double avg = sum/n;

        System.out.println("Print sum : "+sum + "\nprint avg : "+avg);

    }


}
