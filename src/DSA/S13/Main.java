package DSA.S13;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(5);
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(10);
        myBST.insert(7);
        myBST.insert(8);

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value);
        System.out.println(myBST.contains(7));
        System.out.println(myBST.contains(20));
    }
}
