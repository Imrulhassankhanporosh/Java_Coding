

//412. Fizz Buzz (LeetCode)

package Problem_Solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {

    //public void fizzBuzz(int n) {
    public List<String>fizzBuzz(int n){

        List<String>answers = new ArrayList<>();

     //   String[] arr = new String[n];

        for(int i=1;i<=n;i++) {

            if (i % 3 == 0) {
                if (i % 5 == 0) {
                   // System.out.println("FizzBuzz");
                    answers.add("FizzBuzz");

                } else {
                    //System.out.println("Fizz");
                    answers.add("Fizz");
                }
            } else if (i % 5 == 0) {
               // System.out.println("Buzz");
                answers.add("Buzz");

            }
//            else if (i%3 == 0 && i%5==0) {
//                System.out.println("FizzBuzz");


            else {
               // System.out.println(i);
                answers.add(String.valueOf(i));
            }

        }

        return answers;

        }


    public static void main(String[] args){

        FizzBuzz sum= new FizzBuzz();
        List<String>result= sum.fizzBuzz(15);

        System.out.println(result);
    }
}
