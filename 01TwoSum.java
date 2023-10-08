class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums.length; a++){
                if(a == i){
                    continue;
                }
                if (nums[a] + nums[i] == target){
                    int[] temp = {i,a};
                    return temp;
                }
            }
        }
        return null;
    }
}

import java.util.HashMap;

class Solution2 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int wish = target - nums[i];
            if(map.get(wish) != null){
                return new int[] {i,map.get(wish)};
            }
            if(map.get(nums[i]) == null){
                map.put(nums[i],i);
            }
            
        }
        return null;
    }
}