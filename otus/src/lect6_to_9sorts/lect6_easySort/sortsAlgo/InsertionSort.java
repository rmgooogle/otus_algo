package lect6_to_9sorts.lect6_easySort.sortsAlgo;

import java.util.Arrays;

public class InsertionSort implements Sort {
    public int[] arr;

    @Override
    public void sort()
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && more(j, j + 1) ; j--) {
                swap(j, j + 1);
            }

        }
    }

    private boolean more(int j, int i) {
        return arr[j] > arr[i];
    }

    @Override
    public void swap(int a, int b) {
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }

    @Override
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
