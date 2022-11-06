package lect4_baseStruct;

import java.util.Arrays;

public class FactorArray<T> implements InterfaceArray<T> {

    private static final int FACTOR = 2;
    private T[] array;
    private int size = 0;

    public FactorArray(){
        this.array = (T[]) new Object[FACTOR];
        this.size = 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void put(T item) {
        if (size == this.array.length) {
            resize();
        }

        this.array[size] = item;
        size++;

    }

    private void resize() {
       array = Arrays.copyOf(array, size * FACTOR + 1);
    }

    @Override
    public void put(T item, int index) {
        if (size ==this.array.length) {
            resize();
        }
        System.arraycopy(array, index, array, index + 1, array.length - index - 1);
        array[index] = item;
        size++;
    }

    @Override
    public T remove(int index) {
        T removedItem = array[index];
        T[] newArray = (T[]) (new Object[size() - 1]);
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size() - 1 - index);
        array = newArray;
        size--;
        return removedItem;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return InterfaceArray.super.isEmpty();
    }

    @Override
    public void clear() {

    }
}
