package DSA.S16;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails",15);
        myHashTable.set("tail",15);
        myHashTable.set("lumber",15);

        myHashTable.set("screw",15);
        myHashTable.set("bolts",15);

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("tool"));

        System.out.println(myHashTable.keys());

        myHashTable.printTable();
    }
}
