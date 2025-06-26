/*
Two sum problem

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target. (assuming they only have 1 solution)

costs O(n) runtime, o(n) space
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hmap = new HashMap<>();

        //Iterate through array
        for(int i = 0; i < nums.length; i++){

            // what should we add to this to get the target? = complement
            int desiredNumber = target - nums[i];

            //check if the desired number is in the hmap O (1)
            if(hmap.containsKey(desiredNumber)){
                    return new int[] {hmap.get(desiredNumber), i};
            }

            // if the value isn't found add to hmap
            hmap.put(nums[i], i); // value, index
        }

        //return empty array if no solution foudn
        return new int[] {};
    }
}
