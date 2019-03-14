package Practice;
import java.util.*;
public class ArrayGames {

          /*  while(true){


                if(i == n-1 || i+leap >= n){
                    return true;
                }

                if(game[i+leap]==0){
                    game[i]=1;
                    //prevleap=i;
                    i=i+leap;
                    //movedback=false;
                } else if( game[i+1]==0){
                    game[i]=1;
                    i=i+1;
                }else if(i-1 >=0 && game[i-1]==0){
                    game[i]=1;
                        i=i-1;
                       // movedback=true;
                }else{
                        return false;
                    }
                *//*if(i==0 || i==prevleap) {
                        return false;
                    }*//*

            }

            //return false;
            // Return true if you can win the game; otherwise, return false.
        }*/
            static boolean isSolved(int leap,int[] game,int i){
                int n=game.length;
                if(i<0 || game[i]==1){
                    return false;
                }
                if(i==n-1 || i+leap>=n){
                    return true;
                }
                game[i]=1;
                return isSolved(leap,game,i+1) || isSolved(leap,game,i-1) || isSolved(leap,game,i+leap);
            }

            public static boolean canWin(int leap, int[] game) {
                int i=0;
                return isSolved(leap,game,i);


                // Return true if you can win the game; otherwise, return false.
            }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
           // for (int j=1; j<=q; j++) {
             while(q-- >0){
                int n = scan.nextInt();
                int leap = scan.nextInt();
                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                    /*if(q==1 && i==n-1){
                        System.out.println("");
                    }*/
                }
                 System.out.println("for: "+ n);
                System.out.println((canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
           // System.out.println(Arrays.toString(source[0])); // to print an 1D array
        }
    }

   /* int[][] source = {
            {1, 2, 3, 4},
            {5, 6},
            {0, 2, 42, -4, 5}
    };*/
// System.out.println(Arrays.toString(source[0])); // to print an 1D array
 //System.out.println(Arrays.deepToString(source));to print a miltiD Array
