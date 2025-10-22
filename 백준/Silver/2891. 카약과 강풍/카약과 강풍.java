import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        boolean[] broken = new boolean[N + 1];
        boolean[] reserve = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++) {
            int team = Integer.parseInt(st.nextToken());
            broken[team] = true;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int team = Integer.parseInt(st.nextToken());
            reserve[team] = true;
        }

        // 여분이 있으면서 자기 것이 부서졌으면 자기껄로 사용
        for (int i = 1; i <= N; i++) {
            if (broken[i] && reserve[i]) {
                broken[i] = false;
                reserve[i] = false;
            }
        }

        // 앞뒤 팀에게 빌리기 시도
        for (int i = 1; i <= N; i++) {
            if (broken[i]) {
                if (i > 1 && reserve[i - 1]) {
                    broken[i] = false;
                    reserve[i - 1] = false;
                } else if (i < N && reserve[i + 1]) {
                    broken[i] = false;
                    reserve[i + 1] = false;
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (broken[i]) cnt++;
        }

        sb.append(cnt);
        System.out.println(sb.toString());
    }
}
