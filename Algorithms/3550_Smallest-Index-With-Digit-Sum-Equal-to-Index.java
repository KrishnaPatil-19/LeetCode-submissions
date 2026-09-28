class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int num = nums[i], var = 0;
            while(num > 0){
                var += num % 10;
                num /= 10;
            }
            if(i == var){
                return i;
            }
        }
        return -1;
    }
}