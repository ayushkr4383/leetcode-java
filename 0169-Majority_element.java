import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int most=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])>n/2){
                most = nums[i];
            }
        }
        return most;
    }
}