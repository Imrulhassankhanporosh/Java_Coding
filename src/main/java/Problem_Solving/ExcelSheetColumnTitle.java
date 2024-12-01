
//168. Excel Sheet Column Title (LeetCode)
package Problem_Solving;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber){

        StringBuilder result = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            char letter= (char) ('A'+columnNumber%26);
            result.append(letter);
            columnNumber=columnNumber/26;

        }
        return result.reverse().toString();

    }



    public static void main(String[] args){
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        String result =solution.convertToTitle(701);
        System.out.println(result);
    }
}
