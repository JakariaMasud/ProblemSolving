class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int low = 1, high = x;
        int answer = 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int temp = x / mid;
            if (mid == temp) return mid;
            else if (temp < mid) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }
        return answer;
    }
}