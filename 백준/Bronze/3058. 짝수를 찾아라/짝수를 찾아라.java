import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 7개의 수가 주어질 때, 짝수를 찾아 합을 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int min = Integer.MAX_VALUE;
            sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                int number = Integer.parseInt(st.nextToken());

                if (number % 2 == 0) {

                    min = Math.min(min, number);
                    sum += number;
                }
            }

            sb.append(sum).append(" ").append(min).append("\n");
        }

        System.out.println(sb.toString());
    }
}
