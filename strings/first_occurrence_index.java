/*
Problem:
Find the index of the first occurrence of a pattern in a string.
Return -1 if the pattern does not exist.

Approach:
Check every possible starting index.
Compare characters one by one.

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

class Solution {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
