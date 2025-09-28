import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int t = 0; t < num; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int current = arr[0];
            int maxSum = arr[0];

            for (int i = 1; i < N; i++) {
                current = Math.max(arr[i], current + arr[i]);
                maxSum = Math.max(maxSum, current);
            }

            sb.append(maxSum).append("\n");
        }

        System.out.print(sb.toString());
    }
}