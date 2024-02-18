import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // for문으로 풀자!
        // for문을 총 3번 돌린다.
        // 1. N! 만큼의 for문
        // 2. K! 만큼의 for문
        // 3. (N - K)! 만큼의 for문
        // 그걸 그냥 계산한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int nFac = 1;
        int kFac = 1;
        int nMinKFac = 1;

        for (int i = 1; i <= N; i++) {
            nFac *= i;
        }

        for (int i = 1; i <= K; i++) {
            kFac *= i;
        }

        for (int i = 1; i <= (N - K); i++) {
            nMinKFac *= i;
        }


        int answer = nFac / (kFac * nMinKFac);
        sb.append(answer);

        System.out.println(sb.toString());


    }
}