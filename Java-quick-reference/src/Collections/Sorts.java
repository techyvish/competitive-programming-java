package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vishal on 11/28/15.
 */

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length() )
            return 1;
        else if (o1.length() < o2.length() )
            return  -1;
        else
            return 0;
    }
}


class AlphabaticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return  o1.compareTo(o2);
    }
}


class ReverseAlphabaticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return  -o1.compareTo(o2);
    }
}

public class Sorts {

    public static void main(String[] args){

        List<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Sanke");
        animals.add("Monkey");
        animals.add("Chi-chi");

        //Collections.sort(animals, new StringLengthComparator());
        //Collections.sort(animals, new AlphabaticalComparator());
        Collections.sort(animals, new ReverseAlphabaticalComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(36);
        numbers.add(74);
        numbers.add(40);

        Collections.sort(numbers, new Comparator<Integer>() { // Using anonymous class
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        for (int number: numbers){
            System.out.println(number);
        }

    }
}
