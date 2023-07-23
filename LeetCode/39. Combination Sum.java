class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        generateSumSubsets(candidates, target, new ArrayList<Integer>(), result, 0);
        return result;
    }

    private void generateSumSubsets(int[] candidates,
                                    int target, ArrayList<Integer> tempList,
                                    List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            generateSumSubsets(candidates, target - candidates[i], tempList, result, i);
            tempList.remove(tempList.size() - 1);
        }
    }


}
