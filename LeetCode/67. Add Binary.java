class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                int num = a.charAt(i) - '0';
                sum = sum + num;
                i--;
            }
            if (j >= 0) {
                int num = b.charAt(j) - '0';
                sum = sum + num;
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) sb.append("1");
        return sb.reverse().toString();
    }
}