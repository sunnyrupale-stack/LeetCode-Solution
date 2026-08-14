class Solution {
    public int[] frequencySort(int[] nums) {
        Integer[] ans = new Integer[nums.length];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(ans, (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return b - a;
            }
            return map.get(a) - map.get(b);
        });

        for(int i = 0; i < nums.length;i++){
            nums[i] = ans[i];
        }
        
        return nums;
    }
}