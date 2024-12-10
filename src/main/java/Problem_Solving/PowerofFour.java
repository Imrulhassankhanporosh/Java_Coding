
//342. Power of Four (LeetCode)

package Problem_Solving;

public class PowerofFour {

    public boolean isPowerOfFour(int n) {

        if(n<=0)          //because powers of four are positive numbers.
            return false;

        while (n%4==0)     //because powers of four should be mod 4 and remainder should be 0.
        {
            n=n/4;   // number will be divided by 4 until remainder 1
        }

        return n==1;    //if n==1, then the number is power of 4

    }

    public static void main(String[] args){
        PowerofFour solution = new PowerofFour();

        boolean result =solution.isPowerOfFour(2);
        System.out.println(result);

    }
}
