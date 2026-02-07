import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());

        if (isSquare(n)) {
            sb.append(1);
            System.out.print(sb.toString());
            return;
        }

        int limit = (int) Math.sqrt(n);

        for (int i = 1; i <= limit; i++) {
            int a = i * i;
            int rest = n - a;
            if (isSquare(rest)) {
                sb.append(2);
                System.out.print(sb.toString());
                return;
            }
        }

        for (int i = 1; i <= limit; i++) {
            int a = i * i;
            int rest1 = n - a;
            int limit2 = (int) Math.sqrt(rest1);
            for (int j = 1; j <= limit2; j++) {
                int b = j * j;
                int rest2 = rest1 - b;
                if (isSquare(rest2)) {
                    sb.append(3);
                    System.out.print(sb.toString());
                    return;
                }
            }
        }

        sb.append(4);
        System.out.print(sb.toString());
    }

    private static boolean isSquare(int x) {
        if (x < 0) {
            return false;
        }
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }
}
