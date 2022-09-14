package lect6_to_9sorts.lect7_pyramidSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

import java.util.Arrays;

public class HeapSort implements Sort {

    int[] arr;

    public void sort() {
        for (int root = (arr.length / 2) - 1; root >= 0; root--) {
            heapify(root, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(0, i);
            heapify(0, i);
        }
    }

    private void heapify(int root, int size) {
        int l = 2 * root + 1;
        int r = l + 1;
        int x = root;

        if (l < size && arr[l] > arr[x]) x = l;
        if (r < size && arr[r] > arr[x]) x = r;
        if (x == root) return;
        swap(x, root);
        heapify(x, size);
    }


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
