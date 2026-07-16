package DSA.S6;

public class Ex16_binaryToDecimal_LinkedList {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex16_binaryToDecimal_LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
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
        }
    }

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+
    // 2+2+2+4+2
    public int binaryToDecimalOwn(){
        if(head == null) return 0;
        if(head.next == null) return head.value == 1? 1 : 0; 
        int dec = 0;
        int n = 0;
        Node curr = head;
        while(curr.next != null){
            if(curr.value == 1) dec+=2*++n;
            else dec += 2*n;
            System.out.println(curr.value+":"+dec);
            curr = curr.next;
        }
        if(curr.value == 1) dec+=3;
        else dec+=2;
        return dec;
    }
    
    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+
    // with teh logic from video

    // 1111-> 15
    // 8421
    public int binaryToDecimal(){
        // if(head == null) return 0;
        int tot = 0;
        Node curr = head;
        while(curr != null){
            if(curr.value == 1) tot = tot*2 + 1;
            else tot *=2;
            curr = curr.next;
        }
        return tot;
    }

    // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
    // solution from course
    // 1 1 1 1
    // 8 4 2 1
    public int binaryToDecimalActual() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }

}


