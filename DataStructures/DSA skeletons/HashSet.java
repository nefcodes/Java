import java.util.HashSet;
import java.util.Iterator; //iterates over set, just like for each loop

// hashset only contains unique items, and unordered
public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> hset1 = new HashSet<>();

        //add o(1)
        hset1.add(1);
        hset1.add(2);
        hset1.add(3);

        //search, o(1)
        if(hset1.contains(2)) {
            System.out.println("set contains 2.");
        }

        hset1.remove(2);

        // print all items
        for(int item : hset1){
            System.out.println(item);
        }

        System.out.println("hashset size is: " + hset1.size());

        // iterate with iterator
        Iterator it = hset1.iterator();

        System.out.println("Next value is: " + it.next()); // first value is null by default. next could be anything at first, but then becomes normal next
        System.out.printf("does next value exists?: " + it.hasNext());; // does next val exists? (boolean)

    }
}
