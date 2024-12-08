
//747. Largest Number At Least Twice of Others (LeetCode)
package Problem_Solving;

import java.util.Arrays;

public class LargestAsTwice {

    public int dominantIndex(int[] nums) {

        int index =0,i,n=nums.length;

        int[] Array2 = nums.clone();

        Arrays.sort(nums);
        int max = nums[n-1];



        for(i =0;i<=n-1;i++)
        {
            if(Array2[i]*2<=max || Array2[i]==max){
                if(Array2[i]==max)
                {
                    index=i;
                }

            }
            else
            {
                index=-1;
                break;
            }
        }

        return index;


    }

    public static void main(String[] args ){

        LargestAsTwice solution = new LargestAsTwice();
        //int [] arr = {3,6,1,0};
        //int [] arr = {4,3,1,2};
        int [] arr = {0,0,0,1};

        int result = solution.dominantIndex(arr);
        System.out.println(result);
    }
}
