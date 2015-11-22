/**
 * Created by vishal on 11/22/15.
 */

class  Frog {


    public String toString(){
        return "Hello";
    }
}

public class StringOperations {

    public static void main(String[] args){


        // Strings are immutable in java. inefficient
        String info = "" ;
        info += "My name is bob"; // new string - reassigning
        info += " "; // new string
        info += "I'm the builder";

        // efficient

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is sue");
        sb.append(" ");
        sb.append("I'm a lion tima");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder("");
        s.append("a").append("b").append("a");


        // Threadsafe version of StringBuilder
        StringBuffer sbuffer = new StringBuffer();


        Frog f = new Frog();
        System.out.println(f);
    }

}
