import java.util.Scanner;

public class homeWork1 {
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
                
            case 4:
                break;
            }
        return 0;
        }
}