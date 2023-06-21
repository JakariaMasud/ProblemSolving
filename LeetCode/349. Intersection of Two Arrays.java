class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersects = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                intersects.add(num);
            }
        }
        int index = 0;
        int result[] = new int[intersects.size()];
        for (int val : intersects) {
            result[index] = val;
            index++;
        }
        return result;
    }
}