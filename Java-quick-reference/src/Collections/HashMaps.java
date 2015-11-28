package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vishal on 11/28/15.
 */

class Temp {

}

public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");

        String text = map.get(5);

        // Iterating through map.
        // Ieraating through all vales.

        // Hash map does not maintain order.
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
        }


        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        // Sorted maps.
        LinkedHashMap<Integer,String > linkedHashMap = new LinkedHashMap<Integer,String>(); // doubly inked list
        TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>(); // tree
        System.out.println(new Temp()); // Prints hash code.

        testMap(hashMap); // order not garunteed
        testMap(treeMap); // natural order
        testMap(linkedHashMap); // order in which you entered

    }

    public static void testMap( Map<Integer,String> map) {

        map.put(9,"fox");
        map.put(4,"Cat");
        map.put(8,"Dog");
        map.put(1,"giragffe");
        map.put(0,"swan");
        map.put(15,"bear");
        map.put(6,"snake");

        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key +" : " + value);
        }

        System.out.println("\n");


    }

}
