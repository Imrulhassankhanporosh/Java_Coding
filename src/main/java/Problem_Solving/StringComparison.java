package Problem_Solving;

public class StringComparison {

    public static void main(String[] args) {
        // Strings to compare
        String str1 = "hello";
        String str2 = "hello";

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Compare lengths first
        if (arr1.length != arr2.length) {
            System.out.println("The strings are not equal.");
        } else {
            // Compare characters
            boolean areEqual = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }

            if (areEqual) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
        }
    }
}
