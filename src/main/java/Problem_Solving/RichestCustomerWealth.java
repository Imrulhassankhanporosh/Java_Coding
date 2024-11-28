
//1672. Richest Customer Wealth (LeetCode)

package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {

    public int getResult(int[][] array) {

        int maxAmount = 0;



        // loop by number of rows
        for(int i =0;i<array.length;i++){

            int currentAmount = 0;

            // loop by number of columns
            for(int j=0;j<array[i].length;j++){
                 currentAmount = currentAmount + array[i][j];
            }

            // Update maxWealth if current customer wealth is higher
            if(maxAmount<=currentAmount){
                maxAmount=currentAmount;

        }
        }
        //return result;
        return maxAmount;
    }



    public static void main(String[] args){

//     2D array [2][3]
//        int[][] arr = {
//
//                {1, 2, 3},
//                {3,2,1}
//        };

        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        for(int x=0;x<m;x++){
            for(int y =0;y<n;y++){

                arr[x][y]=sc.nextInt();
            }
        }

        RichestCustomerWealth sum =new RichestCustomerWealth();

        int arr2 = sum.getResult(arr);

        System.out.println(arr2);



    }
}
