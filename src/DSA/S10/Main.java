package DSA.S10;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();

        myStack.push(5);

        myStack.printStack();

        System.out.println(myStack.pop().value);

        System.out.println("****QUEUE****");

        Queue myQueue = new Queue(7);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        myQueue.enQueue(8);

        myQueue.printQueue();

        myQueue.deQueue();

        myQueue.printQueue();
    }
}
