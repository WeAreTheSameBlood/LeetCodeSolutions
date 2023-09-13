package hlybchenko;

import java.util.HashMap;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {

        // 1 ms runtime
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int searchFor = target - nums[i];
            if (map.containsKey(searchFor)) return new int[]{map.get(searchFor), i};
            map.put(nums[i], i);
        }

        // 92 ms runtime
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if ( i != j && nums[i] + nums[j] == target) return new int[]{i, j};
//            }
//        }

        return new int[0];
    }
}

