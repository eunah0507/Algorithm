import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 과녁 점수 : 1 / 2 / 4 / 8 / 16 / 32 / 64 / 128 / 256 / 512
        // A,B 둘 중 하나만 맞힌 표적은 = C도 맞혔다.
        // A,B 둘 다 맞혔거나 못맞힌 표정 = C도 안맞혔다.

        // A와 B가 맞힌 표적을 알아낸다. 그 후 C의 점수를 계산한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int scoreA = Integer.parseInt(st.nextToken());
        int scoreB = Integer.parseInt(st.nextToken());
        int scoreC = 0;

        // 무슨 과녁을 맞혔는지 알기 위해 boolean 배열을 만든다.
        boolean[] aa = new boolean[10];
        boolean[] bb = new boolean[10];

        // 10번 for문을 돌려서 score가 A,B의 점수보다 작으면 깎는다.
        // 그리고 해당 배열의 위치를 true로 바꾼다.
        for (int i = 9; i >= 0; i--) {
            int score = (int) Math.pow(2, i);

            if (score <= scoreA) {
                scoreA -= score;
                aa[i] = true;
            }

            if (score <= scoreB) {
                scoreB -= score;
                bb[i] = true;
            }

        }

        // 그 후, a와 b의 값이 다른 값만 scoreC에 더한다.
        for (int i = 0; i <= 9; i++) {
            if (aa[i] != bb[i]) {
                scoreC += (int) Math.pow(2, i);
            }
        }

        sb.append(scoreC);
        System.out.println(sb.toString());


    }
}
