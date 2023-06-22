class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        StringBuilder validString = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                validString.append(ch);
            }
        }
        String originalString = validString.toString();
        String reversedString = reverseString(originalString);
        return originalString.equals(reversedString);
    }

    public String reverseString(String s) {
        char charArray[] = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}