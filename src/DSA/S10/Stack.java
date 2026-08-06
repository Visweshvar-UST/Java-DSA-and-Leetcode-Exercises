package DSA.S10;

public class Stack {
    public Node top;
    public int height;

    class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height++;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: "+top.value);
    }

    public void getHeight() {
        System.out.println("Height: "+height);
    }
}
