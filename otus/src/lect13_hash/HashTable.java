package lect13_hash;

public class HashTable <K,V> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1000;

    int threshold;
    int size;
    HashEntry<K, V>[] entries;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    HashTable(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }
        entries = new HashEntry[initialCapacity];
        threshold = (int) (initialCapacity * LOAD_FACTOR);
        size = 0;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode()) % entries.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object value) {
        if (value == null) throw new NullPointerException();

        for (int i = entries.length - 1; i >= 0; i--) {
            HashEntry<K, V> hashEntry = entries[i];
            while (hashEntry != null) {
                if (hashEntry.getValue().equals(value)) {
                    return true;
                }
                hashEntry = hashEntry.next;
            }
        }
        return false;
    }

    public boolean containsKey(Object key) {
        int idx = hash(key);
        HashEntry<K, V> hashEntry = entries[idx];
        while (hashEntry != null) {
            if (hashEntry.getKey().equals(key)) {
                return true;
            }
            hashEntry = hashEntry.next;
        }
        return false;
    }

    public V get(Object key) {
        int idx = hash(key);
        HashEntry<K, V> entry = entries[idx];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.next;
        }
        return null;
    }

    public V put(K key, V value) {
        int idx = hash(key);
        HashEntry<K, V> entry = entries[idx];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            } else {
                entry = entry.next;
            }
        }

        if (++size > threshold) {
            resize();
            idx = hash(key);
        }

        entry = new HashEntry<>(key, value);
        entry.next = entries[idx];
        entries[idx] = entry;

        return null;
    }

    private void resize() {
        HashEntry<K, V>[] oldBuckets = entries;

        int newCapacity = Math.min(entries.length * 2, MAXIMUM_CAPACITY);
        threshold = (int) (newCapacity * LOAD_FACTOR);
        entries = new HashEntry[newCapacity];

        for (int i = oldBuckets.length - 1; i >= 0; i--) {
            HashEntry<K, V> bucket = oldBuckets[i];
            while (bucket != null) {
                int idx = hash(bucket.getKey());
                HashEntry<K, V> current = entries[idx];
                if (current != null) {
                    HashEntry<K, V> next = current.next;
                    while (next != null) {
                        current = next;
                        next = current.next;
                    }
                    current.next = bucket;
                } else {
                    entries[idx] = bucket;
                }
                HashEntry<K, V> next = bucket.next;
                bucket.next = null;
                bucket = next;
            }
        }
    }
}
