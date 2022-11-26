package org.gb;

public class HW4 {
    class Solution {
        public String reverseWords(String s) {
            if (s == null || s.length() == 0) {
                return s;
            }

            String res = "";
            String[] words = s.trim().split("\\s+");
            for (int i = words.length - 1; i > 0; --i) {
                res += words[i] + " ";
            }
            return res + words[0];
        }
    }

    public class Solution_sb {
        public String reverseWords(String s) {
            String res = "";
            String[] words = s.trim().split("\\s+");
            for (int i = words.length - 1; i > 0; --i) {
                res += words[i] + " ";
            }
            return res + words[0];
        }
    }
}
