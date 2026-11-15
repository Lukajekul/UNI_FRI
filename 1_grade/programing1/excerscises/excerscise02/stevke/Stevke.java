import java.util.Scanner;
public class Stevke {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long stevilka = sc.nextLong();
        String st = Long.toString(stevilka);
        for (int i = st.length() - 1; i > - 1 ; i--) {
            System.out.println(st.substring(i , i + 1));
        }
    }
}
