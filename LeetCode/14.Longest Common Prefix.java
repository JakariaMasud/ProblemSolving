class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder resultString = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length - 1];
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                break;
            }
            resultString.append(first.charAt(i));
        }
        return resultString.toString();
    }
}
