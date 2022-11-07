package lect6_to_9sorts.lect8_quickExternalSort;


import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

import java.util.Arrays;

public class QuickSort implements Sort {

    public int[] arr;

    public void sort(int l, int r) {
        if(l >= r) return;
        int x = split(l, r);
        sort(l, x-1);
        sort(x+1, r);
    }


    @Override
    public void sort() {
        this.sort(0, arr.length-1);

    }

    public void swap(int x, int y) {
        if(x == y) return;
        int z = arr[x];
        arr[x] = arr[y];
        arr[y] = z;
    }

    public int split(int l, int r) {

        int p = arr[r];
        int m = l - 1;
        for (int j = l; j <= r ; j++) {
            if (arr[j] <= p)
                swap(++m, j);
        }
        return m;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
