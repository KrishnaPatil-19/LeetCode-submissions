class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0, digitProduct = 1, num = n;
        while(num>0){
            digitSum = digitSum + num % 10;
            num /= 10;
        }
        num = n;
        while(num>0){
            digitProduct = digitProduct * (num % 10);
            num /= 10;
        }

        int netSum = digitSum + digitProduct;

        if(n % netSum == 0){
            return true;
        }

        return false;
    }
}