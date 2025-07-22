/*
Given an integer array nums, find the subarray without breaks having the largest sum, and return its sum.

a sequence [a1, a2, a3, a4....]

return the sum of connected sub array.
if at any point sum becomes zero, discard it. bcz even if there is +ve value. -ve value came in between and cuts the substring
so need to discard it.

complexity o(n)
 */


class Solution {
    public int maxSubArray(int[] nums) {

        int maxYet = nums[0]; // set to first item
        int currentSum = nums[0];

        // iterating from 1, bcz we already covered 0th element
        for (int i = 1; i < nums.length; i++){
 
            //house keeping
            if(currentSum < 0){
                currentSum = 0; // if first element neg, make zero
            }

            currentSum = currentSum + nums[i]; // in every iteration add values sumed yet + current index

            if(currentSum > maxYet) {
                maxYet = currentSum;
            }
        }
        return maxYet;

    }
}
