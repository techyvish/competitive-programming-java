package UVA.UVA10055;
import java.util.Scanner;

/**
 * Created by vishal on 11/29/15.
 */
class Main {
    public  static  void main(String[] args){
        long hn,mn;
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            hn=s.nextLong();
            mn=s.nextLong();

            if( hn<mn )
                System.out.println(""+(mn-hn));
            else
                System.out.println(""+(hn-mn));
        }
    }
}
