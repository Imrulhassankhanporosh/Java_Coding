package Problem_Solving;

public class Palindrome {

    public boolean isPalindrome(int x) {

        // If x is negative or if x ends in 0 (but is not 0), it's not a palindrome.

        if(x<0 || (x%10 ==0 && x!=0)){
            return  false;
        }

        int sum =0;
        int number =x;
        while(x!=0)
        {
            sum = sum*10+ x%10;
            x=x/10;
        }
//        System.out.println(sum);
//        System.out.println(number);

        return sum==number;

    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        boolean result = solution.isPalindrome(121);
        System.out.println(result);
    }
}
