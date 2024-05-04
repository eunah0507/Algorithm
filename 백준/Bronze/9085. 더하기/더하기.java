import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // for문을 티기고 티기고 티기는 문제~

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < num; i++) {
            // 답을 계속 출력해야하므로 초기화한다.
            answer = 0;
            int number = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < number; j++) {
                int natural = Integer.parseInt(st.nextToken());

                answer += natural;
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}