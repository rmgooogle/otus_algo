package lect3_diffAlgo;

public class TestAlgoritms {
    public static void main(String[] args) {
        PowAlgo powAlgo = new PowAlgo();
        System.out.println( "result of iterative:: " + powAlgo.getIterativePow(1.002, 1000));
        System.out.println( "result OF Multi: " + powAlgo.getMultiplicationPowTime(1.002, 1000));

        System.out.println("------FiBo-------");
        Fibo fibo = new Fibo();
        System.out.println("result of Fibo: " + fibo.getReFiboNumb(25));
        System.out.println("result of iterative Fibo: " + fibo.getIterativeFibo(25));
        System.out.println("result of golden Fibo: " + fibo.getGoldenRatioFibo(25));

        System.out.println("------isPrime-------");
        PrimeFound primeFound = new PrimeFound();
        System.out.println("iterative algo isPrime: "  + primeFound.getCountPrimes(1000000));
        System.out.println("array algo isPrime: "  + primeFound.getCountPrimesByArray(100000000));
    }
}
