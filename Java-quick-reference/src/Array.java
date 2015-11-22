class  Person {

    private String name;
    private int age;

    void  speak() {
        System.out.println("Hello");
    }

    // getter
    int getAge(){
        return  this.age;
    }

    // setter
    void setAge(int age) {
        this.age= age;
    }
}

class  Machine {

    private  String name;

    // constructor
    public  Machine(){
        this("z");
        System.out.println("Constructor runnning !!");
    }

    // constructor
    public  Machine(String name){
        this.name = name;
    }

    void setName(String aName){
        this.name = aName;
    }

}

class Thing {

    public  String name;
    public  static String description;

    public static void showInfo() {

    }

    //constant
    public final int LUCKY_NUMBER = 7;

}
public class  Array {

    public static void main( String[] args) {

        int value = 8;
        int[] values = new int[10];

        String[] stringvalues = new String[5];
        stringvalues[0] = "Test1";
        stringvalues[1] = "Test2";
        stringvalues[2] = "Test3";
        stringvalues[3] = "Test4";

        for ( int i = 0 ; i < stringvalues.length ; i++ ){
            System.out.println(stringvalues[i] +",");
        }

        int[] numbers = {5,6,7};

        for ( int i = 0 ; i < numbers.length ; i++) {
            System.out.println( numbers[i] );
        }

        String[] fruits = { "apple", "bannana", "peer", "kiwi"};


        for (String fruit: fruits ){
            System.out.println(fruit);
        }

        String text  =null;
        System.out.println(text);

        String[] texts = new String[2];
        System.out.println(texts[0]);
        System.out.println(texts[1]);

        // multidimentional array

        int [][] grid = new int[2][20];

        Person person1 = new Person();
        // cant't access
        //person1.age = 20;
        //person1.name = "ABC";

        Machine m = new Machine();
        m.setName("Arnie");


        Machine m2 = new Machine("Arnie2");

        Thing aThing = new Thing();
        
    }

}