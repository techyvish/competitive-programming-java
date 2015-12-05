package UVA.UVA10082;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vishal on 12/4/15.
 */
public class Main {


    public static void main(String[] args){

        HashMap<Character,Character> charmap = new HashMap<Character,Character>();
        charmap.put('1','`');
        charmap.put('2','1');
        charmap.put('3','2');
        charmap.put('4','3');
        charmap.put('5','4');
        charmap.put('6','5');
        charmap.put('7','6');
        charmap.put('8','7');
        charmap.put('9','8');
        charmap.put('0','9');
        charmap.put('-','0');
        charmap.put('=','-');
        charmap.put('W','Q');
        charmap.put('E','W');
        charmap.put('R','E');
        charmap.put('T','R');
        charmap.put('Y','T');
        charmap.put('U','Y');
        charmap.put('I','U');
        charmap.put('O','I');
        charmap.put('P','O');
        charmap.put('[','P');
        charmap.put(']','[');
        charmap.put('\\',']');
        charmap.put('S','A');
        charmap.put('D','S');
        charmap.put('F','D');
        charmap.put('G','F');
        charmap.put('H','G');
        charmap.put('J','H');
        charmap.put('K','J');
        charmap.put('L','K');
        charmap.put(';','L');
        charmap.put('\'',';');
        charmap.put('X','Z');
        charmap.put('C','X');
        charmap.put('V','C');
        charmap.put('B','V');
        charmap.put('N','B');
        charmap.put('M','N');
        charmap.put(',','M');
        charmap.put('.',',');
        charmap.put('/','.');

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] b = new char[text.length()];
        char[] t = text.toCharArray();
        for (int i =0 ; i< text.length() ;i++){
            if ( t[i] != ' '){
                b[i] = charmap.get(t[i]);
            }else {
                b[i] = t[i];
            }
        }

        System.out.println(new String(b));
    }

}
