package MediumQuestions;
import java.io.*;
import java.util.*;
public class GS_YEchGig {

    static int findChars(String s){
        int count=0;
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        int len=s.length();//int mid=len/2;
        int i=0;
        while(i<sb.length()){
            if(s.length()==0|| sb.length()==1){
                break;
            }
            int end=sb.length()-1;

            if(sb.charAt(i)!=sb.charAt(end-i)){
                if(sb.length()==2){
                    count++;
                    break;
                }
                int index=end-i;
                char c=sb.charAt(i);
                sb.insert(end-i,c);count++;
                i=index+1;
            }else{
                sb.deleteCharAt(i);sb.deleteCharAt(end-i-1);
                i=0;
            }

        }

        return count;
    }

   static int findChars(char str[], int n)
    {
        // Create a table of size n*n. table[i][j]
        // will store minumum number of insertions
        // needed to convert str[i..j] to a palindrome.
        int table[][] = new int[n][n];
        int l, h, gap;

        // Fill the table
        for (gap = 1; gap < n; ++gap){
            for (l = 0, h = gap; h < n; ++l, ++h){

                table[l][h] = (str[l] == str[h])?
                        table[l+1][h-1] :
                        (Math.min(table[l][h-1],
                                table[l+1][h]) + 1);

                //break;
            }
        }

        // Return minimum number of insertions
        // for str[0..n-1]
        return table[0][n-1];
    }


    public static void main(String args[] ) throws Exception {
        //Write code here
        Scanner scan= new Scanner(System.in);
        int size=scan.nextInt();
        scan.nextLine();
        String str=scan.nextLine();
        System.out.println(findChars(str.toCharArray(),str.length()));
    }
}
