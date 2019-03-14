package InterviewQuestions;

public class ArmstrongNumber {


    static boolean isArms(int num){
        int sum=0;
        int n=num;
        while(n!=0){
            int last=n%10;
            n=n/10;
            sum=sum+(last*last*last);
            System.out.println("sum "+sum);
            System.out.println("n "+n);
            System.out.println("last "+last);
        }
        if(sum==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int k=121;
        if(isArms(k)){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
