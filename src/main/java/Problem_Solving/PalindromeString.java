package Problem_Solving;

public class PalindromeString {

    public static void main(String[] args) {

        String str="madam";
        int n = str.length();
        int left = 0;
        int right = n-1;

        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(str+" is not palindrome.");
            }
            left++;
            right--;
        }
        System.out.println(str+" is palindrome.");

    }
    }
