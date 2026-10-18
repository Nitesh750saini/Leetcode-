
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            freq[currChar - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (freq[currChar - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
