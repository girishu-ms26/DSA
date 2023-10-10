package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[]args) {
        int[] nums = {2,5,5,11};
        int[] res = twoSumUsingMap(nums,10);
        Arrays.stream(res).forEach(i -> System.out.println(i));
    }
    /*public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1};
    }*/

    public static int[] twoSumUsingMap(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

}
