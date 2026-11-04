import java.util.Scanner;

public class homeWork2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int type = sc.nextInt();
        int d = sc.nextInt();
        int press = sc.nextInt();

        int result = steps(type, d, press);
        System.out.println(result);
        }

    public static int steps(int type, int d, int press) {
        int stepCount = 0;
        int cP1 = sc.nextInt();
        int cP2 = sc.nextInt();
        switch(type){
            case 1:
                stepCount += Math.abs(cP1 - cP2);

                for(int i = 0; i < press - 2; i++) {
                    cP1 = cP2;
                    cP2 = sc.nextInt();
                    stepCount += Math.abs(cP1 - cP2);
                }
                return stepCount;

            case 2:
                stepCount += Math.abs(cP2 / d - cP1 / d) +  Math.abs(cP2 % d - cP1 % d); 
                for (int i = 0; i < press - 2; i++) {
                    cP1 = cP2;
                    cP2 = sc.nextInt();
                    stepCount += Math.abs(cP2 / d - cP1 / d) +  Math.abs(cP2 % d - cP1 % d);
                }
                return stepCount;
            case 3:
                stepCount += Math.abs(findCol(d, cP2) - findCol(d, cP1)) + Math.abs(findRow(d, cP2) - findRow(d, cP1));
                for (int i = 0; i < press - 2; i++) {
                    cP1 = cP2;
                    cP2 = sc.nextInt();
                    stepCount += Math.abs(findCol(d, cP2) - findCol(d, cP1)) + Math.abs(findRow(d, cP2) - findRow(d, cP1));
                }
                return stepCount;
            case 4:
                int[] a = findCords(cP1, d);
                int[] b = findCords(cP2, d);
                stepCount += Math.abs(b[0] - a[0]) + Math.abs(b[1] - a[1]);
                for (int i = 0; i < press - 2; i++) {
                    cP1 = cP2;
                    cP2 = sc.nextInt();
                    a = findCords(cP1, d);
                    b = findCords(cP2, d);
                    stepCount += Math.abs(b[0] - a[0]) + Math.abs(b[1] - a[1]);
                }
                return stepCount;
            }
        return 0;
        }

        public static int findRow(int rows, int number) {
            int row = 1;
            for (int i = 1; i < rows + 1; i++) {
                if (Math.pow(i, 2) > number) {
                    row = i;
                    break;
                }
            }
            return row - 1;
        }
        public static int findCol(int rows, int number) {
            int row = findRow(rows, number);
            int digit = row * row;
            int numSpace = number - digit;
            int emptyCol = rows - 1 - row;
            return emptyCol + numSpace;
        }
        
        public static int[] findCords(int number, int d) {
            int col = d / 2;
            int row = col;
            int circle = circleNum(number);
            if (circle == 0) return new int[] {row,col};
            int p = number - (2*circle -1 ) * (2*circle - 1);
            int side = p / (2*circle);
            int off = p % (2*circle);
            switch(side){
                case 0:
                    row -= circle;
                    col += -circle + off;
                return new int[] {row, col};
                case 1:
                    col += circle;
                    row += -circle + off;
                return new int[] {row, col};
                case 2:
                    row += circle;
                    col += circle - off;
                return new int[] {row, col};
                case 3:
                    col -= circle;
                    row += circle - off;
                return new int[] {row, col};
            }
            return new int[] {row,col};
        }
        public static int circleNum(int number){
            int circle = 0;
            while (number >= (2*(circle+1) - 1) *  (2*(circle+1) - 1)) {
                circle++;
            }
            return circle;
        }

}