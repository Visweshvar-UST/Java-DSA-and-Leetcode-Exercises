package DSA.S6;


import java.util.HashSet;

public class Ex15_removeDuplicates_LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex15_removeDuplicates_LinkedList(int value) {
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
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
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

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    // own passed in one run
    public void removeDuplicatesOwn() {
        // if(head == null || head.next == null) return;
        Node curr = head;
        Node run = head;
        while(curr != null){
            while(run.next != null){
                if(run.next.value == curr.value) {
                    run.next = run.next.next;
                    length--; // i have missed
                    continue;
                }
                run = run.next;
            }
            curr = curr.next;
            run = curr;
        }
    }

    // slight difference
    public void removeDuplicatesGiven() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void removeDuplicates() {
        // if(head == null || head.next == null) return;
        HashSet<Integer> values = new HashSet<>();
        Node pre = null;
        Node curr = head;
        while(curr != null){
            if(values.contains(curr.value)) {
                pre.next = curr.next;
                length--;
            } else {
                values.add(curr.value);
                pre = curr;
            }
            curr = curr.next;
        }
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
//    Problem: same
//    // Own solution
//    class Solution {
//        public ListNode deleteDuplicates(ListNode head) {
//            if(head == null || head.next == null) return head; // forget about edge case
//            ListNode curr = head;
//            while(curr.next != null){
//                if(curr.val == curr.next.val) {
//                    curr.next = curr.next.next;
//                    continue;
//                }
//                curr = curr.next;
//            }
//            return head;
//        }
//    }

}

