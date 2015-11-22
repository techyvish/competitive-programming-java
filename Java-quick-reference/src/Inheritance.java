/**
 * Created by vishal on 11/22/15.
 */

class Machine1  {

    private String name = "Machine type" ; // can only be accesed in this class;
    protected  String nickname = "Macho"; // can be accessed anywhere in the package, any child class.

    public void start() {
        System.out.println("machine started");
    }

    public void stop() {
        System.out.println("machine stopped");
    }
}

class Car extends  Machine1{

    public void wipeWindSheild(){

    }

    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");
    }
}

public class Inheritance {

    public static void main(String[] arg){

        // final class can't be extended

        Machine1 mach1 = new Machine1();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start();
        car1.stop();

    }
}
