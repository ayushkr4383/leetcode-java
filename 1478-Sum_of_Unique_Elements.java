import java.util.HashMap;
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==true){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(int x:map.keySet()){
            if(map.get(x)==1){
                sum=sum+x;
            }
        }
        return sum;
    }
}