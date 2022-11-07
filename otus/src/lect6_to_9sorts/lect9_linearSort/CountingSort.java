package lect6_to_9sorts.lect9_linearSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class CountingSort implements Sort {
    public int[] arr;

    @Override
    public void sort() {
        sort(arr);
    }

    @Override
    public void swap(int a, int b) {

    }

    @Override
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void sort(int[] arr) {
        int max = 0;
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }

        int[] countArray = new int[max + 1];
        for (int i : arr) {
            countArray[i]++;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] out = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int position = --countArray[arr[i]];
            out[position] = arr[i];
        }

        System.arraycopy(out, 0, arr, 0, arr.length);
    }

}
