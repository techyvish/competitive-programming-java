
/**
 * Created by vishal on 11/5/15.
 */

import java.util.Scanner;
import java.math.*;

public class UVA507 {

    public static void main(String[] args){

        Scanner in = new Scanner();
        int t = in.nextInt();

        while ( t-- ) {
            int k = in.nextInt();
            int a[] = new int[k];
            int sum = 0, start = 0 ,ans =0;
            for ( int i = 0 ; i < k ; i++) {
                a[i] = in.nextInt();

                sum += a[i];

                ans = Math.max(ans, sum);

                if (sum < 0) {
                    sum = 0;
                    start = i;
                }

            }

        }

    }

}
