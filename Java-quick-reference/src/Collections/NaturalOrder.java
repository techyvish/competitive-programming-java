package Collections;

import java.util.*;

/**
 * Created by vishal on 11/28/15.
 */

class Person3 implements Comparable<Person3> {

    private String name ;

    public Person3(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person3 person3 = (Person3) o;
        return !(name != null ? !name.equals(person3.name) : person3.name != null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Person3 person){

        //return this.name.compareTo(arg.name);
        int len1 = this.name.length();
        int len2 = person.name.length();

        if ( len1 > len2 ){
            return 1;
        }
        else if ( len1 < len2 ){
            return -1;
        }
        else {
            return name.compareTo(person.name); // if we return 0 in TreeHashMap this causes a problem because this code treats equal length
            // is equal to same same object. so If we get same length we need to do more digging. It has to match 'equls' method.
        }

    }

}

public class NaturalOrder {

    public static void main(String[] args) {
        List<Person3> list = new ArrayList<Person3>();
        Set<Person3> set = new TreeSet<Person3>();


        addElement(list);
        addElement(set);

        Collections.sort(list);

        showWlements(list);
        System.out.println();
        showWlements(set);
    }


    private static void addElement(Collection<Person3> col) {

        col.add(new Person3("Joe"));
        col.add(new Person3("Sue"));
        col.add(new Person3("Juliet"));
        col.add(new Person3("Clair"));
        col.add(new Person3("Mike"));


    }


    private static void showWlements(Collection<Person3> col) {

        for (Person3 elements : col) {
            System.out.println(elements.toString());
        }
    }
}
