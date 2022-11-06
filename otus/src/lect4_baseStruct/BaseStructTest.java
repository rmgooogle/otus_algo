package lect4_baseStruct;


public class BaseStructTest {
    public static void main(String[] args) {

        InterfaceArray<Integer> single = new SingleArray<>();
        testPut(single, 100);
        testPut(single, 1000);
        testPut(single, 10000);
        testPut(single, 100000);

        System.out.println("_________");
        InterfaceArray<Integer> factor = new FactorArray<>();
        testPut(factor, 100);
        testPut(factor, 1000);
        testPut(factor, 10000);
        testPut(factor, 100000);
        testPut(factor, 1000000);
        testPut(factor, 10000000);

        System.out.println("_________");
        InterfaceArray<Integer> matrix = new MatrixArray<>();
        testPut(matrix, 100);
        testPut(matrix, 1000);
        testPut(matrix, 10000);
        testPut(matrix, 100000);
        testPut(matrix, 1000000);

        System.out.println("_________");
        InterfaceArray<Integer> vector = new VectorArray<>(10);
        testPut(vector, 100);
        testPut(vector, 1000);
        testPut(vector, 10000);
        testPut(vector, 100000);

        System.out.println("_________");
        InterfaceArray<Integer> array = new ArrayListWrapper<>();
        testPut(array, 100);
        testPut(array, 1000);
        testPut(array, 10000);
        testPut(array, 100000);
        testPut(array, 1000000);
        testPut(array, 10000000);
    }

    private static void testPut(InterfaceArray<Integer> array, int total){
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            array.put(i);
        }
        System.out.println(array + " testPut: " + total + " - " + (System.currentTimeMillis() - start));
    }
}
