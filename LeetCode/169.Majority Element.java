public int majorityElement(int[] nums) {
        int target = nums.length / 2;
        for (int selectedNum : nums) {
            int count = 0;
            for (int num : nums) {
                if (selectedNum == num) count++;
            }
            if (count > target) return selectedNum;
        }
        return 0;
    }
