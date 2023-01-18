package lect13_hash;

public class HashEntry<K, V> {
    private final K key;
    private V value;
    HashEntry<K, V> next;

    public HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V setValue(V newVal) {
        V oldValue = value;
        value = newVal;
        return oldValue;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
