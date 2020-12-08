package Easy;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i =0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }


        for (int i = 0;i<nums.length;i++){
            int choose = target - nums[i];
            if (hashMap.containsKey(choose) && hashMap.get(choose)!=i){
                return new int[]{hashMap.get(choose),i};

            }
        }

        return null;
    }
}
