
//344. Reverse String (LeetCode)

package Problem_Solving;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {

        int right=s.length-1;    // Pointer at the end of the array
        int left =0;                // Pointer at the start of the array
        for(left=0;left<=right;left++)    // Continue swapping until pointers meet
        {
           char temp =s[right] ;
           s[right]=s[left];
           s[left]=temp;
           right--;                 // Move the pointers closer
        }
    }

    public static void main(String[] args){
        ReverseString solution = new ReverseString();

        char[] s = {'h','e','l','l','o'};

        solution.reverseString(s);
        System.out.println(Arrays.toString(s));

    }
}
