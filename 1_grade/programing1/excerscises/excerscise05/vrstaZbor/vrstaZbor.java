import java.util.Scanner;

public class vrstaZbor {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int kolikoMansih = 0;
        String dolzina = sc.nextLine();
        int dl = Integer.parseInt(dolzina);
        String st = sc.nextLine();
        String[] parts = st.split(" ");
        int[] visine = new int[dl];
        for (int i = 0; i < dl; i++) {
            visine[i] = Integer.parseInt(parts[i]);
        }
        for (int i = 0; i < dl; i++) {
            if (i == 0) {
                if (visine[i] <= visine[i+1]) {
                kolikoMansih++;
                System.out.println(i);
                }
            }
            else if (i == dl - 1) {
                if (visine[i-1] <= visine[i]) {
                kolikoMansih++;
                System.out.println(i);
                }
            }
            else {
                if (visine[i-1] <= visine[i] && visine[i] <= visine[i+1]) {
                    kolikoMansih++;
                    System.out.println(i);
                }
            }
        }
        if (kolikoMansih == 0) {
            System.out.println("NOBEDEN");
        }
    }
}