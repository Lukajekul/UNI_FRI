import java.util.Scanner;
import java.util.Arrays;

public class ploscar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        int[] allTiles = new int[k];
        int[] tileCountH = new int[k];
        int[] tileCountW = new int[k];
        int index = k -1;

        int tiles = 0;

        for (int i = 0; i<k; i++) {
            allTiles[i] = (int) Math.pow(2,i);
        }

        while (w != 0 && h != 0) {
            tileCountW[index] = h / allTiles[index];
            w -= tileCountW[index] * allTiles[index];
            System.out.println(w + "w");
            tileCountH[index] = h / allTiles[index];
            System.out.println(Arrays.toString(tileCountH));

            h -= tileCountH[index] * allTiles[index];
            System.out.println(h + "h");
            index--;
        }

        for (int i = 0; i < k; i++) {
            tiles += tileCountH[i] *  + tileCountW[i];
        }

        System.out.println(tiles);

    }
}