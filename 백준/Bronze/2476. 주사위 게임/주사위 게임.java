import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 같은 숫자 3개 : 10,000원 + (숫자) * 1,000
        // 같은 숫자 2개 : 1,000 + (숫자) * 100
        // 다 다른 눈 : 그 중 가장 큰 수 * 100

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // 주사위를 3번 돌린다고 했으니 해당 배열을 3크기만큼 만든다.
        Integer[] dice = new Integer[3];
        // 상금을 비교할 변수 2개를 만든다.
        int max = 0;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // max를 다시 초기화해준다.
            max = 0;

            // dice[]를 입력받는다.
            for (int j = 0; j < 3; j++) {
                dice[j] = Integer.parseInt(st.nextToken());
            }
            // 조건문에 따라 3개 맞을 때, 2개 맞을 때, 각각 다를 때 상금을 나눈다.
            if (dice[0] == dice[1] && dice[1] == dice[2]) {
                max = 10000 + (dice[0] * 1000);
            } else if ((dice[0] == dice[1] && dice[1] != dice[2])) {
                max = 1000 + (dice[0] * 100);
            } else if (dice[0] == dice[2] && dice[0] != dice[1]) {
                max = 1000 + (dice[0] * 100);
            } else if (dice[1] == dice[2] && dice[1] != dice[0]) {
                max = 1000 + (dice[1] * 100);
            } else {
                // 3개의 주사위가 다 다르게 나올 때에는 정렬한 뒤, 0번째 값으로 구한다.
                Arrays.sort(dice, Collections.reverseOrder());
                max = dice[0] * 100;
            }

            // max와 anwer를 비교해서 더 높은 값을 answer에 넣어준다.
            answer = Math.max(max, answer);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
