/*
Problem:
Check whether a given string is a palindrome.

Approach:
Use two pointers from start and end.
Compare characters until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
