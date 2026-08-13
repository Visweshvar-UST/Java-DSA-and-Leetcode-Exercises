package DSA.S10;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();

        myStack.push(5);

        myStack.printStack();
    }
}
