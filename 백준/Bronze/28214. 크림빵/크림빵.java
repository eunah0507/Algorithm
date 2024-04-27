import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] bread = new int[N * K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * K; i++) {
            bread[i] = Integer.parseInt(st.nextToken());
        }

        int result = N;
        for (int i = 0; i < N; i++) {
            int creamless = 0;
            for (int j = 0; j < K; j++) {
                if (bread[i * K + j] == 0) {
                    creamless++;
                }
            }
            if (creamless >= P) {
                result--;
            }
        }

        System.out.println(result);
    }
}
