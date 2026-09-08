package DSA.S16;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        this.dataMap = new Node[size];
    }

    class Node {
        public String key;
        public int value;
        public Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key) {
        
    }

    public void printTable(){
        for(int i = 0; i < size; i++) {
            System.out.println(i+": ");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println(" {"+temp.key+"= "+temp.value+"}");
                temp = temp.next;
            }
        }
    }

}
