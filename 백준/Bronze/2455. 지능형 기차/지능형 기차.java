import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 타고 내리는 사람을 자동으로 인식하는 기차
        // 4개의 정차역에서 타거나 내릴 때, 기차에서 가장 사람이 많을 때의 수를 구하라
        // 기차에 탈 때엔, 내릴 사람이 모두 내린 뒤 탑승한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int current = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int offTrain = Integer.parseInt(st.nextToken());
            int onTrain = Integer.parseInt(st.nextToken());
            // 타고 바로 안내린 사람들이 있다.
            int remain = onTrain - offTrain;

            // 현재 인원에 안내린 사람들을 중첩한다.
            current += remain;
            answer = Math.max(current, answer);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}