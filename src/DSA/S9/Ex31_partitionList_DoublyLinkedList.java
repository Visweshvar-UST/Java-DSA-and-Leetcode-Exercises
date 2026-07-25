package DSA.S9;

public class Ex31_partitionList_DoublyLinkedList {

    private Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex31_partitionList_DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }
    
    public void makeEmpty() {
        head = null;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void partitionList(int x) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Partitions a doubly linked list around a value  |
        //   |   `x`.                                            |
        //   | - Nodes with values less than `x` come before     |
        //   |   nodes with values greater than or equal to `x`. |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two dummy nodes to build two sublists:     |
        //   |   one for < x, one for >= x.                      |
        //   | - Traverses the list, linking nodes to the        |
        //   |   appropriate sublist and updating prev pointers. |
        //   | - Joins the two sublists together.                |
        //   | - Updates the head and resets head.prev to null.  |
        //   +===================================================+
        if(head == null || head.next == null) return;
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node p1 = d1;
        Node p2 = d2;
        Node cur = head;
        while(cur != null){
            if(cur.value < x) {
                p1.next = cur;
                cur.prev = p1;
                p1 = cur;
            } else {
                p2.next = cur;
                cur.prev = p2;
                p2 = cur;
            }
            System.out.println(cur.value+" "+p1.value+" "+p2.value);
            cur = cur.next;
        }
        
        p1.next = d2.next;
        if(d2.next != null) d2.next.prev = p1;
        p2.next = null;
        
        head = d1.next;
        head.prev = null;
    }
    
}


