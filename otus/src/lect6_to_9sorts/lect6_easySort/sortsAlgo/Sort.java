package lect6_to_9sorts.lect6_easySort.sortsAlgo;

public interface Sort {

    public default void sorting(){
        long t1 = System.currentTimeMillis();
        sort();
        System.out.println(this.getClass().getSimpleName() + " timing: " + (System.currentTimeMillis()-t1));
    }
    public void sort();

    public void swap(int a, int b);

    public void setArr(int[] arr);
}
