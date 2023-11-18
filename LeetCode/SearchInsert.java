package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class SearchInsert {
    public static void main(String[]args) {
        int[] num1 = {1,3,5,6};
        int[] num2 = {1,3};
        int[] num3 = {1,4,6,7,8,9};
        int[] num4 = {1};
        int[] num5 = {2,5};
        int[] num6 = {2,3,4,7,8,9};
        int[] num7 = {1,3,5,6};
        int[] num8 = {3,4,7,10};
        int[] num9 = {2,3,4,7,8,9};
        System.out.println(searchInsert(num2,4));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        while (left<=right){
            int mid  = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
