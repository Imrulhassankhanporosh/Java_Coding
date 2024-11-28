
//13. Roman to Integer (Leetcode)

package Problem_Solving;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String str)
    {

        Map<Character,Integer> map = new HashMap<>();

        // Define a map that stores Roman numeral symbols and their integer values.

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0; // This will store the final integer result.
        int prev = 0; // Keep track of the previous numeral's value.

        for(int i=str.length()-1;i>=0;i--){

            int current =map.get(str.charAt(i));

            if(current<prev){

                total=total-current;
            }

            else{
                total=total+current;
            }

            prev = current;

        }

        return total;



    }


    public static void main(String[] args) {

        RomanToInt convert = new RomanToInt();
        System.out.println(convert.romanToInt("III"));
        System.out.println(convert.romanToInt("LVIII"));
        System.out.println(convert.romanToInt("MCMXCIV"));

    }

}
