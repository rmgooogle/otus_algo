package lect6_to_9sorts.lect6_easySort;

import lect6_to_9sorts.ArraysGenerator;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.BubbleSort;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.InsertionSort;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.ShellSort;
import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class TestSorts {
    public static void main(String[] args) {
        Sort bubbleSort = new BubbleSort();
        bubbleSort.setArr(ArraysGenerator.createArray(100000,1000));
        bubbleSort.sorting();

        Sort insertionSort = new InsertionSort();
        insertionSort.setArr(ArraysGenerator.createArray(100000,1000));
        insertionSort.sorting();

        Sort shellSort = new ShellSort();
        shellSort.setArr(ArraysGenerator.createArray(100000,1000));
        shellSort.sorting();
    }
}
