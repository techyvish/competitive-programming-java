package UVA.UVA113;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vishal on 12/30/15.
 */
public class Main {
    public static void  main(String[] args){
        Scanner in = new Scanner (System.in);

        while ( in.hasNextLine() ){

            String sp = in.nextLine();
            String sn = in.nextLine();

            int p = Integer.parseInt(sp);
            int n = Integer.parseInt(sn);

            int cnt = 0;
            while (n != 1 ){
                n = n/p;
                cnt ++;
            }
            System.out.println(cnt);
        }
    }
}
