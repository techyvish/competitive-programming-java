
public class  Array {

    public  static void  main( String[] args) {

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

    }

}