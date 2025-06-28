// beats 100% in runtime
class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) {         //negative can't be palindrome
            return false;
        }

        int reverse = 0; // to store reverse value
        int backup = x; // store x as backup

        //reverse
        while (backup != 0) {
            reverse = reverse * 10 + backup % 10; // this reverse * 10, would change position of adding the, last digit of integer
            backup = backup / 10;            // delete last digit, to get the last string in the next iteration of ( reverse * 10 + backup % 10;)
        }


        //finally check if reversed and original are same
        return (reverse == x);
    }
}
