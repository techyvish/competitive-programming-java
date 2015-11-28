package Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vishal on 11/28/15.
 */
public class ArrayLists {

    public static void main (String[] args){

        ArrayList<Integer> array = new ArrayList<Integer>(); // can't user premitive type here.

        array.add(10);
        array.add(20);
        array.add(30);

        for ( Integer i : array){
            System.out.println(i);
        }

        array.remove(array.size()-1); // this bit fast.
        array.remove(0); // This is very slow.
        // use linked list for faster removal from top of the list.


        List<String> lists = new ArrayList<String>();

    }
}
