import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int g = sc.nextInt();

        for (int i = g; i <= n; i+=g){
            for (int j = i; j <= n; j+=g){
                if (njDel(i, j) == g) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
       }
    }
    
    static int njDel(int i, int g) {
        if (g == 0) {
            return i;
        }
        return njDel(g, i%g);
    }
}