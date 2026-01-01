import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int limit = 100000;
        boolean[] visited = new boolean[limit + 1];

        for (int i = 0; ; i++) {
            int pos = p1 + x * i;
            if (pos > limit) {
                break;
            }
            visited[pos] = true;
        }

        int ans = -1;
        for (int i = 0; ; i++) {
            int pos = p2 + y * i;
            if (pos > limit) {
                break;
            }
            if (visited[pos]) {
                ans = pos;
                break;
            }
        }

        sb.append(ans);
        System.out.print(sb);
    }
}
