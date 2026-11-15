import java.util.Scanner;

public class Vsota2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int prva = sc.nextInt();
        int druga = sc.nextInt();
        int sestevek = prva + druga;
        System.out.println(prva + " + " + druga + " = " + sestevek);
    }
}
