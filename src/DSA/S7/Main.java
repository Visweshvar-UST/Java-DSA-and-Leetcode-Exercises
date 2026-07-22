package DSA.S7;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);

        System.out.println(myDoublyLinkedList.getHead().value);
        System.out.println(myDoublyLinkedList.getTail().value);
        System.out.println(myDoublyLinkedList.getLength());

        myDoublyLinkedList.append(6);
        System.out.println(myDoublyLinkedList.removeLast().value);
        myDoublyLinkedList.prepend(6);
        System.out.println(myDoublyLinkedList.removeFirst().value);

        System.out.println(myDoublyLinkedList.get(0).value);
        System.out.println(myDoublyLinkedList.get(1));

        System.out.println();

        myDoublyLinkedList.printList();

    }

}
