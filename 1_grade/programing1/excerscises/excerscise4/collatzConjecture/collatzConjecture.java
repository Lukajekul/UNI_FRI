import java.util.Scanner;

public class collatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zacetna = sc.nextInt();
        int koncna = sc.nextInt();

        int najdaljsa = 0;
        int najdaljsaVr = 0;

        for ( int i = zacetna; i <= koncna; i++) {
            int dolzina = zaporedje(i);
            if (dolzina > najdaljsa) {
                najdaljsa = dolzina;
                najdaljsaVr = i;
            }
        }
        System.out.println(najdaljsaVr);
        System.out.println(najdaljsa + 1);
    }

    static int zaporedje(int x) {
        int itteration = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                itteration++;
            }
            else {
                x = x * 3 + 1;
                itteration++;
            }
        }
        return itteration;
    }
}