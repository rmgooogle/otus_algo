package lect6_to_9sorts.lect8_quickExternalSort;

import lect6_to_9sorts.lect6_easySort.sortsAlgo.Sort;

import java.util.Arrays;

public class MergeSort implements Sort {

    public int[] arr;

    public void sort(int l, int r) {
        if(l >= r) return;
        int m = (l+r)/2;
        sort(l, m);
        sort(m+1, r);
        merge(l,m,r);
    }

    public void merge(int l, int x, int r){
        int[] mass = new int[r-l+1];
        int a = l;
        int b = x+1;
        int m = 0;
        while(a <= x && b <= r){
            if(arr[a] < arr[b]){
                mass[m++] = arr[a++];
            }else {
                mass[m++] = arr[b++];
            }
        }
        while (a <= x)
            mass[m++] = arr[a++];
        while (b <= r)
            mass[m++] = arr[b++];
        for (int i = l; i <= r; i++) {
            arr[i] = mass[i-l];
        }
    }


    @Override
    public void sort() {
        this.sort(0, arr.length-1);

    }

    @Override
    public void swap(int a, int b) {

    }

    @Override
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
