package DSA.S6;

public class Ex19_swapPairs_LinkedList {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex19_swapPairs_LinkedList(int value) {
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
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void swapPairsOwn() {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Swaps every two adjacent nodes in the linked    |
        //   |   list.                                           |
        //   | - The method modifies the list in place.          |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node is used to simplify swapping the   |
        //   |   first pair.                                     |
        //   | - In each iteration, two nodes (`first` and       |
        //   |   `second`) are swapped by adjusting pointers.    |
        //   | - The `previous` pointer helps reconnect the      |
        //   |   swapped pairs to the rest of the list.          |
        //   | - The `first` pointer then moves forward two      |
        //   |   nodes at a time.                                |
        //   | - At the end, `head` is updated to point to the   |
        //   |   new first node.                                 |
        //   +===================================================+
        if(head == null ) return;
        Node d = new Node(0);
        d.next = head;
        Node pre = d;
        Node curr = head;
        Node next = head.next;
        while(curr != null && next != null){
            curr.next = next.next;
            next.next = curr;
            pre.next = next;
            pre = pre.next.next;
            curr = pre.next;
            if(curr != null) next = curr.next;
        }
        head = d.next;
    }

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        Node first = head;

        while (first != null && first.next != null) {
            Node second = first.next;

            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;

            // Move pointers
            previous = first;
            first = first.next;
        }

        head = dummy.next;
    }

//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    https://leetcode.com/problems/swap-nodes-in-pairs/
//    class Solution {
//        public ListNode swapPairs(ListNode head) {
//            ListNode dummy = new ListNode(0);
//            dummy.next = head;
//            ListNode pre = dummy;
//            ListNode first = head;
//            while(first != null && first.next != null){
//                ListNode second = first.next;
//                first.next = second.next;
//                second.next = first;
//                pre.next = second;
//                pre = first;
//                first = pre.next;
//            }
//            return dummy.next;
//        }
//    }
}
