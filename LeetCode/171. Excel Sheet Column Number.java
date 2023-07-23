class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (char ch : columnTitle.toUpperCase().toCharArray()) {
            int digit = ch - 'A' + 1;
            sum = sum * 26 + digit;
        }
        return sum;
    }
}