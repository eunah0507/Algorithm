import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.valueOf(st.nextToken());
            int m = Integer.valueOf(st.nextToken());
            if (n == 0 && m == 0) break;

            int[] taro = new int[n];
            int[] hanako = new int[m];
            int sumTaro = 0;
            int sumHanako = 0;

            for (int i = 0; i < n; i++) {
                taro[i] = Integer.valueOf(br.readLine());
                sumTaro += taro[i];
            }
            for (int i = 0; i < m; i++) {
                hanako[i] = Integer.valueOf(br.readLine());
                sumHanako += hanako[i];
            }

            int diff = sumTaro - sumHanako;
            if (diff % 2 != 0) {
                sb.append("-1\n");
                continue;
            }

            int target = diff / 2;
            HashSet<Integer> hanakoSet = new HashSet<>();
            for (int x : hanako) hanakoSet.add(x);

            int bestSum = Integer.MAX_VALUE;
            int bestA = -1, bestB = -1;

            for (int a : taro) {
                int b = a - target;
                if (hanakoSet.contains(b)) {
                    if (a + b < bestSum) {
                        bestSum = a + b;
                        bestA = a;
                        bestB = b;
                    }
                }
            }

            if (bestA == -1) sb.append("-1\n");
            else sb.append(bestA).append(' ').append(bestB).append('\n');
        }

        System.out.println(sb.toString());
    }
}
