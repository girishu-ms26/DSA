package Interview;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 0};

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
