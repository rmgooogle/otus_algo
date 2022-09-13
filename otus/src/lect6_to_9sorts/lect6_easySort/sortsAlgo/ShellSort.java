package lect6_to_9sorts.lect6_easySort.sortsAlgo;

import java.util.Arrays;

public class ShellSort implements Sort{
    public int[] arr;
    @Override
    public void sort() {
        int n = arr.length;

        for (int gap = n/2; gap > 0 ; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i; j >= gap && more(j - gap, j); j -= gap) {
                    swap(j, j - gap);
                }
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
