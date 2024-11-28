package Problem_Solving;

import java.util.Scanner;

public class MaxProfit {

    public static void main(String[] args) {

        //int[] arr = {100, 180, 260, 310, 40, 535, 695};


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }

       // int n = arr.length;

        int total = 0;
        int i = 0;
        int min = arr[0];
        int max = arr[0];

        while (i<n-1){

            while(i<n-1 && arr[i]>=arr[i+1]){

                i++;

            }
            min=arr[i];

            while(i<n-1 && arr[i]<=arr[i+1]){

                i++;

            }
            max=arr[i];

            total = total+(max -min);

        }

        System.out.println("Total Max Profit : "+total);

    }
}
