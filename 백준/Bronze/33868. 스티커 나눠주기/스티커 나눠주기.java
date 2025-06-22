import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int maxTime = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            maxTime = Math.max(maxTime, t);
            minLength = Math.min(minLength, b);
        }

        int product = maxTime * minLength;
        int remainder = product % 7;
        int result = remainder == 0 ? 1 : remainder + 1;

        sb.append(result).append("\n");
        System.out.print(sb.toString());
    }
}
