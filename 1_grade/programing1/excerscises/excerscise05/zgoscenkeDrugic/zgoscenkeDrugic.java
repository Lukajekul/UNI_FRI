import java.util.Arrays;
import java.util.Scanner;

public class zgoscenkeDrugic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int st = sc.nextInt();
        int velikost = sc.nextInt();
        int[] zgoscenke = new int[st];
        while (sc.hasNextInt()) {
            int podatek = sc.nextInt();
            if (!(hasSpace(zgoscenke, podatek, st, velikost))) {
                break;
            }
            for (int i = 0; i < st; i++) {
                if (najmansa(zgoscenke, i, st) && zgoscenke[i] + podatek <= velikost) {
                    zgoscenke[i] += podatek;
                    int zgoscenka = i + 1;
                    String zgoscenkeString = Arrays.toString(zgoscenke);
                    System.out.println(podatek + " EP -> zgoscenka " + zgoscenka + " " + zgoscenkeString);
                    break;
                }
            }
        }
    }
    
    public static boolean najmansa(int[] zgoscenke, int index, int st) {
        boolean state = true;
        for (int i = 0; i < st; i++) {
            if (zgoscenke[i] < zgoscenke[index]) {
                state = false;
            }
        }
        return state;
    }
    
    public static boolean hasSpace(int[] zgoscenka, int podatek, int st, int velikost) {
        int isGreater = 0;
        for (int i = 0; i < st; i++) {
            if (zgoscenka[i] + podatek <= velikost) {
                isGreater++;
            }
        }
        return isGreater > 0;
    }
}