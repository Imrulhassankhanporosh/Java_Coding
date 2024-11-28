//1480. Running Sum of 1D Array (LeetCode)

package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {

 public int[] getResult(int[] array) {

        int n = array.length;

        int[] result = new int[n];

        result[0]=array[0];

        for(int i =1;i<n;i++){
            //result[i]=result[i-1]+array[i];
            array[i]=array[i-1]+array[i];
        }
       //return result;
       return array;
    }

    public static void main(String[] args){

        //int[] arr = {1, 2, 3, 4};

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }

        RunningSum sum =new RunningSum();

        int [] arr2 = sum.getResult(arr);

        //using Arrays.toString(result), which converts the array to a readable string format.

        System.out.println(Arrays.toString(arr2));



    }
}
