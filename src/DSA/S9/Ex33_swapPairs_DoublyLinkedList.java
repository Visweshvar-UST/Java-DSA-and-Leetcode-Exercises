package DSA.S9;

public class Ex33_swapPairs_DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex33_swapPairs_DoublyLinkedList(int value) {
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

    // WRITE THE SWAPPAIRS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    /// own impl
    public void swapPairsOwn(){
        if(head == null || head.next == null) return;
        Node d = new Node(0);
        d.next = head;
        
        Node pre = d;
        Node cur = head;
        
        while(cur != null && cur.next != null){
            Node move = cur.next;
            
            cur.next = move.next;
            if(move.next != null)
            move.next.prev = cur;
            
            pre.next = move;
            move.prev = pre;
            move.next =cur;
            cur.prev = move;
            
            pre = cur;
            cur = cur.next;
        }
        
        head = d.next;
        head.prev = null;
    }


}

