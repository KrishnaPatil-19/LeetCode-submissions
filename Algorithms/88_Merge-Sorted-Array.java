class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Unoptimal solution
        /*for(int i = m; i < nums1.length; i++){
            for(int j = 0; j < n; j++){
                if(nums1[i] == 0){
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }

        Arrays.sort(nums1);*/

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }
}