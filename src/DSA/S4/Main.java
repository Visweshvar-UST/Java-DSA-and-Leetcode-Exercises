package DSA.S4;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(5);

        ll.getHead();
        ll.getTail();
        ll.getLength();

        ll.printList();

        ll.append(4);

        System.out.println(ll.removeLast().value);
        System.out.println(ll.removeLast().value);
        System.out.println(ll.removeLast());

        ll.append(7);
        ll.append(8);

        ll.printList();

        System.out.println(ll.removeFirst().value);
        System.out.println(ll.removeFirst().value);
        System.out.println(ll.removeFirst());


        ll.append(5);
        ll.append(6);

        System.out.println(ll.get(1).value);
    }

}
