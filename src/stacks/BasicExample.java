package stacks;

public class BasicExample {
    public static void main(String[] args) {
        MStack myStack = new MStack();
        myStack.push(14);
        myStack.push(12);
        myStack.push(16);
        myStack.push(18);

        for(int i = 0; i< 4; i++) {
            System.out.println(myStack.pop());
        }
    }
}
