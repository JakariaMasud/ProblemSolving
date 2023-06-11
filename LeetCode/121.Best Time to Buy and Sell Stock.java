public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int diff = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            diff = Math.max(diff, prices[i] - min);
        }
        return diff;
    }
