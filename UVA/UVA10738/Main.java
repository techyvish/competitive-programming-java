//package UVA.UVA10738;

import java.util.Scanner;

/**
 * Created by vishal on 11/29/15.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        int c=1;
        while ( (tc --) != 0 ){
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = 0;
            for ( int i = a ; i <=b ; i++){
                if ( i %2 != 0 ) {
                    sum += i;
                }
            }
            System.out.println("Case "+ (c++) +": "+ sum);
        }
    }

}
