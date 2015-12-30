package UVA.UVA10189;

import java.util.Scanner;

/**
 * Created by vishal on 12/6/15.
 */
public class Main {

    public  static  void  main(String[] args){

        int[][] dir = {{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1},{-1,0}};
        Scanner in = new Scanner (System.in);
        while ( true ){
            Integer a = in.nextInt();
            Integer b = in.nextInt();

            if ( a == 0 && b == 0 )
                break;

            int [][] mine = new int[a][b];

            for ( int i = 0 ; i < a ; i++ ) {
                for ( int j = 0 ; j < b ; j++ ) {
                    int k = in.nextInt();  //in.next().charAt(0);
                    if ( k == '.'){
                        mine[i][j] = 0;
                    }else {
                        mine[i][j] = k;
                    }
                }
            }


            for ( int i = 0 ; i < a ; i++ ) {
                for ( int j = 0 ; j < b ; j++ ) {

                    if ( mine[i][j] != '*' ){
                        if ( i == 0 && j == 0 ) {
                            if ( mine[i+1][j] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i][j+1] == '*')
                                mine[i][j] ++;
                        }
                        else if ( i == 0 && j == b-1) {
                            if ( mine[i][j-1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j-1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j] == '*')
                                mine[i][j] ++;

                        }else if ( i == a-1 && j == b-1 ){
                            if ( mine[i-1][j] == '*')
                                mine[i][j]++;
                            if ( mine[i-1][j-1] == '*')
                                mine[i][j]++;
                            if ( mine[i][j-1] == '*')
                                mine[i][j] ++;
                        }else if ( i == a-1 && j == 0 ){
                            if ( mine[i-1][j] == '*')
                                mine[i][j]++;
                            if ( mine[i-1][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i][j+1] == '*')
                                mine[i][j] ++;
                        }
                        else if ( (j != 0 && j != b-1) && i == 0 ){
                            if ( mine[i][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j] == '*')
                                mine[i][j] ++;
                            if ( mine[i-1][j+1] == '*')
                                mine[i][j] ++;
                            if ( mine[i][j-1] == '*')
                                mine[i][j] ++;
                        }
                        else if ( j == 0 && (i != 0 && i!= a-1 )){
                            if ( mine[i-1][j] == '*')
                                mine[i][j] ++;
                            if ( mine[i-1][j+1] == '*')
                                mine[i][j] ++;
                            if ( mine[i][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j+1] == '*')
                                mine[i][j]++;
                            if ( mine[i+1][j] == '*')
                                mine[i][j] ++;
                        }

                        else if ( (j != 0 && j != b-1) && i == a-1 ){
                            if ( mine[i][j-1] == '*')
                                mine[i][j]++;
                            if ( mine[i-1][j-1] == '*')
                                mine[i][j]++;
                            if ( mine[i-1][j] == '*')
                                mine[i][j] ++;
                            if ( mine[i+1][j+1] == '*')
                                mine[i][j] ++;
                            if ( mine[i][j+1] == '*')
                                mine[i][j] ++;
                        }
                        else if ( j == b-1 && (i != 0 && i!= a-1 )) {
                            if (mine[i - 1][j] == '*')
                                mine[i][j]++;
                            if (mine[i - 1][j - 1] == '*')
                                mine[i][j]++;
                            if (mine[i][j - 1] == '*')
                                mine[i][j]++;
                            if (mine[i + 1][j - 1] == '*')
                                mine[i][j]++;
                            if (mine[i + 1][j] == '*')
                                mine[i][j]++;
                        }else {
                            if (mine[i - 1][j] == '*')
                                mine[i][j]++;
                            if (mine[i - 1][j + 1] == '*')
                                mine[i][j]++;
                            if (mine[i][j + 1] == '*')
                                mine[i][j]++;
                            if (mine[i + 1][j + 1] == '*')
                                mine[i][j]++;
                            if (mine[i + 1][j] == '*')
                                mine[i][j]++;
                            if (mine[i - 1][j+1] == '*')
                                mine[i][j]++;
                            if (mine[i][j - 1] == '*')
                                mine[i][j]++;
                            if (mine[i-1][j - 1] == '*')
                                mine[i][j]++;
                        }
                    }
                }
            }

        }

    }

}
