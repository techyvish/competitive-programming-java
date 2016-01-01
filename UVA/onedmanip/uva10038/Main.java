//package UVA.onedmanip.uva10038;
import java.util.*;

/**
 * Created by vishal on 12/31/15.
 */
public class Main {

    public static void main(String args[]){


        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            String numbers =in.nextLine();
            StringTokenizer tok = new StringTokenizer(numbers," ");
            int items = Integer.parseInt(tok.nextToken());
            int[] list = new int[items];
            int k= 0;
            while (tok.hasMoreTokens()){
               list[k ++] = Integer.parseInt(tok.nextToken());
            }

            Boolean[] ba = new Boolean[items];
            Arrays.fill(ba,false);

            for ( int i = 0 ; i < items ; i++ ){
                if ( i >= 1 ) {
                    if ( Math.abs(list[i]-list[i-1]) < items ) {
                        ba[Math.abs(list[i] - list[i - 1])] = true;
                    }
                }
            }

            String op = "Jolly";
            for ( int  i = 1 ; i < items ; i++ ){
                if ( !ba[i] ){
                    op = "Not jolly";
                    break;
                }
            }

            System.out.println(op);
        }

    }

}
