
//171. Excel Sheet Column Number (LeetCode)
package Problem_Solving;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle){

        int result =0;

        for(int i=0;i<columnTitle.length();i++){
            char c = columnTitle.charAt(i);
            int value = c-'A'+1; // Get the value of the current character
            result=result*26+value; // Update the result
        }

        return result;

    }




    public static void main(String[] args){
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        int result =solution.titleToNumber("ZY");
        System.out.println(result);
    }
}
