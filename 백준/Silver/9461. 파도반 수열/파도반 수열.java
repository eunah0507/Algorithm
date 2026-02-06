import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        long[] p = new long[101];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        for (int i = 4; i <= 100; i++) {
            p[i] = p[i - 2] + p[i - 3];
        }

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(p[n]).append('\n');
        }

        System.out.print(sb.toString());
    }
}
