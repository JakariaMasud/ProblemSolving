class Solution {
    public int addDigits(int num) {
        int result = addDigitRec(num);
        return result;
    }

    private int addDigitRec(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        if (sum <= 9) return sum;
        else return addDigitRec(sum);
    }
}
