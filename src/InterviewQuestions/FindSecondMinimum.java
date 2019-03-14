package InterviewQuestions;

public class FindSecondMinimum {

    static int findSecondMin(int[] a){
        int min=Integer.MAX_VALUE,secMin=Integer.MAX_VALUE;
        for(int curr:a){
            if(curr<min){
                secMin=min;
                min=curr;
            }else if(curr<secMin){
                secMin=curr;
            }

        }
        return secMin;
    }

    public static void main(String[] args){
        int[] a={3,2,-1,-4,5};
        System.out.println(findSecondMin(a));
    }
}
