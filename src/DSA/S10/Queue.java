package DSA.S10;

public class Queue {
    public Node first;
    public Node last;
    public int length;
    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst() {
        System.out.println("first: "+first.value);
    }

    public void getLast() {
        System.out.println("last: "+last.value);
    }

    public void getLength() {
        System.out.println("length: "+ length);
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
