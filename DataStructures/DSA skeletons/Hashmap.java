/*

    HASHMAPS = set of key-value pairs, unordered & unique keys, but the value can repeat

 */

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> hmap1 = new HashMap<>();  // key = string, val = double

        hmap1.put("apple", 0.50); //add to hashmap
        hmap1.put("orange", .75);
        hmap1.put("banana", .25);
        hmap1.put("orange", .778); // update val
        hmap1.remove("banana"); // remove



        System.out.println(hmap1);
        System.out.print("apple val: " + hmap1.get("apple")); // get value of key
        System.out.println("\nhmap contains banana?: " + hmap1.containsKey("banana")); // check if exists, returns boolean
        System.out.println("contains value 1?: " + hmap1.containsValue(1));
        System.out.println(hmap1.size()); // get no of items

        //------------------------------------------------
        // iterate over keys    
        for(String key : hmap1.keySet()){
            System.out.println(key + " : $ " + hmap1.get(key) );
        }


    }
}
