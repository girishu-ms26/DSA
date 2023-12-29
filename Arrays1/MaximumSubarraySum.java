package Arrays1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

import static java.util.Arrays.stream;

public class MaximumSubarraySum {
    public static void main(String[]args) {
        int[] nums = {1,5,4,2,9,9,9};
        int[] nums1 = {1,1,1,7,8,9};
        int[] nums2 = {4,4,4};
        int[] nums3 = {1,2,2};
        int[] nums4 = {1,1,1,1,1,1};
        int[] nums5 = {1,1,1,1,1,1};
        int[] nums6 = {4,3,3,3,2};
        int[] nums7 = {3};
        int[] nums8 = {2,5,4,5};
        System.out.println(maximumSubarraySum(nums,3)); // 15
//        System.out.println(maximumSubarraySum(nums1,3)); // 24
//        System.out.println(maximumSubarraySum(nums2,3)); // 0
//        System.out.println(maximumSubarraySum(nums3,2)); // 3
//        System.out.println(maximumSubarraySum(nums4,1)); // 1
//        System.out.println(maximumSubarraySum(nums5,2)); // 0
//        System.out.println(maximumSubarraySum(nums6,5)); // 0
//        System.out.println(maximumSubarraySum(nums7,1)); // 3
//        System.out.println(maximumSubarraySum(nums8,4)); // 0
    }
    /*public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        if(nums.length==1 && nums.length == k) {
            return nums[0];
        }
        IntSummaryStatistics summary = Arrays.stream(nums).summaryStatistics();
        if(summary.getMin() == summary.getMax() && nums.length == k) {
            return 0;
        }
        for(int left=0;left<=n-k;left++) {
            sum = nums[left];
            map.put(nums[left],map.getOrDefault(nums[left],0)+1);
            for(int j=left+1;j<=left+k-1;j++) {
                if(nums[j-1] == nums[j]) {
                    sum=0;
                    break;
                }
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.get(nums[j]) > 1 || map.get(nums[left]) > 1) {
                    if(map.get(nums[j]) > 1 || map.get(nums[left]) > 1 && nums.length == k) {
                        sum=0;
                    }
                    break;
                } else {
                    sum = sum + nums[j];
                }
            }
            ans = Math.max(ans, sum);
            map.clear();
        }
        return ans;
    }*/

    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long max = 0, sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if (i >= k - 1){
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }
                sum = sum - nums[i - k + 1];
                map.put(nums[i - k + 1], map.get(nums[i - k + 1]) - 1);
                if (map.get(nums[i - k + 1]) == 0) {
                    map.remove(nums[i - k + 1]);
                }
            }
        }
        return max;
    }
}
