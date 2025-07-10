/*

FIZZ BUZZ
given integer n, write a string which has n items
if div by 3 = Fizz, if div by 5 = Buzz, if both 3 and 5 = FizzBuzz, otherwise just the number

Time Complexity o(n), Space O(1)
 */

import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();

    for(int cur=1; cur <= n; cur++){ // not using it from 0, bcz we want number from 1
        if(cur%3 == 0 && cur % 5 ==0){
            answer.add("FizzBuzz");
        } else if( cur %3 ==0){
            answer.add("Fizz");
        } else if (cur %5 ==0) {
            answer.add("Buzz");
        } else{
            answer.add(cur + ""); // int to string
        }

    }
    return answer;
    }
}
