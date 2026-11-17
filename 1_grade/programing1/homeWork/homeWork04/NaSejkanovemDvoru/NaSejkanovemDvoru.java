import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class NaSejkanovemDvoru {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Hashtable<Integer, Integer> order = new Hashtable<Integer, Integer>();
        long itteration = 0;

        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(br.readLine().trim());
            order.merge(b, 1, Integer::sum);
        }
        for (int key : order.keySet()) {
            int missing = k - key;
            if (order.containsKey(missing)) {
                itteration += (long) order.get(key) * order.get(missing);
            }
        }
        System.out.println(itteration);
    }
}