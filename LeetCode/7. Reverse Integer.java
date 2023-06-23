class Solution {
    public int reverse(int n) {
        int reversedNum = 0;
        int sign = 1;
        if (n < 0) {
            sign = -1;
            n = n * sign;
        }
        while (n > 0) {
            int digit = n % 10;
            if (reversedNum * sign > Integer.MAX_VALUE / 10 || reversedNum * sign < Integer.MIN_VALUE / 10) return 0;
            reversedNum = reversedNum * 10 + digit;
            n = n / 10;
        }
        return reversedNum * sign;
    }
}