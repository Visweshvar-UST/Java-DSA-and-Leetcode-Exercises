package DSA.S16;

import java.util.HashMap;

public class Main {
    public static boolean isItemInCommon(int[] a1, int[] a2){
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i: a1){
            map.put(i,true);
        }

        for(int i: a2){
            if(map.get(i) != null) return true;
        }

        return false;
    }

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

        System.out.println(isItemInCommon(new int[]{1,2,5},new int[]{4,6,5}));

        myHashTable.printTable();
    }
}
