import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] max = new int[k];
        int[] maxCount = new int[k];
        int[] maxIdx = new int[k];
        Arrays.fill(maxIdx, -1);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                int v = Integer.parseInt(st.nextToken());
                if (v > max[j]) {
                    max[j] = v;
                    maxCount[j] = 1;
                    maxIdx[j] = i;
                } else if (v == max[j]) {
                    maxCount[j]++;
                }
            }
        }

        boolean[] ok = new boolean[n];
        for (int j = 0; j < k; j++) {
            if (maxCount[j] == 1) {
                ok[maxIdx[j]] = true;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (ok[i]) {
                ans++;
            }
        }

        sb.append(ans);
        System.out.print(sb);
    }
}