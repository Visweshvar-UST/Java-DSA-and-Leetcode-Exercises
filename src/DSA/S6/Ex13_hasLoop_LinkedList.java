package DSA.S6;

public class Ex13_hasLoop_LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex13_hasLoop_LinkedList(int value) {
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
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Floyd's cycle-finding algorithm (also known as the "tortoise and the hare" algorithm
    // if the loop starts form the second node means that single iteration wont work.!!!
    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
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
    /*
    // own
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (n<0 || head == null) return null;
            ListNode slow = head;
            ListNode pre = null;
            ListNode fast = head;
            for(int i = 0; i < n; i++){
                if(fast == null) return null;
                fast = fast.next;
            }
            while(fast != null){
                pre = slow;
                slow = slow.next;
                fast = fast.next;
            }
            if(pre == null) {
                head = head.next;
                return head;
            }
            if(slow.next == null) {
                pre.next = null;
            } else {
                pre.next = slow.next;
                slow.next = null;
            }
            return head;
        }
    */

}

