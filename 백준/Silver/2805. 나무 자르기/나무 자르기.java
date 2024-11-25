import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] trees = new int[n];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());

            if (trees[i] > max) {
                max = trees[i];
            }
        }

        int left = 0;
        int right = max;
        int answer = 0;

        while (left <= right) {
            int height = (left + right) / 2;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                if (trees[i] > height) {
                    sum += (trees[i] - height);
                }
            }

            if (sum >= m) {
                answer = height;
                left = height + 1;
            } else {
                right = height - 1;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
