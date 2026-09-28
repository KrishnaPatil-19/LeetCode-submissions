class Solution {
    public boolean sumGame(String num) {
        int n = num.length(), diff = 0, qDiff = 0;

        for(int i = 0; i < n/2; i++){
            if(num.charAt(i) == '?'){
                qDiff++;
            } else {
                diff += num.charAt(i) - '0';
            }
        }
        
        for(int j = n/2; j < n; j++){
            if(num.charAt(j) == '?'){
                qDiff--;
            } else {
                diff -= num.charAt(j) - '0';
            }
        }

        //qDiff == 0 means equal number of '?' on both side
        if(qDiff == 0){
            return diff != 0;
        }

        //Each pair of '?' can compensate by at most 9
        //If the current different can exactly be compensated
        //Bob can force equality

        return diff * 2 != -9 * qDiff;
    }
}