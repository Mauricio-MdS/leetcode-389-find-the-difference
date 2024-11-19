import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char difference = 0;

        for (char c : s.toCharArray()) {
            difference ^= c;
        }

        for (char c : t.toCharArray()) {
            difference ^= c;
        }

        return difference;
    }
}