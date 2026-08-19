class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        // while(start < end){
        //     int mid = start +(end - start)/2;

        //     if(nums[mid] == target) return mid;
        //     if(nums[mid] > target) end = mid-1;
        //     if(nums[mid] < target) start = mid+1;

        // }
        // return -1;
        return BS(nums,start,end,target);
    }
    
    public int BS(int[] arr,int s,int e,int t){
        int mid = s + (e-s)/2;

        if(s > e) return -1;

        if(arr[mid] == t) return mid;

        if(arr[mid] > t) {
            return BS(arr,s,mid-1,t);
        }
        else{
            return BS(arr,mid+1,e,t);
        }
    }

}