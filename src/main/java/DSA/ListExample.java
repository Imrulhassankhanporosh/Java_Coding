

//List: Ordered list printed by index.

package DSA;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {


        // Declaration and initialization
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("20");
        list.add("10");
        list.add("15");

        // Accessing an element by index
        System.out.println("First element: " + list.get(0)); // Output: "20"

        // Iterating over the List
        for(String item : list)
        {
            System.out.println(item);
        }

        // Print elements from middle index to the last index
        System.out.println("Elements from the middle to the end:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
