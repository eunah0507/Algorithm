import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = reverse(Integer.parseInt(st.nextToken()));
            int b = reverse(Integer.parseInt(st.nextToken()));

            int sum = a + b;
            sb.append(reverse(sum)).append('\n');
        }

        System.out.print(sb);
    }

    private static int reverse(int x) {
        int result = 0;

        while (x > 0) {
            result = result * 10 + (x % 10);
            x /= 10;
        }

        return result;
    }
}
