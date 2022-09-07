package lect3_diffAlgo;

public class PrimeFound {

    public long getCountPrimes(long numb){
        int count = 0;
        for (int i = 2; i < numb; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(long numb){
        if (numb == 2) return true;
        if (numb%2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(numb); i+=2) {
            if (numb % i == 0){
                return false;
            }
        }
        return true;
    }
    long[] primes;
    long getCountPrimesByArray(int numb){
        int count = 0;
        primes = new long[numb/2];
        primes[count++] = 2;
        for (int i = 3; i <= numb ; i++) {
            if (isPrimeArray(i)){
                primes[count++] = i;
            }
        }
        return count;
    }
    boolean isPrimeArray(int numb) {
        long s = (long) Math.sqrt(numb);
        for (int i = 0; primes[i] <= s; i++) {
            if (numb % primes[i] == 0)
                return false;
        }
        return true;
    }
}
