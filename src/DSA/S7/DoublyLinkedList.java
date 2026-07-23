package DSA.S7;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.prev;
            temp.prev = null;
            tail.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2){
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            for (int i = length-1; i > index; i--) {
                temp = temp.next;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insertOwn(int index, int value){
        if (index < 0 || index >= length) return false;
        if(index == 0) {
            prepend(value);
        } else if (index == length-1) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;
        }
        length++;
        return true;
    }


    public Node removeOwn(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            length--;
            return removeFirst();
        }
        else if (index == length-1) {
            length--;
            return removeLast();
        }
        Node pre = get(index-1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next.prev = pre;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            length--;
            return removeFirst();
        }
        else if (index == length-1) {
            length--;
            return removeLast();
        }
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

}
