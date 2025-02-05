import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long cn = Long.parseLong(br.readLine());
        long order = 1;

        while (cn != 1) {
            order++;
            if (cn % 2 == 0) {
                cn = cn / 2;
            } else {
                cn = 3 * cn + 1;
            }
        }

        sb.append(order);

        System.out.println(sb.toString());
    }
}