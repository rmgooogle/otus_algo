package lect6_to_9sorts.lect9_linearSort;

import lect6_to_9sorts.ArraysGenerator;

public class CheckSort {

    public static void main(String[] args) {
        int n = 10_000_000;

        BucketSort bucketSort = new BucketSort();
        bucketSort.setArr(ArraysGenerator.createArray(n, 1000));
        bucketSort.sorting();

        RadixSort radixSort= new RadixSort();
        radixSort.setArr(ArraysGenerator.createArray(n, 1000));
        radixSort.sorting();


        CountingSort countingSort = new CountingSort();
        countingSort.setArr(ArraysGenerator.createArray(n, 1000));
        countingSort.sorting();

    }




}
