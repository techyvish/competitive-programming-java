package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

/**
 * Created by vishal on 11/28/15.
 */
public class LinkedLists {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // if you want to add or remove items from end of your list user arraylist
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // if you want to add or remove items from anywhere in your list user linkedlist.

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list){

        for ( int i = 0 ; i < 1E5; i++ ){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        /* add end of the list
        for ( int i = 0 ; i < 1E5 ; i++ ){
            list.add(i);
        } */

        for ( int i = 0 ; i < 1E5 ; i++ ){
            list.add(list.size(),i);
        }

        long end = System.currentTimeMillis();
        System.out.println(type + " : " + (end-start) + " ms");
    }
}
