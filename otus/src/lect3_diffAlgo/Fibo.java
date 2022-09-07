package lect3_diffAlgo;

public class Fibo {
    private static final double GOLDEN_RATIO = 1.6180339887498948482045868343656;
    public long getReFiboNumb(long numb) {
        if (numb <= 1) return numb;
        return getReFiboNumb(numb - 1) + getReFiboNumb(numb - 2);
    }

    public long getIterativeFibo(long numb) {
        long f0 = 0;
        long f1 = 1;
        long fResult = 0;
        for (int i = 1; i < numb; i++) {
            fResult = f0 + f1;
            f0 = f1;
            f1 = fResult;
        }
        return fResult;
    }

    public long getGoldenRatioFibo(long numb) {
        PowAlgo powAlgo = new PowAlgo();
        double resultOfPow = powAlgo.getMultiplicationPow(GOLDEN_RATIO, numb) + 0.5;
        return (long) (resultOfPow / Math.sqrt(5));
    }
}
