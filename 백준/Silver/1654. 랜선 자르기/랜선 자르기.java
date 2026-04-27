import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Long.parseLong(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }

            if (count >= n) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}