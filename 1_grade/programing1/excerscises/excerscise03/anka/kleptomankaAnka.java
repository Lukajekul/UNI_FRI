import java.util.Scanner;

public class kleptomankaAnka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int howMany = 0;

        for (int i = 1; i<10 ; i+=2) {
            for (int b = m+1; b<10; b++) {
                for (int c = 0; c * d < 10; c++) {
                    System.out.println(i + "-" + b + "-" + (c * d));
                    howMany++;
                } 
            }
        }
        System.out.println(howMany);
    }
}