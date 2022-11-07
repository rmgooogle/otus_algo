package lect6_to_9sorts.lect9_linearSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

public class BucketSort implements Sort {

    public int[] arr;

    public void sort(int[] arr) {
        int max = 0;
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }

        SortedVector[] buckets = new SortedVector[arr.length];

        for (int value : arr) {
            int pos = (int) (((long) value * arr.length) / (max + 1));

            if (buckets[pos] == null) {
                buckets[pos] = new SortedVector();
            }

            buckets[pos].add(value);
        }

        int pos = 0;

        for (SortedVector bucket : buckets) {
            if (bucket != null) {
                for (int j = 0; j < bucket.size(); j++) {
                    arr[pos] = bucket.get(j);
                    pos++;
                }
            }
        }
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

    private static class SortedVector {
        int[] arr;
        private final int vector = 10;
        private int size = 0;

        public SortedVector() {
            this.arr = new int[vector];
        }

        public int get(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }

            return this.arr[index];
        }

        public void add(int item) {
            if (size == this.arr.length) {
                resize();
            }

            for (int i = 0; i < size; i++) {
                if (item <= this.arr[i]) {
                    this.add(item, i);
                    return;
                }
            }

            this.arr[size] = item;
            size++;
        }

        public int size() {
            return size;
        }

        private void add(int item, int index) {
            if (size == this.arr.length) {
                int[] newArray = new int[size + vector];

                if (size != 0) {
                    System.arraycopy(this.arr, 0, newArray, 0, index);
                }

                newArray[index] = item;
                System.arraycopy(this.arr, index, newArray, index + 1, size - index);

                arr = newArray;
            } else {
                if (size - index >= 0) {
                    System.arraycopy(this.arr, index, this.arr, index + 1, size - index);
                }

                arr[index] = item;
            }

            size++;
        }

        private void resize() {
            int[] newArray = new int[size + vector];
            if (size != 0) {
                System.arraycopy(this.arr, 0, newArray, 0, size);
            }

            this.arr = newArray;
        }
    }
}