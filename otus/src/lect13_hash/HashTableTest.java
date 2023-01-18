package lect13_hash;

public class HashTableTest {

    public static void main(String[] args) {
        HashTable<Integer, String>hashTable = new HashTable<>(5);
        for (int i = 0; i < 20; i++) {
            hashTable.put(i, String.valueOf(i));
        }
        for (int i = 0; i < 20; i++) {
            hashTable.put(i, String.valueOf(i+1));
        }
        System.out.println(hashTable.get(10));
        System.out.println(hashTable.get(20));

        System.out.println(hashTable.size);

        System.out.println(hashTable.entries.length);
    }
}