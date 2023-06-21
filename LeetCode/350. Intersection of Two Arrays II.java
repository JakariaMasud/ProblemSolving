class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : nums2) {
            if (map.containsKey(val) && map.get(val) != 0) {
                map.put(val, map.get(val) - 1);
                list.add(val);
            }
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}