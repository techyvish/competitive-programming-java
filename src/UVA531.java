import java.util.Scanner;
import java.io.*;

/**
 * Created by vishal on 6/24/15.
 */
public class UVA531 {

    public  static void main(String[] args)
    {
        FileReader in;

        String p = "";
        String q = "";
        String b;

        try {

            //in = new FileReader("UVA531.txt");
            Scanner reader = new Scanner(System.in);

            while ( !(b = reader.nextLine()).equals("#") ) {
                p += b;
            }

            while ( !(b = reader.nextLine()).equals("#") ) {
                q += b;
            }

        }catch (Exception e){

        }
    }
}
