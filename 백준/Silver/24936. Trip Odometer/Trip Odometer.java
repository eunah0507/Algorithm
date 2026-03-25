import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                count++;
            }
        }

        sb.append(count).append('\n');

        boolean first = true;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                if (!first) {
                    sb.append(' ');
                }
                sb.append(total - arr[i]);
                first = false;
            }
        }

        System.out.print(sb.toString());
    }
}