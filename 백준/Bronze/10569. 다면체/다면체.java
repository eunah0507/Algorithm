import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // (꼭짓점의 수) - (모서리의 수) + (면의 수) = 2
        // 면의 수 = 2 - 꼭짓점의 수 + 모서리의 수
        // 꼭짓점의 수와 모서리의 수만 주어질 때, 면의 수를 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            answer = 2 - numA + numB;

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
