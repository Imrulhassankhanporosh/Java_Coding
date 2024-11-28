

//ArrayList: Ordered, resizable list printed by index.

package DSA;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Declaration and initialization
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing an element by index
        System.out.println("Element at index 1: " + arrayList.get(1)); // Output: "Banana"

        // Iterating over the ArrayList
        for (String item : arrayList) {
            System.out.println("Item: " + item);
        }

        // Print elements from middle index to the last index
        System.out.println("Elements from the middle to the end:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
