import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int winner = 0, maxNum = -1;

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) arr[j = j] = Integer.parseInt(st.nextToken());

            int best = 0;
            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int sum = arr[a] + arr[b] + arr[c];
                        best = Math.max(best, sum % 10);
                    }
                }
            }

            if (best >= maxNum) {
                maxNum = best;
                winner = i;
            }
        }

        System.out.println(winner);
    }
}
