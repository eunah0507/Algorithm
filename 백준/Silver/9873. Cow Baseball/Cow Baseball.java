import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int d = arr[j] - arr[i];
                int leftValue = arr[j] + d;
                int rightValue = arr[j] + 2 * d;

                int left = lowerBound(arr, j + 1, n, leftValue);
                int right = upperBound(arr, j + 1, n, rightValue);

                count += right - left;
            }
        }

        sb.append(count);
        System.out.print(sb.toString());
    }

    private static int lowerBound(int[] arr, int left, int right, int target) {
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int upperBound(int[] arr, int left, int right, int target) {
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}