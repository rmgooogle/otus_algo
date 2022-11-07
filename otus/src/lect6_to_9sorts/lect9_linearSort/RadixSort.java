package lect6_to_9sorts.lect9_linearSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class RadixSort implements Sort {
    public int[] arr;

    public void sort(int[] arr) {
        int max = 0;
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        for (int place = 1; max / place > 0; place *= 10)
            sort(arr, place);
    }

    void sort(int[] arr, int place) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] countArray = new int[max + 1];

        for (int i = 0; i < max; ++i)
            countArray[i] = 0;

        for (int j : arr)
            countArray[(j / place) % 10]++;

        for (int i = 1; i < 10; i++)
            countArray[i] += countArray[i - 1];

        int[] output = new int[arr.length + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[countArray[(arr[i] / place) % 10] - 1] = arr[i];
            countArray[(arr[i] / place) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

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

}