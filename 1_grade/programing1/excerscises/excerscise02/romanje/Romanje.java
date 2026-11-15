import java.util.Scanner;

public class Romanje {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();
        int itteration = 1;
        while (d > 0) {
            if (d - p < 0) {
                System.out.println(itteration + ": " + d + " -> " + 0);
                break;
            }
            else {
                System.out.println(itteration + ": " + d + " -> " + (d - p));
            }
            d -= p;
            if (p - z <= 0) {
                break;
            }
            p -= z;
            itteration++;
        }
    }
}