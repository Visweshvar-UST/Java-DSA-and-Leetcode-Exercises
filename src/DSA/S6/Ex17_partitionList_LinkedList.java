package DSA.S6;

public class Ex17_partitionList_LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex17_partitionList_LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
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
        length = 0;
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
        length++;
    }

    // WRITE THE PARTITIONLIST METHOD HERE // 
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    // by video logic
    public void partitionListOwn(int x){
        if(head == null || head.next == null) return;
        Node n1 = new Node(0);
        Node n2 = new Node(0);
        Node d1 = n1;
        Node p1 = n1;
        Node d2 = n2;
        Node p2 = n2;
        Node curr = head;
        while(curr != null){
            if(curr.value < x) {
                p1.next = curr;
                p1 = curr;
            }
            else {
                p2.next = curr;
                p2 = curr;
            }
            curr = curr.next;
        }
        p1.next = d2.next;
        p2.next = null;
        head = d1.next;
    }
    
    // course solution
        public void partitionList(int x) {
        if (head == null) return;
 
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
 
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
 
        prev2.next = null;
        prev1.next = dummy2.next;
 
        head = dummy1.next;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    http://leetcode.com/problems/partition-list/
//    class Solution {
//        public ListNode partition(ListNode head, int x) {
//            if(head == null) return null;
//            ListNode d1 = new ListNode(0);
//            ListNode p1 = d1;
//            ListNode d2 = new ListNode(0);
//            ListNode p2 = d2;
//            ListNode curr = head;
//            while(curr != null){
//                if(curr.val < x){
//                    p1.next = curr;
//                    p1 = curr;
//                } else {
//                    p2.next = curr;
//                    p2 = curr;
//                }
//                curr = curr.next;
//            }
//            p1.next = d2.next;
//            p2.next = null;
//            head = d1.next;
//            return head;
//        }
//    }
}

