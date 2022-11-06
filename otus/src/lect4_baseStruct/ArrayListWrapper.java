package lect4_baseStruct;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWrapper<T> implements InterfaceArray<T> {

    private final List<T> list = new ArrayList<>();
    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void put(T item) {
        list.add(item);

    }

    @Override
    public void put(T item, int index) {
        list.add(index, item);
    }

    @Override
    public T remove(int index) {
        return list.remove(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {

    }
}
