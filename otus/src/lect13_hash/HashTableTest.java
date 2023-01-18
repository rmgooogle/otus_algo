package lect13_hash;

public class HashTableTest {

    public static void main(String[] args) {
        HashTable<Integer, String>hashTable = new HashTable<>();
        hashTable.put(10, "10");
        hashTable.put(20, "20");
        hashTable.put(30, "30");
        hashTable.put(40, "40");
        System.out.println(hashTable.get(10));
        System.out.println(hashTable.get(20));
        System.out.println(hashTable.get(30));
        System.out.println(hashTable.get(40));
        hashTable.put(50, "50");
        hashTable.put(60, "60");
        hashTable.put(60, "61");
        System.out.println(hashTable.size);

        System.out.println(hashTable.entries.length);
    }
}