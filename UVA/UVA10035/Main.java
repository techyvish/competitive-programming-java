package UVA.UVA10035;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vishal on 11/29/15.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        Integer b = in.nextInt();

        String as = a.toString();
        String bs = b.toString();

        String fs, ks;
        if ( as.length() > bs.length()) {
            char[] chars = new char[as.length()-bs.length()];
            Arrays.fill(chars,'0');
            String res = new String(chars);
            fs = res+bs;
            ks = as;
        }else if ( as.length() < bs.length()) {
            char[] chars = new char[bs.length()-as.length()];
            Arrays.fill(chars,'0');
            String res = new String(chars);
            fs = res+as;
            ks = bs;
        }else {
            fs = as;
            ks = bs;
        }

        char [] P = fs.toCharArray();
        char [] Q = ks.toCharArray();
        for ( int i = fs.length() ; i >= 0 ; i--) {
        
        }

    }

}
