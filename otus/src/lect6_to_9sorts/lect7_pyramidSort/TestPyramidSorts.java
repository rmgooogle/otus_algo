package lect6_to_9sorts.lect7_pyramidSort;

import lect6_to_9sorts.ArraysGenerator;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class TestPyramidSorts {
    public static void main(String[] args) {
        Sort selectionSort = new SelectionSort();
        selectionSort.setArr(ArraysGenerator.createArray(1000000, 1000));
        selectionSort.sorting();

        Sort heapSort = new HeapSort();
        heapSort.setArr(ArraysGenerator.createArray(1000000, 1000));
        heapSort.sorting();
    }
}
