package lect4_baseStruct;

public class MatrixArray<T> implements InterfaceArray<T>{

    private InterfaceArray<InterfaceArray<T>> arrays;
    private static final int DEFAULT_SIZE = 10;
    int size;

    public MatrixArray() {
        this.arrays = new SingleArray<InterfaceArray<T>>();
        this.size = 0;

    }

    @Override
    public T get(int index) {
        return arrays.get(index/DEFAULT_SIZE).get(index%DEFAULT_SIZE);
    }

    @Override
    public void put(T item) {
        if(this.size == arrays.size() * DEFAULT_SIZE){
            arrays.put(new SingleArray<T>());
        }
        arrays.get(size/DEFAULT_SIZE).put(item);
        size++;
    }

    @Override
    public void put(T item, int index) {

    }

    @Override
    public T remove(int index) {
        int row = index / DEFAULT_SIZE;
        int column = index % DEFAULT_SIZE;

        T deleted = arrays.get(row).remove(column);
        size--;

        if (arrays.get(row).size() <= 0) {
            arrays.remove(row);
        }

        return deleted;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return InterfaceArray.super.isEmpty();
    }

    @Override
    public void clear() {

    }
}
