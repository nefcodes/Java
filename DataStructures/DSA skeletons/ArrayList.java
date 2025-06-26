/*

    ArrayList = resizable array that stores objects (autoboxing)

 */

import java.util.ArrayList;
import java.util.Collections; // to sort

public class Main{
    public static void main(String[] args) {

       ArrayList<Integer> arList = new ArrayList<>();

       arList.add(3);
       arList.add(1);
       arList.add(15);


       arList.remove(Integer.valueOf(15)); // remove integers values
       arList.remove(1); // remove at index


        // changing values
        arList.add(1);  // re ading bcz, to change elements need to be there
        arList.add(15);

       arList.set(0, 16); arList.set(1, 61);  // (index, value)



        System.out.println(arList.size()); // get no. of total items


        //sorting
        Collections.sort(arList);

        System.out.println(arList);
    }
}
