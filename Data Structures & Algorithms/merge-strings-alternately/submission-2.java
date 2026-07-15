class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        StringBuilder result = new StringBuilder(m + n);

        int i = 0;

        while (i < m || i < n) {
            if (i < m)
                result.append(word1.charAt(i));

            if (i < n)
                result.append(word2.charAt(i));

            i++;
        }

        return result.toString();
    }
}