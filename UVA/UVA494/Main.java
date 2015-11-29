//package UVA.UVA494;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vishal on 11/29/15.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((str = input.readLine()) != null) {
            boolean op = false;
            int count = 0;
            for ( char c : str.toCharArray()){
                if ( Character.isLetter(c)){
                    if ( !op) {
                        op = true;
                        count++;
                    }
                }else {
                    op = false;
                }
            }
            System.out.println(count);
        }
        System.exit(0);
    }
}
