import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vishal on 11/3/15.
 */
public class UVA11450 {

    public static void  main( String[] args) {

        Scanner in = new Scanner(System.in);
        //read no of test cases
        int t = in.nextInt();
        while (t-- > 0) {
            int price[][] = new int[25][25];
            Boolean reachable[][]  = new Boolean[25][210];

            for ( int i = 0 ; i < 25 ; i++){
                Arrays.fill(reachable[i],false);
            }

            int M = in.nextInt();
            int C = in.nextInt();

            for (int g = 0; g < C; g++) {
                price[g][0] = in.nextInt();
                for (int money = 1; money <= price[g][0]; money++) {
                    price[g][money] = in.nextInt();
                }
            }


            for ( int g = 1 ; g <= price[0][0] ; g++ ){
                if ( M - price[0][g] > 0){
                    reachable[0][M-price[0][g]] = true;
                }
            }

            for ( int g = 1; g <= C; g++ ) {
                for (int money = 0; money < M; money++) {
                    if (reachable[g - 1][money]) {
                        for (int k = 1; k <= price[g][0]; k++) {
                            if (money - price[g][k] >= 0) {
                                reachable[g][money - price[g][k]] = true;
                            }
                        }
                    }
                }
            }


            int money = 0;
            for ( money = 0 ; money <= M  && !reachable[C-1][money] ; money++ );

            if ( money == M + 1 ){
                System.out.println("no solution");
            }else {
                System.out.println(M-money);
            }

        }

    }
}
