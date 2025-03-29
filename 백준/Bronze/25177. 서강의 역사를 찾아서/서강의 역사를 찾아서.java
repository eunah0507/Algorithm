import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int maxLen = Math.max(n, m);

        int[] a = new int[maxLen];
        int[] b = new int[maxLen];

        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]);
        }

        line = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(line[i]);
        }

        int maxDiff = 0;
        for (int i = 0; i < maxLen; i++) {
            maxDiff = Math.max(maxDiff, b[i] - a[i]);
        }

        sb.append(maxDiff);
        System.out.println(sb.toString());
    }
}
