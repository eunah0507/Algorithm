import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());
            int next = sum + x;

            int curDiff = Math.abs(100 - sum);
            int nextDiff = Math.abs(100 - next);

            if (nextDiff < curDiff) {
                sum = next;
            } else if (nextDiff == curDiff) {
                sum = next;
            } else {
                break;
            }
        }

        sb.append(sum);
        System.out.print(sb.toString());
    }
}
