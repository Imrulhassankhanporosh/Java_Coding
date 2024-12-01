
//168. Excel Sheet Column Title (LeetCode)
package Problem_Solving;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber){

        StringBuilder result = new StringBuilder();

        while(columnNumber>0){
            columnNumber--; // Adjust for 1-based indexing
            char letter= (char) ('A'+columnNumber%26); // Get the current letter
            result.append(letter); // Append the letter
            columnNumber=columnNumber/26; // Move to the next "digit"

        }
        return result.reverse().toString(); // Reverse to get the correct order

    }



    public static void main(String[] args){
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        String result =solution.convertToTitle(701);
        System.out.println(result);
    }
}
