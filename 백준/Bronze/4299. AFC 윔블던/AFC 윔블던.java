import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 지수가 원섭이한테 장난치는 문제..
        // 지수가 장난쳐서 내가 대신 푸는....
        // 두 팀 점수의 합과 차가 주어지므로 두 팀의 경기 결과를 구하는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int scoreSum = Integer.parseInt(st.nextToken());
        int scoreMin = Integer.parseInt(st.nextToken());

        if (scoreSum < scoreMin) {
            sb.append(-1);
        } else {
            int scoreA = (scoreSum + scoreMin) / 2;
            int scoreB = (scoreSum - scoreMin) / 2;

            if (scoreA + scoreB == scoreSum && scoreA - scoreB == scoreMin) {
                sb.append(scoreA).append(" " + scoreB);
            } else {
                sb.append(-1);
            }
        }

        System.out.println(sb.toString());
    }
}