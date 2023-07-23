class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int length = s.split(" ").length;
            if (max < length) max = length;
        }
        return max;
    }
}