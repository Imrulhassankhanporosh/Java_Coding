
//326. Power of Three (LeetCode)


package Problem_Solving;

public class PowerofThree {

    public boolean isPowerOfThree(int n) {

//        if(n<=0)          //because powers of three are positive numbers.
//            return false;
//
//        while (n%3==0)     //because powers of three should be mod 3 and remainder should be 0.
//        {
//            n=n/3;   // number will be divided by 3 until remainder 1
//        }
//
//        return n==1;    //if n==1, then the number is power of 3

        // The largest power of three within the 32-bit integer range is 1162261467   < (2 to the power 31) - 1
        return n > 0 && 1162261467 % n == 0;

    }

    public static void main(String[] args){
        PowerofThree solution = new PowerofThree();

        boolean result =solution.isPowerOfThree(3);
        System.out.println(result);

    }
}
