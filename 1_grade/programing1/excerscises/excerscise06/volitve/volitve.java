import java.util.Scanner;

public class volitve {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int L = sc.nextInt();
        int S = sc.nextInt();
        int V = sc.nextInt();

        int[][][] tabela = new int[L][S][V];
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int stGlasov = 0;
        for (int i = 0; i < t[leto][stranka].length; i++) {
            stGlasov += t[leto][stranka][i];
        }
        return stGlasov;
    }

    public static int[][] glasovi(int[][][] t) {
        int[][] letoStranka = new int[t.length][t[0].length];
        for(int i = 0; i < t.length; i++) {
            for (int b = 0; b < t[0][0].length; i++) {
                int sestev = steviloGlasov(t, i, b);
                letoStranka[i][b] = sestev;
            }
        }
        return letoStranka;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int[] sestevki = new int[t[0][0].length];
        int max = 0;
        int index = 0;
        for (int i = 0; i < t.length; i++) {
            int sestevek = 0;
            for (int b = 0; b < t[i][stranka].length; b++) {
                sestevek += t[i][stranka][b];
            }
            sestevki[i] = sestevek;
        }
        for (int c = 0; c < sestevki.length; c++) {
            if (sestevki[c] > max) {
                max = sestevki[c];
                index = c;
            }
        }
        return index;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int[] uvrstitve = new int[t.length];
        int vsota = 0;
        for (int i = 0; i < t.length; i++) {
            int uvrstitev = 0;
            for (int b = 0; b < t[i][stranka].length; b++) {
                if (t[i][b][volisce] > t[i][stranka][volisce]) {
                    uvrstitev += 1;
                }
            }
            uvrstitve[i] = uvrstitev;
        }
        for (int i = 0; i < uvrstitve.length; i++) {
            vsota += uvrstitve[i];
        }
        return vsota;
    }
    

}