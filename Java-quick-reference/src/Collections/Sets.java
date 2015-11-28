package Collections;

import java.util.*;

/**
 * Created by vishal on 11/28/15.
 */

class Person1 {

    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person1 = (Person1) o;

        if (id != person1.id) return false;
        return !(name != null ? !name.equals(person1.name) : person1.name != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class Sets {

    public static void main(String[] s){

        // HashSet
        Set<String> set1 = new HashSet<String>(); // HashSet does not retain order

        // Linked HashSet
        Set<String> set2 = new LinkedHashSet<String>(); // remembers order you enterd in

        // TreeSet
        Set<String> set3 = new TreeSet<String>(); // sorts in natural order


        printSet(set1);
        printSet(set2);
        printSet(set3);


        Person1 p1 = new Person1(1, "Sue");
        Person1 p2 = new Person1(2, "Box");
        Person1 p3 = new Person1(3, "Mike");
        Person1 p4 = new Person1(1, "Sue");


        Map<Person1,Integer> personHashMap = new HashMap<Person1,Integer>();
        personHashMap.put(p1,1);
        personHashMap.put(p2,2);
        personHashMap.put(p3,3);
        personHashMap.put(p4,1);

        printMap(personHashMap);

    }


    public static void printSet(Set<String> set){
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("snake");
        set.add("bear");
        set.add("mouse");
        set.add("dog");

        for ( String element : set) {
            System.out.println(element);
        }

        if ( !set.contains("Horse") ) {
            System.out.println("No Horse");
        }

        if (set.isEmpty()){

        }
    }

    public static  void printMap(Map<Person1,Integer> map){

        for ( Person1 key : map.keySet() ){
            int value =  map.get(key);

            System.out.println(key.toString() + "  " + value ) ;

        }
    }
}
