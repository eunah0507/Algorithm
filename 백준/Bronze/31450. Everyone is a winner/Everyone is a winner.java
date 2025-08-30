import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long m = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        String answer = (m % k == 0) ? "Yes" : "No";

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
