import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // 답으로 출력하 시간을 미리 선언한다.
        int earlyFinish = 0;

        for (int i = 0; i < num; i++) {
            // 교수님의 수업 시간을 입력 받는다.
            int time = Integer.parseInt(br.readLine());

            // 교수님이 지각할 수 있는 시간을 계산한다.
            // 최대시간은 수업시간을 초과할 수 없기 떄문이다.
            int okLate = time;

            while (true) {
                // 일찍 끝마쳐주는 시간은 지각한 시간의 제곱이다.
                earlyFinish = okLate * okLate;

                // 교수님의 지각 시간과, 일찍 끝내주는 시간의 합이 수업시간보다 클 경우 1 뺀다.
                // 같거나, 수업시간이 더 클 경우, break한다.
                if (okLate + earlyFinish <= time) {
                    break;
                } else {
                    // 합이 맞지 않을 경우 1 뺴고 다시 계산한다.
                    okLate--;
                }
            }

            sb.append(okLate).append("\n");
        }

        System.out.println(sb.toString());
    }
}
