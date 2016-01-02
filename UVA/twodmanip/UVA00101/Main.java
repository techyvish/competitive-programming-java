package UVA.twodmanip.UVA00101;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vishal on 1/3/16.
 */
public class Main {

    public static  void main(String args[]){

        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        for (int i =0 ;i < c ; i++ ){
            String command = in.nextLine();
            StringTokenizer st = new StringTokenizer(command);
            if ( st.nextToken() == "move "){

                
            }else if ( st.nextToken() == "pile"){

            }
        }

    }

}
