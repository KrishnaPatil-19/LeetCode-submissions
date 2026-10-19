class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq.getOrDefault(ch, 0) == 0) {
                return false;
            } else {
                freq.put(ch, freq.get(ch) - 1);
            }
        }

        return true;
    }
}