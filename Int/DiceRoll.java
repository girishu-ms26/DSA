package Int;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        System.out.println(distinctSequences(2));
    }
    public static int distinctSequences(int n) {
        if (n==1)
            return 6;
        int[][][] dp = new int[n][7][7];
        int M = (int)1e9+7;
        int[][] valid = {
                {},
                {1, 2, 3, 4, 5, 6}, // gcd(1, x) = 1
                {1, 3, 5},          // gcd(2, x) = 1
                {1, 2, 4, 5},       // gcd(3, x) = 1
                {1, 3, 5},
                {1, 2, 3, 4, 6},
                {1, 5}
        };
        for (int i = 1; i <= 6; i++){ // base case
            for (int j : valid[i]){
                if (j!=i){
                    dp[0][j][i]=1;
                }
            }
        }
        for (int i = 1; i < n-1; i++){       // for each roll
            for (int j = 1; j <= 6; j++){    // for each ending number
                for (int k : valid[j]){      // for each last valid number
                    for (int m : valid[k]){  // for each 2nd to last valid number
                        if (k!=m&&j!=k&&j!=m){ // if they are not the same,
                            dp[i][k][j]=(dp[i][k][j]+dp[i-1][m][k])%M; // update the count
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                ans += dp[n-2][i][j];
            }
        }
        return (int)(ans % M)-1;
    }
}
