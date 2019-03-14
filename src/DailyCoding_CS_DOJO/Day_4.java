package DailyCoding_CS_DOJO;
//findFirstMissingPositive
public class Day_4 {

    static int shiftNegs(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                int tmp=a[j];
                a[j]=a[i];
                a[i]=tmp;
                j++;
            }
        }
        return j;
    }
    static int find(int[] a){
        int newStart=shiftNegs(a);
        int[] arr=new int[a.length-newStart];
        System.arraycopy(a,newStart,arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" cehck value");
            if(Math.abs(arr[i])-1<arr.length && Math.abs(arr[i])-1>=0){
                arr[Math.abs(arr[i])-1]=-Math.abs(arr[Math.abs(arr[i])-1]);
                System.out.println(arr[Math.abs(arr[i])-1]+" check updated value");
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return arr.length+1;
    }


    public static void main(String[] args){
        int[] a={6,8,-1,7};
        System.out.println(find(a));
    }
}
