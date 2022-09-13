package lect5_bits;

public class ChessBoard {
    public static void main(String[] args) {
        long var = 9007199254740992L;
        System.out.println(getRookMask(var));
        System.out.println("-----------------------");
        System.out.println(getBishopMask(var));
        System.out.println("-----------------------");
        System.out.println(getQueenMask(var));
    }

    public static long getRookMask(long var){ //Ладья
        long xMask = 255L;
        long yMask = 72340172838076673L;

        while((xMask&var) == 0){
            xMask = (xMask<<8);
        }

        while((yMask&var)==0) {
            yMask = (yMask << 1);
        }

        return xMask^yMask;
    }

    public static long getBishopMask(long var){ // слон
        int count=1;
        long xLeftTop = var;
        long xLeftBott = var;
        long xRightTop = var;
        long xRightBott = var;
        long xLeftMask = 72340172838076673L;
        long xBottMask = 255L;
        long xRightMask = 36170086419038336L;
        long xTopMask = 9151314442816847872L;

        while((xLeftMask&xLeftTop) == 0 && (xLeftTop&xTopMask)==0){
            xLeftTop = xLeftTop | (var << (7 * count));
            count++;
        }
        count=1;
        while((xLeftMask&xLeftBott) == 0L && (xLeftBott&xBottMask) == 0L){
            xLeftBott = xLeftBott | (var >> (9 * count));
            count++;
        }
        count=1;
        while(((xRightMask&xRightTop) == 0) && (xTopMask&xRightTop)==0 && xRightTop>0){
            xRightTop = xRightTop | (var << (9 * count));
            count++;
        }
        count=1;
        while((xRightBott&xBottMask)==0 && (xRightBott&xRightMask)==0){
            xRightBott = xRightBott | (var >> (7 * count));
            count++;
        }

        return var^(xLeftBott|xLeftTop|xRightTop|xRightBott);
    }

    public static long getQueenMask(long var){
        return getBishopMask(var)|getRookMask(var);
    }
}
