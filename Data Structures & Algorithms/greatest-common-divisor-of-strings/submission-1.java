class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i < n + m; i++) {
            char c1 = (i < n) ? str1.charAt(i) : str2.charAt(i - n);
            char c2 = (i < m) ? str2.charAt(i) : str1.charAt(i - m);

            if (c1 != c2)
                return "";
        }

        int gcdLen = gcd(n, m);

        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}