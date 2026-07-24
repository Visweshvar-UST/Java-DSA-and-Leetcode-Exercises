package DSA.S9;

public class Ex29_isPalindrome_DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public Ex29_isPalindrome_DoublyLinkedList(int value) {
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
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    
    public void append (int value) {
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

	// WRITE ISPALINDROME METHOD HERE //
	//                                //
	//                                //
	//                                //
	//                                //
	////////////////////////////////////
	public boolean isPalindromeOwn(){
	    if (head == tail) return true;
	    Node h = head;
	    Node t = tail;
	    for (int i = 0; i < length-1; i++){
	        if(h.value != t.value) return false;
	        h = h.next;
	        t = t.prev;
	    }
	    return true;
	}

    public boolean isPalindrome() {
        if (length <= 1) return true;

        Node forwardNode = head;
        Node backwardNode = tail;
        for (int i = 0; i < length / 2; i++) {
            if (forwardNode.value != backwardNode.value) return false;
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        return true;
    }

//    not same but challenging- not DoublyLinkedList only string
//    https://leetcode.com/problems/valid-palindrome/description/
    class Solution {
        public boolean isPalindrome(String s) {
            String text = s.replaceAll("[^a-zA-Z0-9]","");
            text = text.toLowerCase();
            for(int i = 0; i < text.length()/2 ; i++) {
                if(text.charAt(i) != text.charAt(text.length()-1-i)) return false;
            }
            return true;
        }
    }
}

