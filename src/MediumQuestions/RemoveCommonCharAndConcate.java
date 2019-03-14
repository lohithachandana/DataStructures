package MediumQuestions;

public class RemoveCommonCharAndConcate {

static String removeAndConc(String a,String b){

    StringBuilder sb1=new StringBuilder(a);
    StringBuilder sb2=new StringBuilder(b);
    int n=sb2.length();int index=-1;
    for(int i=0;i<n;i++){
        char curr=sb2.charAt(i);
        String tmp=Character.toString(curr);
         if(sb1.indexOf(tmp)!=-1){
             System.out.println(curr+" : is curr");
             while(true){
                 index=sb1.indexOf(tmp);
                 if(index==-1){
                     break;
                 }
                 sb1.deleteCharAt(index);
             }
             while(true){
                 index=sb2.indexOf(tmp);
                 if(index==-1){
                     break;
                 }
                 sb2.deleteCharAt(index);
             }
         }
         n=sb2.length();
    }
    return sb1.append(sb2).toString();
}
    public static void main(String[] args){
        String a="abcs",b="cxzca";
        //int n=a.length()<b.length()?a.length():b.length();
       // String out=a.length()>b.length()?removeAndConc(a,b):removeAndConc(b,a);
        String out=removeAndConc(a,b);
        System.out.println(out);
    }
}
