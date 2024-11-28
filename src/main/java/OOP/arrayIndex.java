package OOP;

public class arrayIndex {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred."+e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues...");
    }
}
