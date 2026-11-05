import java.util.Scanner;

public class zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int del = k;
        int st = 1;   
        int state = 0;    

        while (st < n) { 
            int z = sc.nextInt();
            if (del < z) {
                st++;
                del = k;
                state = 0;
            }
            del -= z;
            state += z;
            System.out.println(z + " EP -> zgoscenka " + st + " (" + state + " EP)");
        }

    }
}