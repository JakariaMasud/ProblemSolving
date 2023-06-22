class Solution {
    public int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        boolean isNegative = false;
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        int index = 0;
        double result = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            int digit = ch - '0';
            if (digit >= 0 && digit <= 9) {
                result = result * 10 + digit;
                index++;
            } else {
                break;
            }
        }
        result = isNegative ? result * (-1) : result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;

    }
}