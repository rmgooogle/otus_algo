package lect3_diffAlgo;

public class PowAlgo {
    double getIterativePow(double numb, long degree) {
        long t1 = System.currentTimeMillis();
        double powResult = 1;
        for (long i = 0; i < degree; i++) {
            powResult *= numb;
        }
        System.out.println("time of iterative: " + (System.currentTimeMillis() - t1));
        return powResult;
    }

    double getMultiplicationPowTime(double numb, long degree) {
        long t1 = System.currentTimeMillis();
        double result = getMultiplicationPow(numb, degree);
        System.out.println("time of multi: " + (System.currentTimeMillis() - t1));

        return result;
    }

    double getMultiplicationPow(double numb, long degree) {
        double powResult = 1;
        long i = 1;
        double powsNumb = numb;
        for (; i <= degree; i = i * 2) {
            powResult *= powsNumb;
            powsNumb = powResult;
        }
        i = i / 2;
        degree = degree - i;
        if (degree >= 1) {
            powResult *= getMultiplicationPow(numb, degree);
        }
        return powResult;
    }

    double getMultiplicationPow2(double numb, long degree){
        double d = numb;
        double p = 1;
        while (degree>1){
            degree /= 2;
            d *= d;
            if (!(degree%2==0)){
                p *= d;
            }
        }
        return p;
    }
}
