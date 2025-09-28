public class Solution {
    public boolean isPalindrome(String s) {

        //create start and end pointersa
        int left = 0, right = s.length() -1;

        //while left is < or = right
        while(left<= right){
            //check what the char is at left index and, right index
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            //if char is not letter or digit
            if(!Character.isLetterOrDigit(leftChar)){
                left++; // move left pointer forward
            } else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            } else if (leftChar != rightChar){
                return false; //they are not palindrome stop at that
            }
            // at this stage, they are not alpha numeric and they are equal
            //after converting to lowercase
            else{
                left++;
                right--;
            }
        }
        // if you haven't return false from the above else, then the string is a palindrome
        //bcz you never found a situation when the characters were not equal
        return true;
    }
}
