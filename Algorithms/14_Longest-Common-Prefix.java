class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        int len = 0;

        if (strs.length == 0) {
           return "";
        }

        len = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                len = strs[i].length();
            }
        }

        for (int j = 0; j < len; j++) {
            for (int k = 0; k < strs.length; k++) {
                if (strs[k].charAt(j) != strs[0].charAt(j)) {
                     return prefix.toString();
                }
            }
                prefix.append(strs[0].charAt(j));
        }

        return prefix.toString();
    }
}