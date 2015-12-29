package UVA.UVA591;

import java.util.Scanner;

/**
 * Created by vishal on 12/29/15.
 */
public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc = 0;
        int j =1  ;
        while ((tc = in.nextInt()) != 0 ){
            int sum = 0;
            int[] arr = new int[tc];
            for ( int i= 0 ; i < tc ; i++ ){
                arr[i] = in.nextInt();
                sum+= arr[i];

            }

            int num = sum/ tc ;
            int moves = 0;
            for ( int i = 0 ; i < tc ; i++ ){
                if ( arr[i] - num > 0 ){
                    moves += arr[i] - num;
                }
            }

            System.out.println("Set #" + j);
            System.out.println("The minimum number of moves is "+ moves + ".");
            System.out.println();
            j++;
        }
    }
}
