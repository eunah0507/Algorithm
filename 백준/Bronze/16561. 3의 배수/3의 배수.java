import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int target = Integer.parseInt(br.readLine()) / 3;
        int answer = 0;

        for (int i = 1; i <= target; i++) {
            for (int j = 1; j <= target - i; j++) {
                if (target - i - j > 0) {
                    answer += 1;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
