    /*
    283. Move Zeroes

    given an array e.g. [1, 0, 0, 3, 12, 46, 15]
    move all items to left (maintaining order), and all zeroes to the right

   we use two arrows, i and j.
   i only increases if, element is not zero
   j increases everytime

     */

    class Solution {
        public void moveZeroes(int[] nums) {

            int i = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != 0){
                    swap(nums, i, j);
                    i++;
                }
            }


        }

        //(array, item ith, item jth) swap them
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    }
