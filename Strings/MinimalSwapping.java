package Strings;

import java.util.*;

public class MinimalSwapping {
    public static void main(String[]args) {
        System.out.println(countUniqueOutcomes(2));
    }
    public static int countUniqueOutcomes(int n) {
        Set<String> uniqueSums = new HashSet<>();
        countUniqueOutcomesHelper(n, 0, 0, new boolean[6 * n + 1], uniqueSums);
        return uniqueSums.size();
    }

    private static void countUniqueOutcomesHelper(int n, int currentDice, int currentSum, boolean[] visitedSums, Set<String> uniqueSums) {
        if (n == 0) {
            // No more dice to roll, add the sum to the set
            uniqueSums.add(Integer.toString(currentSum));
            return;
        }

        // Roll each face of the die
        for (int face = 1; face <= 6; face++) {
            // Skip repeated sums by checking if the sum has been visited
            int newSum = currentSum + face;
            if (!visitedSums[newSum]) {
                visitedSums[newSum] = true;

                // Recursively count unique outcomes for the next die
                countUniqueOutcomesHelper(n - 1, currentDice + 1, newSum, visitedSums, uniqueSums);

                // Backtrack to explore other possibilities
                visitedSums[newSum] = false;
            }
        }
    }
}
