class Solution {
    public String restoreString(String s, int[] indices) {
        char characters[] = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            characters[indices[i]] = s.charAt(i);
        }
        return new String(characters);
    }
}