package lect6_to_9sorts.lect7_pyramidSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class SelectionSort implements Sort {

    public int[] arr;

    @Override
    public void sort() {
        int size = arr.length;
        int x = findMax(size);
        for (int i = size - 1; i > 0; i--) {
            swap(x, i);
            x = findMax(i);
        }
    }

    @Override
    public void swap(int a, int b) {
        int z = arr[a];
        arr[a] = arr[b];
        arr[b] = z;
    }

    @Override
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    private int findMax(int size) {
        int x = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[x])
                x = i;
        }
        return x;
    }
}
