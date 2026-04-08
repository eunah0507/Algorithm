import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] broken = new boolean[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            broken[Integer.parseInt(st.nextToken())] = true;
        }

        int target = Integer.parseInt(br.readLine());
        int answer = 999;

        for (int i = 0; i <= 999; i++) {
            String s = String.valueOf(i);
            boolean possible = true;

            for (int j = 0; j < s.length(); j++) {
                if (broken[s.charAt(j) - '0']) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer = Math.min(answer, Math.abs(target - i));
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}