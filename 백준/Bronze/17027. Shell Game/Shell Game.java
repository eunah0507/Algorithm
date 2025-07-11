import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Step {
        int a, b, g;
        Step(int a, int b, int g) {
            this.a = a;
            this.b = b;
            this.g = g;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Step[] steps = new Step[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            steps[i] = new Step(a, b, g);
        }

        int answer = 0;

        for (int start = 1; start <= 3; start++) {
            int pos = start;
            int score = 0;

            for (Step s : steps) {
                if (pos == s.a) pos = s.b;
                else if (pos == s.b) pos = s.a;

                if (pos == s.g) score++;
            }

            answer = Math.max(answer, score);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
