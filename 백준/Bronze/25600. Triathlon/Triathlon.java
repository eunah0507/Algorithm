import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 참가자 수 N, 각 줄에 a,d,g가 주어진다.
        // 점수 계산은 a * (d+g)로 하되, a = (d + g)일 경우, 원래 얻을 점수의 두 배로 계산

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int people = Integer.parseInt(br.readLine());
        Integer [] score = new Integer[people];

        for (int i = 0; i < people; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            if (a == (d+g)){
                score[i] = 2 * (a * (d + g));
            }else{
                score[i] = a * (d+g);
            }
        }

        Arrays.sort(score, Collections.reverseOrder());

        sb.append(score[0]);
        System.out.println(sb.toString());
    }
}