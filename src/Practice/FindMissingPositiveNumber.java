package Practice;

public class FindMissingPositiveNumber {
    static int findMissingNum(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                j++;
            }
        }
        //System.out.println("j is "+j);
        for(int i=j;i<a.length;i++){
            if(a[Math.abs(a[i]) - 1+j]>0) {
                a[Math.abs(a[i]) - 1+j] = - a[Math.abs(a[i]) - 1+j];
            }

        }
        for(int i=j;i<a.length;i++) {
            if(a[i]>0){
                return i+1-j;
            }
        }


        return a.length+1;
    }
    public static void main(String[] args){
        int[] num={1, 1, 0, -1, -2};
        System.out.println(findMissingNum(num));
    }
}
