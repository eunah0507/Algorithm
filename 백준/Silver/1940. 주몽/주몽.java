import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int l = 0;
        int r = n - 1;
        int cnt = 0;

        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == m) {
                cnt++;
                l++;
                r--;
            } else if (sum < m) {
                l++;
            } else {
                r--;
            }
        }

        sb.append(cnt);
        System.out.println(sb.toString());
    }
}
