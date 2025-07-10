/*

Single Number
given array of integers, every element appears twice, except for one
we use XOR bitwise =  0 if two elements are same

actually each num is converted to bits and those bits are XORed

if the total numbers are same. the bits would always equal to 0. otherwise there would be a remaining one
which would equal to the remaining number in bits

 */

class Solution {
    public int singleNumber(int[] nums) {
        int singleNum =0;
        for(int num : nums){
            singleNum = singleNum ^ num;
        }

        return singleNum;

    }
}
