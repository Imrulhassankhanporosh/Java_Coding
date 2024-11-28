package DSA;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Declaration and initialization
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Accessing the top element without removing
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Print elements from middle index to the last index
        System.out.println("Elements from the middle to the end:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
