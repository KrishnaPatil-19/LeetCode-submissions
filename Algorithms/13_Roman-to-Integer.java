class Solution {
    public int romanToInt(String s) {
        int num = 0;
        HashMap<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
        for(int i = 0; i < s.length(); i++){
            int current = numerals.get(s.charAt(i)), next;
            if(i == s.length() - 1){
                next = 0;
            } else {
                next = numerals.get(s.charAt(i+1));
            }
            if(current >= next){
                num += current;
            } else {
                num -= current;
            }
        }

        return num;
    }
}