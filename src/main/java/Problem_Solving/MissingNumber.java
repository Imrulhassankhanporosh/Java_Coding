
//268. Missing Number (LeetCode)

package Problem_Solving;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int n=nums.length;
        int total_sum=(n*(n+1))/2;
        int actual_sum=0;

        for(int i=0;i<=n-1;i++)
        {
            actual_sum=actual_sum+nums[i];;
        }

        int missing_num = total_sum-actual_sum;
        return missing_num;

    }


    public static void main(String[] args){
        MissingNumber solution = new MissingNumber();

        int[] arr = {9,6,4,2,3,5,7,0,1};

        int result =solution.missingNumber(arr);
        System.out.println(result);

    }
}
