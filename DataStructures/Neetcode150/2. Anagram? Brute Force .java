/*
    looop = poloo = ooolp (anagrams)

    Frequency of both string's chars is equal, they are anagrams.

    length of both strings are same, only then we compare.

    ------------------------------------------------------------
    Q. Given two strings s and t,
    return true if the two strings are anagrams of each other, otherwise return false.

    essentially, make a method returning true if anagrams and false if !anagram.
 */

//BRUTE FORCE

class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length() != t.length()){  // they can't be anagrams!
        return false;
    }

    int[] freqCounterArray = new int[26];

    for(int i = 0; i < s.length(); i++){
        freqCounterArray[s.charAt(i) - 'a']++;  // e.g. 'b' - 'a' = ASCII value. increase 1 at that index.
        freqCounterArray[t.charAt(i) - 'a']--; // decrease 1 at the index.
    }

    // if in freqCounterArray everything is zero = anagram.
        for(int val : freqCounterArray){
            if(val != 0) { // if val is not zero = true --> return false
                return false;
            }
        }

        return true; // since they didn't fail the above check they must be anagrams.
    }
}

