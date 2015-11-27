/**
 * Created by vishal on 11/28/15.
 */


class Machine3 {

    public void start() {
        System.out.println("Machine started");
    }
}

interface Plant{

    public void grow() ;

}

public class AnonymousClasses {

    public static void main (String[] args){

        Machine3 machine3 = new Machine3() { // This is the child class of machine that does not have a name.
            @Override
            public void start() {
                System.out.println("camera snap running....");
            }
        };

        machine3.start();

        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("plant growing..");
            }
        };

        plant.grow();
    }

}
