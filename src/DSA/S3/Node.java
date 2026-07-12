package DSA.S3;

public class Node {
    private int Value;
    private Node next;

    public Node(int value) {
        Value = value;
    }

    public Node(int value, Node next) {
        Value = value;
        this.next = next;
    }
}
