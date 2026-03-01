import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();
        boolean[] used = new boolean[n];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 'P') {
                continue;
            }

            int l = Math.max(0, i - k);
            int r = Math.min(n - 1, i + k);

            for (int j = l; j <= r; j++) {
                if (arr[j] == 'H' && !used[j]) {
                    used[j] = true;
                    ans++;
                    break;
                }
            }
        }

        sb.append(ans);
        System.out.print(sb.toString());
    }
}