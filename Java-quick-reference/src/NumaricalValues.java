import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Created by vishal on 11/22/15.
 */
public class NumaricalValues {

    public static void main(String[] args){

        // premitive type

        byte byteValue = 20 ;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 234234;

        float floatValue = 23432.4f;
        double doubleValue = 32.4;

        // non-premitive type.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        intValue = (int)longValue;

    }
}
