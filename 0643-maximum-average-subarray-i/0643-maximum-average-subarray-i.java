class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double mavg = Double.NEGATIVE_INFINITY;

        for(int i = 0; i <= n-k; i++){

            int L = i , R = i + k - 1;
            int sum = 0;

            while(L <= R){
                sum += nums[L++];
            }
            double avg = (double) sum / k;
            if(mavg < avg) mavg = avg;
        }
        return mavg;
    }
}