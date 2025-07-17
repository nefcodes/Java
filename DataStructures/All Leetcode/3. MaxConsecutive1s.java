/*
485. Max Consecutive 1s

array = [1, 0, 0 , 1, 1, 1, 0]
max consecutive ones is 3

 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

    int answer = 0;
    int counter = 0;
    
    //iterate i frmo 0 to last index
    for(int i = 0; i < nums.length; i++){
        
        //if at any point item is 0, reset counter. otherwise counter++
        if(nums[i] == 0 ){
            counter = 0;
        }
        else {
            counter++;
        }
        
        // initially when it first encounters 1, it will increment the counter
        // but then only if there is next one. the counter will increase.
        if(counter > answer){ // 
            answer = counter;
        }
    }

        return answer;
    }
}
