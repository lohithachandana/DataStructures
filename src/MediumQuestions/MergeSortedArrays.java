package MediumQuestions;

public class MergeSortedArrays {

    static int[] merge(int[] out,int[] a,int[] b){
        int index=0;
        int n1=a.length,n2=b.length;
        int i=0,j=0;
        while(i<n1&&j<n2){
            out[index]=Math.min(a[i],b[j]);
            if(a[i]>b[j])
                j++;
            else
                i++;
            index++;
        }

        while(i<n1){
            out[index]=a[i];
            i++;index++;
        }
        while (j<n2){
            out[index]=b[j];
            j++;index++;
        }
        return out;
    }


    public static void main(String[] args){
        int[] a1={3, 4, 6, 10, 11, 15};
        int[] a2={1, 5, 8, 12, 14, 19};
        int[] out=new int[a1.length+a2.length];
        out=merge(out,a1,a2);
        for (int i:out){
            System.out.println(i);
        }
    }
}
