package MediumQuestions;

public class MaxProductArray {
    static int findMaxProduct(int[] a){
        int currmax=1,currmin=1,max=Integer.MIN_VALUE;
        for(int i:a){
            if(i>0){
                currmax=Math.max(currmax*i,i);
                currmin=Math.min(currmin*i,i);
            }else if(i==0){
                currmax=0;currmin=0;
            }else{
                int tmp=currmax;
                currmax=Math.max(currmin*i,i);
                currmin=Math.min(tmp*i,i);
            }
            max=Math.max(max,currmax);
        }
        return max;
    }

    public static void main(String[] args){
        int[] a={0,2,-1,-4,-6};
        System.out.println(findMaxProduct(a));
    }
}
