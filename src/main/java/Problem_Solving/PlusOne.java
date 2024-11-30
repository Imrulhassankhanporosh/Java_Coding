//66. Plus One (LeetCode)

package Problem_Solving;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Start from the least significant digit (rightmost digit)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the result
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i]=0;

        }

        int[] newdigits = new int[n+1];
        newdigits[0]=1; // The first digit becomes 1, and all others are 0 by default.
        return newdigits;


    }



    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        int[] digits1 ={1,2,3};
        int[] digits2 ={9,9,9};
        String result = Arrays.toString(solution.plusOne(digits1));
        System.out.println(result);
        //System.out.println(Arrays.toString(solution.plusOne(digits1)));
        System.out.println(Arrays.toString(solution.plusOne(digits2)));
    }

}
