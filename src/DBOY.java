/**
 * Created by vishal on 11/1/15.
 */
import java.util.*;
import java.math.*;


public class DBOY {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //read no of test cases
        int t = in.nextInt();

        while (t-- > 0) {

            // read number of fuel stations
            int n = in.nextInt();

            // create array for k (fuel station capacity) and H ( distance for delivary)
            int k[] = new int[n + 1];
            int h[] = new int[n + 1];

            int max = -1;

            // read fuel capacity of each station.
            for (int i = 1; i <= n; i++) {
                k[i] = in.nextInt();
                if (max < k[i])
                    max = k[i]; // find max capacity
            }

            max *= 2; // multiply max capacity by 2 for defining all states
            // state of the problem with two parameters distance and patrol in liters.

            // read distances of delivary
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();
            }

            // create dp array
            int dp[][] = new int[n + 1][max + 1];


            for (int i = 0; i <= max; i++)
                dp[0][i] = 1000000;
            dp[0][0] = 0;
            
            printTable(dp);
            
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= max; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= h[i]) {
                        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j - h[i]]);
                        System.out.println();

                        printTable(dp);
                    }
                }
            }
            
            int ans = 0;
            for (int i = 1; i <= n; i++)
                ans += dp[n][2 * k[i]];
            System.out.println(ans);


        }
    }
    
    public static void printTable(int[][] table) {
        for (int[] row : table) {
            printRow(row);
        }
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

}
