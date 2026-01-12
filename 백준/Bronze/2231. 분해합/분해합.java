import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < num; i++) {
            int tmp = i;
            int sum = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (sum == num) {
                answer = i;
                break;
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}
