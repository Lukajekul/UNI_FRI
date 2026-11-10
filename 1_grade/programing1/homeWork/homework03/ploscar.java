import java.util.Scanner;

public class ploscar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        k++;

        int[] allTiles = new int[k];
        long[] tileCountH;
        long[] tileCountW;

        long tiles = 0;

        for (int i = 0; i<k; i++) {
            allTiles[i] = (int) Math.pow(2,i);
        }

        while(w != 0 && h != 0) {
            tileCountH = getTiles(k, allTiles, h);
            tileCountW = getTiles(k, allTiles,w);

            for (int i = k - 1; i >= 0; i--) {
                if (i == k - 1) {
                    tiles += tileCountH[i] * tileCountW[i];
                }
                else {
                    if (tileCountH[i] != 0) {
                        tiles += (long) tileCountH[i] * ((allTiles[k - 1] / allTiles[i]) * tileCountW[k - 1]);
                    }
                    if (tileCountW[i] != 0) {
                        tiles += (long) tileCountW[i] * ((allTiles[k - 1] / allTiles[i]) * tileCountH[k - 1]);
                    }
                }
            }
            w -= allTiles[k - 1] * tileCountW[k - 1];
            h -= allTiles[k - 1] * tileCountH[k - 1];
            k--;
        }
        System.out.println(tiles);
    }

    public static long[] getTiles(int k, int[] allTiles, int h) {
        int index = k - 1;
        long[] tileCountH = new long[k];
        while (index != -1) {
            tileCountH[index] = h / allTiles[index];
            h -= tileCountH[index] * allTiles[index];
            index--;
        }
        return tileCountH;
    }
}