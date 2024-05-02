import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 할 일 없는 경근이가 나를 또 고생시키는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int yonsei = 0;
        int korea = 0;
        int yCount = 0;
        int kCount = 0;
        String answer = "";

        for (int i = 0; i < num; i++) {
            // yCount와 kCount를 초기화한다.
            yCount = 0;
            kCount = 0;
            for (int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                yonsei = Integer.parseInt(st.nextToken());
                korea = Integer.parseInt(st.nextToken());

                // 점수를 누적해준다.
                yCount+= yonsei;
                kCount+= korea;
            }

            // 누가 더 많이 이겼는지 Count를 비교해서 답을 출력한다.
            if (yCount > kCount) {
                answer = "Yonsei";
            } else if (yCount == kCount) {
                answer = "Draw";
            } else {
                answer = "Korea";
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
