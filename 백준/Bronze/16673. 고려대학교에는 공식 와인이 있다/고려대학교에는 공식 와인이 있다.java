import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // n년차에는 Kn+Pn^2만큼의 와인을 구매한다.
        // 마지막 해에 산 와인의 수는 KC + PC^2다.
        // 1년차부터 c-1까지 for문을 돌려 구한다.
        // 마지막해는 다른 공식으로 구한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int answer = 0;

        for (int i = 1; i < c; i++) {
            answer += (k*i) + (p*i*i);
        }

        answer += (k*c) + (p*c*c);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
