class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        boolean ascendingRotation = true;
        boolean descendingRotation = true;

        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int next = nums[(i + 1) % n];

            if (next != (current + 1) % n) {
                ascendingRotation = false;
            }

            if (next != (current - 1 + n) % n) {
                descendingRotation = false;
            }
        }

        int answer = Integer.MAX_VALUE;

        if (ascendingRotation) {
            int k = nums[0];
            int direct = (n - k) % n;
            int viaReverse = k + 2;

            answer = Math.min(answer, Math.min(direct, viaReverse));
        }

        if (descendingRotation) {
            int k = (n - 1 - nums[0] + n) % n;
            int cost = 1 + Math.min(k, n - k);

            answer = Math.min(answer, cost);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}