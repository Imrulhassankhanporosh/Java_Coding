
//202. Happy Number (LeetCode)

package Problem_Solving;

import java.util.HashSet;

public class Happy_Number {


    public boolean isHappy(int n) {

        HashSet<Integer>num = new HashSet<>(); // To detect cycles

        while (n!=1 &&!num.contains(n)){ // Repeat until n equals 1 or a cycle is detected
           // System.out.println("number initially : "+n);
            num.add(n); // Mark the current number as seen
            n=sumOfSquare(n);

        }

        return n==1;

    }

    public int sumOfSquare(int number){

        int sum =0,digit;

        while(number>0){
            digit = number%10;
            sum = digit*digit+sum;
            number=number/10;
           // System.out.println("number after / 10 : "+number);
           // System.out.println("sum after sqaure 2 : "+sum);
        }
        return sum;
    }




    public static void main(String[] args){
        Happy_Number solution = new Happy_Number();

        boolean result =solution.isHappy(4);
        System.out.println(result);

    }
}
