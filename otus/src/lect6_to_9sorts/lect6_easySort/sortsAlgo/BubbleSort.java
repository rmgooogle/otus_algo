package lect6_to_9sorts.lect6_easySort.sortsAlgo;

import java.util.Arrays;

public class BubbleSort implements Sort {
    public int[] arr;
    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(i, j);
                }
            }
        }
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
