import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n + 1];
            int[] pos = new int[n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                pos[Integer.parseInt(st.nextToken())] = i;
            }

            int start = 1;
            int maxPos = 0;
            boolean first = true;

            for (int i = 1; i <= n; i++) {
                maxPos = Math.max(maxPos, pos[a[i]]);

                if (i == maxPos) {
                    if (!first) {
                        sb.append(' ');
                    }
                    sb.append(start).append('-').append(i);
                    start = i + 1;
                    maxPos = 0;
                    first = false;
                }
            }

            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}