package UVA.UVA10189;

import java.util.Scanner;

/**
 * Created by vishal on 12/6/15.
 */
public class Main {

    public  static  void  main(String[] args){

        Scanner in = new Scanner (System.in);
        while ( true ){
            Integer a = in.nextInt();
            Integer b = in.nextInt();

            if ( a == 0 && b == 0 )
                break;


            char[][] mine = new char[a][b];

            for ( int i = 0 ; i < a ; i++ ) {
                for ( int j = 0 ; j < b ; j++ ){
                    mine[i][j] = in.next().charAt(0);
                }
            }


        }


    }

}
