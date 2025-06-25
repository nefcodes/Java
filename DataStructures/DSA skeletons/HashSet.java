import java.util.HashSet;

// hashset only contains unique items
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

    }
}
