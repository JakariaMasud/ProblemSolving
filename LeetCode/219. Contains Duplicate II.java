    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Map -> first : value, second : index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }