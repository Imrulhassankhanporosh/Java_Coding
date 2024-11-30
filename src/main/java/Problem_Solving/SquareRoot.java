package Problem_Solving;

public class SquareRoot {
    public int mySqrt(int x) {

        // Handle edge case for 0
        if(x == 0)
            return 0;

        int left =1,mid,right=x,result=0;

        while (left<=right)
        {
            mid = left+(right-left)/2;

            // To avoid overflow, compare mid * mid indirectly
            if((long)mid*mid<=x)
            {
                result=mid; // Store the possible result
                left=mid+1; // Search the right half
            }
            else
            {
                right=mid-1; // Search the left half
            }
        }
        return result;

    }

    public static void main(String[] args){
        SquareRoot solution = new SquareRoot();
        int result = solution.mySqrt(8);
        System.out.println(result);
    }

}
