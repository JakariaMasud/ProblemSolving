class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') finalValue++;
            else finalValue--;
        }
        return finalValue;
    }
}
