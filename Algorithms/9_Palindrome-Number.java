class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int checkNum = 0;

        if(x<0){
            return false;
        }
        
        while(num>0){
            checkNum = checkNum * 10 + num % 10;;
            num /= 10;
        }
        return checkNum == x;
    }
}