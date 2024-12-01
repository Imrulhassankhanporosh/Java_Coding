//67. Add Binary (LeetCode)
package Problem_Solving;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {

//        Long num1 = Long.parseLong(a,2);
//        Long num2 = Long.parseLong(b,2);
//
//        Long sum = num1+num2;
//        return Long.toBinaryString(sum);

        //Creating BigInteger from a binary string
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);

        //add
        BigInteger sum = num1.add(num2);
        //Converts the BigInteger to a string.
        return sum.toString(2);

    }


    public static void main(String[] args) {
        AddBinary solution = new AddBinary();
        String result = solution.addBinary("11","1");
        System.out.println(result);

    }
}
