class Solution {
    public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int left = 0, right = 0;
            int n = s.length();
            Set<Character> characterSet = new HashSet<>();
            while (right < n) {
                if (!characterSet.contains(s.charAt(right))) {
                    characterSet.add(s.charAt(right));
                    right++;
                    maxLength = Math.max(maxLength, characterSet.size());
                } else {
                    characterSet.remove(s.charAt(left));
                    left++;
                }
            }
            return maxLength;
        }
    }