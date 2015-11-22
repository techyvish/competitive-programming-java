/**
 * Created by vishal on 11/22/15.
 */
import com.oceangame.*;
import ocean.*;
import ocean.Fish;
import ocean.Plant.OcenTree;
import ocean.Plant.Seaweed;


class Macho implements Info {

    @Override
    public void showInfo() {
        System.out.println("Macho");
    }
}

class  Seko implements Info {

    public  void test(){

    }
    @Override
    public void showInfo() {
        System.out.println("Seko");
    }
}

interface  Info {
    public void showInfo();
}

public class Interfaces {

    public static void main(String[] args){

        Fish fish = new Fish();
        Seaweed sw = new Seaweed();
        OcenTree ot = new OcenTree();

        com.oceangame.Fish of= new com.oceangame.Fish();

        // class can extend only one class
        // but can implement many interfaces.

        Info info = new Macho();
        Info info2 = new Seko();
        info.showInfo(); // only one mehtod accessibly
        // info.test() not accessible.
    }
}
