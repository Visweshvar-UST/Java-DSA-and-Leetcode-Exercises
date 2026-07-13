package DSA.S6;

public class Ex14_findKthFromEnd_LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex14_findKthFromEnd_LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // public Node findKthFromEndOwn(int k) {
    //     //   +===================================================+
    //     //   |               WRITE YOUR CODE HERE                |
    //     //   | Description:                                      |
    //     //   | - Finds the k-th node from the end of a singly    |
    //     //   |   linked list.                                    |
    //     //   | - Returns the node at that position or null if    |
    //     //   |   `k` is invalid or exceeds the list length.      |
    //     //   |                                                   |
    //     //   | Behavior:                                         |
    //     //   | - Uses two pointers, `fast` and `slow`, starting  |
    //     //   |   at the head of the list.                        |
    //     //   | - Moves `fast` forward `k` nodes ahead of `slow`. |
    //     //   | - Then moves both pointers together until `fast`  |
    //     //   |   reaches the end.                                |
    //     //   | - At that point, `slow` points to the k-th node   |
    //     //   |   from the end and is returned.                   |
    //     //   +===================================================+
    //     if (k < 0) return null;
    //     Node slow = head;
    //     Node fast = head;
    //     int length = 1;
    //     int point = 1;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         length++;
    //     }
    //     point = length;
    //     if(fast == null) length=length*2;
    //     else if(fast.next == null) length=(length*2)-1;
    //     length = length - k;
    //     if(length < 0) return null;
    //     if(length == 0) return head;
    //     int moves = point - length;
    //     if(moves < 0) {
    //         for(int i = 0; i <= (moves * -1); i++){
    //             slow = slow.next;
    //         }
    //     } else if(moves > 0) {
    //         slow = head;
    //         for(int i = 0; i < moves-1 ; i++){
    //             slow = slow.next;
    //         }
    //     }
    //     return slow;
    // }

    public Node findKthFromEnd(int k) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Finds the k-th node from the end of a singly    |
        //   |   linked list.                                    |
        //   | - Returns the node at that position or null if    |
        //   |   `k` is invalid or exceeds the list length.      |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two pointers, `fast` and `slow`, starting  |
        //   |   at the head of the list.                        |
        //   | - Moves `fast` forward `k` nodes ahead of `slow`. |
        //   | - Then moves both pointers together until `fast`  |
        //   |   reaches the end.                                |
        //   | - At that point, `slow` points to the k-th node   |
        //   |   from the end and is returned.                   |
        //   +===================================================+
        if (k < 0) return null;
        Node slow = head;
        Node fast = head;
        for(int i = 0; i < k; i++){
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}


