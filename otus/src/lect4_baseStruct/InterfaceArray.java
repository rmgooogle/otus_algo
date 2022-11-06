package lect4_baseStruct;

public interface InterfaceArray<T> {
    T get(int index);

    void put(T item);

    void put(T item, int index);

    T remove(int index);

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    void clear();
}
