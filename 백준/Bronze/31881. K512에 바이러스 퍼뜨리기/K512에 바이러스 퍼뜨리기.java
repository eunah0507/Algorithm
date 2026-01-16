import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        boolean[] infected = new boolean[n + 1];
        int infectedCount = 0;

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int x = Integer.parseInt(st.nextToken());
                if (!infected[x]) {
                    infected[x] = true;
                    infectedCount++;
                }
            } else if (type == 2) {
                int x = Integer.parseInt(st.nextToken());
                if (infected[x]) {
                    infected[x] = false;
                    infectedCount--;
                }
            } else {
                sb.append(n - infectedCount).append('\n');
            }
        }

        System.out.print(sb);
    }
}
