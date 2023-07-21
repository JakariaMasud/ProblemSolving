class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
        int count = 0;
        for (char ch : jewels.toCharArray()) {
            if (!jewelsSet.contains(ch)) {
                jewelsSet.add(ch);
            }
        }
        for (char ch : stones.toCharArray()) {
            if (jewelsSet.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}
