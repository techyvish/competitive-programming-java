//package UVA.UVA10035;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vishal on 11/29/15.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer a = -1, b = -1;
        while (true) {
            a = in.nextInt();
            b = in.nextInt();

            if ( a == 0 && b == 0 )
                break;
            int r= 0;
            int c = 0;
            while ( a != 0 || b != 0 ){
                r = (a%10 + b%10 + r) / 10;
                a = a/10;
                b = b/10;
                c += r;
            }

            if (c > 0) {
                if (c == 1)
                    System.out.println(c + " carry operation.");
                else
                    System.out.println(c + " carry operations.");
            }
            else {
                System.out.println("No carry operation.");
            }

        }
    }

}
