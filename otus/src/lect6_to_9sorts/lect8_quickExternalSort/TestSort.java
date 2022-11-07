package lect6_to_9sorts.lect8_quickExternalSort;

import lect6_to_9sorts.ArraysGenerator;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class TestSort {
    public static void main(String[] args) {
        Sort quickSort = new QuickSort();
        quickSort.setArr(ArraysGenerator.createArray(1000000, 1000));
        quickSort.sorting();

        MergeSort merge = new MergeSort();
        merge.setArr(ArraysGenerator.createArray(1000000, 1000));
        merge.sorting();
    }
}
