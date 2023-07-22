class Solution {
    public int numIdenticalPairs(int[] nums) {
        int counts[] = new int[101];
        int result = 0;
        for (int num : nums) {
            counts[num]++;
        }
        for (int n : counts) {
            result = result + (n * (n - 1)) / 2;
        }
        return result;

    }
}