import java.util.Scanner;
import java.io.*;

class Main {
    public static void main (String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner  = new Scanner(new FileReader(args[0]));
        while ( scanner.hasNext() )
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println( Math.abs(a-b));
        }
    }
}
