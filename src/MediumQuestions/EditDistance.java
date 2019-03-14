package MediumQuestions;
import java.util.*;
public class EditDistance {

    static int edit(String A,String B){
        int[][] dp= new int[A.length()+1][B.length()+1];
        int m=dp.length,n=dp[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }

            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        String a="kitten";
        String b="sitting";
        System.out.println(edit(a,b));

    }
}
