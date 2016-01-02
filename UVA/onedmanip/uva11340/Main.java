package UVA.onedmanip.uva11340;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * Created by vishal on 1/1/16.
 */
public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);


        int tc = in.nextInt();
        while ( (tc -- ) != 0 ) {

            int nc = in.nextInt();
            TreeMap<Character,Integer> tble = new TreeMap<Character,Integer>();
            for ( int i = 0 ; i < nc ; i ++ ) {
                Character l = in.next().charAt(0);
                int val = in.nextInt();
                tble.put(l,val);
            }

            int nline = in.nextInt();

            double sum = 0.0;
            for ( int i = 0 ; i < nline ; i++ ){
                String line = in.nextLine();
                for ( int j = 0 ; j < line.length() ; j++ ){
                    if ( tble.get(line.charAt(j)) != null )
                        sum+= tble.get(line.charAt(j));
                }
            }

            System.out.println(sum/100.0+"$");

        }

    }

}
