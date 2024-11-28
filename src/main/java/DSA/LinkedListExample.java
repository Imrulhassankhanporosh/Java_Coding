package DSA;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Declaration and initialization
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("Mango");

        // Adding an element at the end
        linkedList.addLast("Peach");

        System.out.println("LinkedList after additions: " + linkedList);

        // Removing the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("LinkedList after removals: " + linkedList);

        // Accessing an element by index
        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: "Banana"

        // Print elements from middle index to the last index
        System.out.println("Elements from the middle to the end:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
