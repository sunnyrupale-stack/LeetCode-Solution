class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
            m.put(nums[i],i);
        }
        for(int i = min; i <= max; i++){
            if(!m.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}