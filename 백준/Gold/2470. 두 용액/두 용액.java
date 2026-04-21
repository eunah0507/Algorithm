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

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        long min = Long.MAX_VALUE;
        int a = arr[left];
        int b = arr[right];

        while (left < right) {
            long sum = (long) arr[left] + arr[right];
            long abs = Math.abs(sum);

            if (abs < min) {
                min = abs;
                a = arr[left];
                b = arr[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        sb.append(a).append(' ').append(b);
        System.out.print(sb.toString());
    }
}