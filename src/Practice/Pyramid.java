package Practice;

public class Pyramid {
    public static void main(String[] args) {
        int rows = 12;
        int[] x= new int[4];


        //for inverted triangle
        /*for(int i=rows;i>0;i--){
            int k=0;
            while(k!=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }*/
        for(int i = 1; i <= rows; ++i) {
            int k=0;
            for(int space = 1; space <= rows - i; space++) {
                System.out.print("  "); // for mirrar of triangle and for pyrmid

            }

            //while(k != 2 * i - 1){ //for pyramid
            while(k != i){ //for triangle
                System.out.print("* ");
                k++;
            }

            System.out.println();
        }


    }
}
