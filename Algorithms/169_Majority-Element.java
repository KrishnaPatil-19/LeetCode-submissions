class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                candidate = nums[i];
                count++;
            } else if (candidate == nums[i]) {
                count++;
            } else if (candidate != nums[i]) {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count++;
                }
            }
        }

        return candidate;
    }
}