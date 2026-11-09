class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // int maxcount = 0; // stores most freq element
        // int fn = nums[0]; // use as a pointer of starting repeating elemenet
        // int count = 0; // count each elemet freq
        // int ans = nums[0]; // stores the max frrequent element

        // for(int i = 0; i < nums.length; i++){
        //     if(fn == nums[i]){
        //         count++;
        //         if(maxcount < count){
        //             maxcount = count;
        //             ans = nums[i];
        //         }
        //     }
        //     else{
        //         fn = nums[i];
        //         count = 1;
        //     }
        // }
        // return ans;

        int n = nums.length;
        return nums[n/2];
    }
}