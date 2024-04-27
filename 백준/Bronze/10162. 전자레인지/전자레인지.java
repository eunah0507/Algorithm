import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // A = 5분(300초), B = 1분(60초), C = 10초
        // T초가 주어지면, 버튼을 최소로 눌러 맞게끔 한다.
        // 각 버튼을 몇 번 누르는지 각각 출력한다.
        // 만약 딱 맞아 떨어지지 않는다면 -1을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int second = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int C = 0;
        int answer = 0;

        while (true) {
            if (second == 0) {
                break;
            } else {
                if (second >= 300) {
                    second -= 300;
                    A++;
                    continue;
                } else if (second >= 60) {
                    second -= 60;
                    B++;
                    continue;
                } else if (second >= 10) {
                    second -= 10;
                    C++;
                    continue;
                }
            }

            if (second < 10) {
                answer = -1;
                break;
            }
        }

        if (answer == 0) {
            sb.append(A).append(" ").append(B).append(" ").append(C);
        } else {
            sb.append(-1);
        }

        System.out.println(sb.toString());
    }
}