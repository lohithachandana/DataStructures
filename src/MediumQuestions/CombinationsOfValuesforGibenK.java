package MediumQuestions;

public class CombinationsOfValuesforGibenK {
    static void printCombinations(int num){
        int[] a=new int[num];
        findComb(a,num,0);
    }
    static void findComb(int[] a,int num,int index){
        if(num==0){
            for(int i=0;i<index;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
        if(num<0){
            return;
        }

        for(int i=1;i<=num;i++){
            a[index]=i;
            findComb(a,num-a[index],index+1);
        }
    }

    public static void main(String[] args){
        int steps=3;
        printCombinations(steps);
    }
}
