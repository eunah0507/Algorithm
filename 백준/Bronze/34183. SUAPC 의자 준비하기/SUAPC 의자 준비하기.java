import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long need = 3L * n;
        long answer = 0;

        if (m < need) {
            long buy = need - m;
            answer = buy * a + b;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
