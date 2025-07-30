/*
Nethrlands flag problem..
0, 1, 2 as red white blue

arrange them in order of netherlands flag

-------------------------------------
Easiest approach, just sort. O(nLogn)
-------------------------------------
Optimized approach, create hashmaps for no of occurences   O(n) and space of also O(n)
then create a new array and fill w/ equivalent values
---------------------------------------------------------------------------

Best Approach,  in a single loop

if see
 0: put it at the left available index,
 1: don't do anything
 2: put it at the right available index



 */

class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;

        int i =0;
        while(i <= right){ // traverse upto < right
            if(nums[i]==0){ // if 0, swap at the left available index
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++; // because there can only be 0s, so moving forward
                i++;
            }
            else if(nums[i] == 2){ // if item is 2, swap from the right available space
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
                // but not left++, bcz the element we swapped to the right,
                // we got an element, that could also be 0, so need to check the left side before increasing it
            }
            else{
                i++; // if its 1, do nothing
            }

        }

    }
}
