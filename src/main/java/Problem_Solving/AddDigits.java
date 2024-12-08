
//258. Add Digits (LeetCode)

package Problem_Solving;

public class AddDigits {

    public int addDigits(int num) {


        if(num<10)  // If num is a single digit, return it directly
            return num;

        while(num>=10) {                   // Loop until the result has only one digit
            int digit,sum =0, sum1=0;

            while (num > 0) {          // Add the digits of the current number

                digit = num % 10;       // Get the last digit
                sum = sum + digit;      // Add it to the sum
                num = num / 10;         // Remove the last digit

            }

            num=sum;        // Update num to the sum of its digits

            }

        return num;  // Return the single-digit result


        //another solution (more optimize)
//        if(num==0)
//            return 0;
//
//        else {
//            //digital root of n=1+(n−1)%9 if n>0.
//            return 1+(num-1)%9;  //using the digital root formula
//        }


    }


    public static void main(String[] args){
        AddDigits solution = new AddDigits();

        int result =solution.addDigits(0);
        System.out.println(result);

    }
}
