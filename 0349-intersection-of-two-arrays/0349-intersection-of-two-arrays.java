import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length,m = nums2.length;
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        List<Integer> arr = new ArrayList<>();

        int i = 0;
        while(n > i || m > i){
            
            if(n > i){
                map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
            }
            if(m > i){
                map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
            }

            i++;
        }

        for(int key : map1.keySet()) {

            if(map2.containsKey(key)) {
                arr.add(key);
            }
        }

        int[] ans = new int[arr.size()];

        for(i = 0; i < ans.length; i++) {
            ans[i] = arr.get(i);
        }
        
        return ans;

    }
}