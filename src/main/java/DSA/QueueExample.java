package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Declaration and initialization
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("John");
        queue.add("Jane");
        queue.add("Jack");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Accessing the front element without removing
        System.out.println("Front element: " + queue.peek()); // Output: "John"

        // Removing elements from the queue
        System.out.println("Removed element: " + queue.poll()); // Output: "John"
        System.out.println("Queue after removal: " + queue);

        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false


//        In Java, Queue also does not support indexed access because it’s designed for FIFO (First In, First Out) operations.
//            However, similar to Set, you can convert a Queue to a List to access elements by index

//        // Print elements from middle index to the last index
//        System.out.println("Elements from the middle to the end:");
//        for (int i = 0; i < queue.size(); i++) {
//            System.out.println(queue.get(i));
//        }
    }


}
