package InterviewQuestions;

public class SNowflakes {
//Wrong
    public static void main(String[] a){
       // int[] hills={0,1,3,0,1,2,0,4,2,0,3,0};
int[] hills={6,2,3,2,5};int[][] arr1={{1,1,0,1},{0,0,1,2}};
int col=arr1[1].length;int rows=arr1.length;
        System.out.println(rows+col);

        int block=0,k=0,j=0,count=0,last=0,sum=0;
        for(int i=1;i<hills.length;i++){
            if(hills[i]<hills[i-1]){
                block=hills[i-1];
                j=i-1;
                break;
            }
        }
        for( k=j+1;k<hills.length;k++){
            if(hills[k]>=block){
                last=k-1;
                break;
            }
            if(hills[k]< block){
                count++;
            }

        }
        for(int m=j+1;m<last;m++){
            if(hills[m]<block){
                sum=sum+hills[m];
            }

        }
        int snow= count*block-sum;
        System.out.println(snow);

    }
}
