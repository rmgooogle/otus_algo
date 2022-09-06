package lect2_luckyTickets;

import java.util.Arrays;

public class PowLickyTickets {

    public int[] getFirstArray() {
        int sum = 10;
        int[] sumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            sumArray[i] = 1;
        }
        return sumArray;
    }

    public Long getLuckyTicketsCount(int size) {
        int[] sumArray;
        sumArray = getFirstArray();
        for (int i = 2; i < size + 1; i++) {
            sumArray = returnSummArray(sumArray, i);
        }

        System.out.println(Arrays.toString(sumArray));
        System.out.println(returnSumm(sumArray));
        System.out.println("-----------------------------");
        return returnSumm(sumArray);
    }

    private int[] returnSummArray(int[] sumArray, int size) {

        int sum = (size * 9) + 1;

        int[][] allArray = new int[10][sum];
        int row;
        for (int i = 0; i < 10; i++) {
            row = 0;
            for (int k : sumArray) {
                allArray[i][i + row] = k;
                row++;
            }
        }

        int[] resultSum = new int[sum];
        int resultSums = 0;
        for (int i = 0; i < sum; i++) {
            for (int j = 0; j < 10; j++) {
                resultSums += allArray[j][i];
            }
            resultSum[i] = resultSums;
            resultSums = 0;
        }
        return resultSum;
    }

    public long returnSumm(int[] resultArray) {
        long summ = 0;
        for (int j : resultArray) {
            summ += (long) j * j;
        }
        return summ;
    }
}
