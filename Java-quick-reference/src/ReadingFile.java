import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by vishal on 11/28/15.
 */
public class ReadingFile {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("example.txt");
        Scanner in= new Scanner(file);

        int value = in.nextInt(); // Does not scan  nextline character.
        System.out.println(value);

        in.nextLine(); // scans nextline character

        while ( in.hasNextLine() ) {

            String line = in.nextLine(); // scans nextline character.
            System.out.println(line);

        }

        in.close();

    }

}

