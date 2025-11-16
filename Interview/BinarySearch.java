package Interview;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(search(numbers, 6));
    }

    public static int search(List<Integer> numbers, int target) {
        int n = numbers.size();
        int mid = n / 2;

        if(numbers.get(mid) == target) {
            return mid;
        }

        int loopStart = 0;
        int loopEnd;
        if (target < numbers.get(mid)) {
            loopEnd = mid;
        } else {
            loopStart = mid + 1;
            loopEnd = n;
        }
        for (int i = loopStart; i < loopEnd; i++) {
            if (target == numbers.get(i)) {
                return i;
            }
        }

        return -1;
    }
}

