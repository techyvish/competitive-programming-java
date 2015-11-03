import java.util.Scanner;

/**
 * Created by vishal on 11/3/15.
 */
public class UVA11450 {

    public static void  main( Stringp[] args) {

        Scanner in = new Scanner(System.in);
        //read no of test cases
        int t = in.nextInt();
        int models[][] =int[20][20];

        while (t-- > 0) {

            int m = in.nextInt();
            int g = in.nextInt();

            for (int i = 0; i < g; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    models[i][j] = in.nextInt();
                }
            }
        }



    }
}
