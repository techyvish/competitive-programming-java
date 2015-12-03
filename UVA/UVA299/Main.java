package UVA.UVA299;

import java.util.Scanner;

/**
 * Created by vishal on 12/2/15.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Integer tc =  in.nextInt();

        while ((tc-- ) != 0 ){
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i =0 ; i < n ; i++ ){
                a[i] = in.nextInt();
            }

            int c=0;
            for ( int i = 0; i < n ; i++ ) {
                for (int j = i+1; j < n; j++) {
                    if (a[i] > a[j]) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                        c++;
                    }
                }
            }

            System.out.println("Optimal train swapping takes "+c+" swaps.");
        }
    }
}
