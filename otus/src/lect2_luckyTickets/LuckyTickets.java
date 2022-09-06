package lect2_luckyTickets;

public class LuckyTickets {
    private final int ticketSize;

    public LuckyTickets(int ticketSize) {
        this.ticketSize = ticketSize;
    }

    private long getLuckyTicketsCount(long count, int n, int leftSum, int rightSum) {
        if (ticketSize == n) {
            if (leftSum == rightSum) {
                count++;
            }
            return count;
        }
        for (int i = 0; i <= 9; i++) {
            if (n < ticketSize / 2) {
                count = getLuckyTicketsCount(count, n + 1, leftSum + i, rightSum);
            } else {
                count = getLuckyTicketsCount(count, n + 1, leftSum, rightSum + i);
            }
        }
        return count;
    }

    public Long getLuckyTicketsCount() {
        return getLuckyTicketsCount(0, 0, 0, 0);
    }

}