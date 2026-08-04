class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int len = nums.length;
        prefix[0] = nums[0];

        if(nums.length == 1) return 0;

        for(int i = 1; i < len ;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i = 0; i < len; i++){
            int Lsum = (i == 0)? 0 : rangesum(prefix,0,i-1);
            int Rsum = (i == len-1)? 0 : rangesum(prefix,i+1,len-1);

            if(Lsum == Rsum) return i;
        }
        return -1;

    }
    private int rangesum(int[] prefix, int L,int R){
        if(L == 0){
            return prefix[R];
        }
        return prefix[R] - prefix[L-1];
    }
}