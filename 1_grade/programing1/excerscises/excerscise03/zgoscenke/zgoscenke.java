import java.util.Scanner;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int del = k;
        int st = 1;   
        int state = 0;    

        while (sc.hasNext()) { 
            int z = sc.nextInt();
            if (del < z) {
                st++;
                del = k;
                state = 0;
            }
            if (st <= n) {
                del -= z;
                state += z;
                System.out.println(z + " EP -> zgoscenka " + st + " (" + state + " EP)");
            }
            else {
                break;
            }

        }

    }
}