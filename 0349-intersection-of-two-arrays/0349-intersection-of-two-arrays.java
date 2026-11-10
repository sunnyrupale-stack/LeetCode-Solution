import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
            if( i > 0 && nums1[i] == nums1[i-1]){
                continue;
            }

            if(BS(nums2,nums1[i]) == true){
                result.add(nums1[i]);
            }
        }
        int[] ans = new int[result.size()];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = result.get(i);
        }
        return ans;

    }
    boolean BS(int[] arr,int target){
        int start = 0,end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}