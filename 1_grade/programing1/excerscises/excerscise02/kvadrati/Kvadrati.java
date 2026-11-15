import java.util.Scanner;

public class Kvadrati {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i ++) {
            System.out.println(i * i);
        }
    }
}