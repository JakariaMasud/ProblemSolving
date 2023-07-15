class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> frequencyStringsMap = new HashMap<>();
        for (String str : strs) {
            String frequencyString = getFrequencyString(str);
            if (frequencyStringsMap.containsKey(frequencyString)) {
                frequencyStringsMap.get(frequencyString).add(str);
            } else {
                List<String> newlist = new ArrayList<>();
                newlist.add(str);
                frequencyStringsMap.put(frequencyString, newlist);
            }
        }
        return new ArrayList<>(frequencyStringsMap.values());

    }

    private String getFrequencyString(String str) {
        int frequency[] = new int[26];
        for (char ch : str.toCharArray()) {
            frequency[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char character = 'a';
        for (int f : frequency) {
            sb.append(character);
            sb.append(f);
        }
        return sb.toString();
    }
}