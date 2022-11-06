package lect4_baseStruct;

import java.util.Arrays;

public class SingleArray<T> implements InterfaceArray<T> {
    private T[] array;
    private int size = 0;

    public SingleArray() {
        array = (T[]) new Object[0];
    }

    @Override
    public void put(T item) {
        if (size == this.array.length) {
            resize();
        }

        this.array[size] = item;
        size++;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void put(T item, int index) {

        if (size == this.array.length)
            resize();

        int length = size - index;
        if (length > 0) {
            System.arraycopy(array, index, array, index + 1, length);
        }

        array[index] = item;
        size++;
    }

    private void resize() {
       array = Arrays.copyOf(array, size + 1);
    }

    @Override
    public T remove(int index) {

        T itemToRemove = array[index];

        int length = size - index - 1;
        if (length > 0) {
            System.arraycopy(array, index + 1, array, index, length);
            array[size - 1] = null;
        }

        size--;

        return itemToRemove;
    }

    @Override
    public int size() {
        return size;
    }


    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size=0;
        array = (T[]) new Object[0];
    }
}