import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // W(n) = k*T(k+1)
        // W(1) = 1 * t(2) = 3
        // W(2) = 2 * t(3) + 1 * t(2) = 2 * 6 + 3 = 15
        // W(3) = 3 * t(4) + W(2) = 3 * 10 + 15 = 45
        // W(4) = 4 * t(5) + W(3) = 4 * 15 + 45 = 105 =  4 * t(5) +  3 * t(4) +  2 * t(3) +

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] t = new int[302];

        for (int i = 1; i <= 301; i++) {
            t[i] = t[i - 1] + i;
        }

        for (int i = 1; i <= num; i++) {
            int testcase = Integer.parseInt(br.readLine());
            int answer = 0;

            for (int j = 1; j <= testcase; j++) {
                answer += j * t[j + 1];
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
