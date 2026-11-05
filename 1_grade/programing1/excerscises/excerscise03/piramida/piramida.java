import java.util.Scanner;

public class piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int presledki = stevilo * 2 + 1;
        int stZvezs = 1;

        String space = " ";
        String star = "*";

        for (int i = 0; i < stevilo; i++) {
            System.out.println(space.repeat((presledki / 2 - (i + 1))) + 
            star.repeat(stZvezs + (i * 2)));
        }
    }
}