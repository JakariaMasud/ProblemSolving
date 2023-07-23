class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(1, n, new ArrayList<Integer>(), result, k);
        return result;
    }

    private void generateSubsets(int start, int n, List<Integer> tempList, List<List<Integer>> result, int k) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
        }
        for (int i = start; i <= n; i++) {
            tempList.add(i);
            generateSubsets(i + 1, n, tempList, result, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}