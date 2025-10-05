import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] M = new int[11];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 11; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            double L = Double.parseDouble(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            if (S >= 17 && L >= 2.0) {
                total += M[B];
            }
        }

        sb.append(total);
        System.out.println(sb.toString());
    }
}
