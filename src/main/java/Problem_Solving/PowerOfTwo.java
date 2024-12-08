
//231. Power of Two (LeetCode)

package Problem_Solving;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if(n<=0)
            return false;

        return (n&(n-1))==0;

    }

    public static void main(String[] args ){

        PowerOfTwo solution = new PowerOfTwo();

        int n =3;


        boolean result = solution.isPowerOfTwo(n);
        System.out.println(result);
    }

}
