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
        int m = Integer.parseInt(st.nextToken());

        int[] fish = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            fish[i] = Integer.parseInt(st.nextToken());
        }

        int[][] buyers = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            buyers[i][0] = Integer.parseInt(st.nextToken());
            buyers[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fish);
        Arrays.sort(buyers, (a, b) -> b[1] - a[1]);

        long answer = 0L;
        int fishIdx = n - 1;

        for (int i = 0; i < m && fishIdx >= 0; i++) {
            int cnt = buyers[i][0];
            int price = buyers[i][1];

            while (cnt > 0 && fishIdx >= 0) {
                answer += (long) fish[fishIdx] * price;
                fishIdx--;
                cnt--;
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}