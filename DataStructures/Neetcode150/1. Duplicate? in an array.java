//  If you have an unsorted array, finding duplicate costs Big O (n square)
//  with a sorted array, repeating items are next to each other! costs, Big O (n Log n)

// but if you use a hashset (can't contain repeating items)
// it takes big (n) and space big (n)

/*
Given an integer array nums, return true if any value appears more than once
 in the array, otherwise return false.

 in simple words
 a function, returns true if value appears twice, false if doesn't
 */

import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] givenArray) { // a function returning boolean

        //empty hashset
        HashSet<Integer> knownNumbers = new HashSet<>();

        //fill up unique items the hashset
        for (int item : givenArray){

            // if xth item in hashset, return true (empty at first)
            if(knownNumbers.contains(item)){
                return true; // duplicate found  // FUNCTION END
            }

            // otherwise add to the hashset
            knownNumbers.add(item);
        }
    // Finally, no match found and hashset has all elements
        return false;
    }
}
