package queues;
import java.util.Stack;
public class SuccessivePairs {

    public static boolean result(Stack in) {
        while (!(in.empty())) {
            int num1 = (Integer) in.pop();
            int num2 = (Integer) in.pop();
            if (num2 - num1 == 1 || num1-num2==1) {
            }else{
                System.out.println("no successive pairs in stack");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Stack<Integer> input= new Stack<Integer>();

        input.push(4);
        input.push(7);
        input.push(-2);
        input.push(-3);
        input.push(11);
        input.push(10);
        System.out.println(result(input));
    }
}
