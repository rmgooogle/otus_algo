package lect6_to_9sorts;

public class ArraysGenerator {
    public static int[] createArray(int size, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        return arr;
    }
}
