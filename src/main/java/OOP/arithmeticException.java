package OOP;

public class arithmeticException {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block is always executed.");
        }
        System.out.println("Program continues...");
    }

}
