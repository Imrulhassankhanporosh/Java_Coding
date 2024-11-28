

//HashMap: Key-value pairs printed, with keys iterated.

package DSA;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {

        // Declaration and initialization
        HashMap<String,Integer> map = new HashMap<>();

        // Adding elements
        map.put("Apple",100);
        map.put("Banana",200);

//        printing the hashmap approach 1

//        for(Integer key: map.keySet())
//        {
//            System.out.println("Key : "+key+" Value : "+map.get(key));
//        }

//        printing the hashmap approach 2

        map.forEach((key, value) -> System.out.println("Product: " + key + ", Quantity: " + value));
        // Get specific key-value pair

        String key1 = "Apple";
        String key2 = "Banana";

        System.out.println("Key : "+key2+" Value : "+map.get("Banana"));
        System.out.println("Key : "+key1+" Value : "+map.get("Apple"));

        // Print elements from middle index to the last index
        //based on KEY , so iteration will not work
//        System.out.println("Elements from the middle to the end:");
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i));
//        }
    }
    }
