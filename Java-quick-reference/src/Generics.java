import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by vishal on 11/22/15.
 */


class Machine2 {

    @Override
    public String toString() {
        return super.toString();
    }
}

class Camera extends Machine2 {

}

public class Generics {

    public static void mina(String[] args){

        // old style
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Bananna");
        list.add("Orange");

        String fruit = (String) list.get(1);

        /////////////////////// new type ///////////////////////////

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("kiwi");
        fruits.add("Pairs");

        System.out.println(fruits.get(1));

        HashMap<Integer,String> hashmanp  = new HashMap<Integer,String>();

        ArrayList<Integer> somelist = new  ArrayList<Integer>();


        ArrayList<Machine2> machines = new ArrayList<Machine2>();
        for (Machine2 mach : machines ){
            System.out.println(mach);
        }
    }


    public static void showList(ArrayList<?> machines){ // print any type of list - wildcard
        for (Object mach : machines ){
            System.out.println(mach);
        }
    }

    public static void showList2(ArrayList<? extends Machine> machines){ // print any type and subtypes of list - wildcard upperbound
        for (Object mach : machines ){
            System.out.println(mach);
        }
    }

    public static void showList3(ArrayList<? super Camera> machines){ // print any type and super types of list - wildcard lowerbound
        for (Object mach : machines ){
            System.out.println(mach);
        }
    }

}
