import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 다섯개 줄에 네 개의 점수가 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int answer = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = 0;

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            int fourth = Integer.parseInt(st.nextToken());

            sum = first + second + third + fourth;
            answer = Math.max(answer, sum);

            if (answer == sum){
                index = i + 1;
            }

        }

        sb.append(index).append(" ").append(answer);
        System.out.println(sb.toString());
    }
}