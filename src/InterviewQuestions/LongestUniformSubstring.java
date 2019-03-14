package InterviewQuestions;

public class LongestUniformSubstring {
    static void find(String s){
        int start=0,end=1,max=0,index=-1;

        if(s.length()==1){
            index=0;max=1;
        }
        while(end<s.length()){
            if(s.charAt(end)==s.charAt(start)){
                end++;
            }else{
                int len=end-start;
                if(len>max){
                    max=len;index=start;
                }
                start=end;end++;
            }
        }
        if(end-1<s.length()&& s.charAt(end-1)==s.charAt(start)){
            int len=end-start;
            if(len>max){
                max=len;index=start;
            }
        }
        System.out.println(index+" "+max);
    }


    public static void main(String[] args){
         String s="A";
         find(s);

    }
}
