package DSA.S13;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(5);
        myBST.insert(2);

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value);
    }
}
