import java.util.Scanner;

/**
 * Created by vishal on 6/24/15.
 */
public class UVA531 {

    public  static void main(String[] args)
    {
        String p;
        String q;

        Scanner reader = new Scanner(System.in);

        String b = reader.nextLine();
        p = b;
        while ( true )
        {
            b = reader.nextLine();
            if (b.equals("#")) break;
            p += b;
        }

        b = reader.nextLine();
        q = b;
        while ( true )
        {
            b = reader.nextLine();
            if (b.equals("#")) break;
            q += b;
        }



    }
}
