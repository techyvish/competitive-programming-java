import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by vishal on 11/28/15.
 */
public class Exceptions {

    public static void main (String[] args){

        File file = new File("test.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
