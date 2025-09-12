import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int prev = first;
        int d = 0;

        for (int i = 2; i <= n; i++) {
            int cur = Integer.parseInt(st.nextToken());
            if (i == 2) d = cur - prev;
            prev = cur;
        }

        int answer = prev + d;

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
