import java.util.HashMap;
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int subarraySum(int[] nums, int k) {
        map.put(0, 1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            int target = sum-k;
            if(map.containsKey(target)){
                count = count+map.get(target);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        return count;
    }
}