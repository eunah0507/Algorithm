import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] first = new int[n + 1];
        int[] second = new int[n + 1];

        Arrays.fill(first, -1);

        for (int i = 1; i <= 2 * n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (first[x] == -1) {
                first[x] = i;
            } else {
                second[x] = i;
            }
        }

        int answer = 0;
        for (int k = 1; k <= n; k++) {
            int diff = second[k] - first[k] - 1;
            if (diff > answer) answer = diff;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
