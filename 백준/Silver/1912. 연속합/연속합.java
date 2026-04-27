import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int max = sum;

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (sum + num < num) {
                sum = num;
            } else {
                sum += num;
            }

            if (max < sum) {
                max = sum;
            }
        }

        sb.append(max);

        System.out.print(sb.toString());
    }
}