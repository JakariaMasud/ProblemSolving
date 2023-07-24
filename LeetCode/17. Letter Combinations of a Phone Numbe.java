class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        generatePadSubset(digits, 0, hashMap, new StringBuilder(), result);
        return result;
    }

    private void generatePadSubset(String digits, int digitPointer, HashMap<Character, String> hashMap, StringBuilder sb, List<String> result) {

        if (digitPointer == digits.length()) {
            result.add(sb.toString());
            return;
        }
        String chars = hashMap.get(digits.charAt(digitPointer));
        for (int i = 0; i < chars.length(); i++) {
            sb.append(chars.charAt(i));
            generatePadSubset(digits, digitPointer + 1, hashMap, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }


    }


}