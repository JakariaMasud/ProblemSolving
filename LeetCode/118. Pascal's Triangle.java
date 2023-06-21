class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++)
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 2).get(j) + triangle.get(i - 2).get(j - 1));
                }
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }

}