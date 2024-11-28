

//Set: Unique items printed, without duplicates.

package DSA;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // Declaration and initialization
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");


        // Adding a duplicate element (won't be added)
        set.add("Apple");

        // Iterating over the Set
        for (String item : set) {
            System.out.println("Item: " + item);
        }

        // Checking if an element exists in the Set
        System.out.println("Set contains 'Banana': " + set.contains("Banana")); // Output: true




//        In Java, Set does not have indexed access (like LinkedList or ArrayList) because it’s an unordered collection. However,
//        if you need to access elements from a specific position to the end of the set, you can convert it to a List first, then
//        access elements based on index.


        // Print elements from middle index to the last index
//        System.out.println("Elements from the middle to the end:");
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }
    }
}
