import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // KOI빵집은 N*K개의 빵을 만들었다.
        // 순서대로 K개씩 묶어서 한 묶음으로 판매할 것이고, N개의 묶음이 있다.
        // 한 묶음에 크림이 없는 빵이 P개 이상이라면, 그 줄은 판매할 수 없다.
        // 첫 째 줄에 N,K,P가 주어진다.
        // 둘 째 줄에 크림 유뮤가 주어진다. 크림X = 0, 크림O = 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] noCream = new int[N * K];
        // 크림이 없는 빵의 갯수를 셀 변수
        int count = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            // 새로운 묶음 값을 받기 전, count를 초기화한다.
            count = 0;
            for (int j = 0; j < K; j++) {
                // 새로운 묶음 단위의 값을 받는다.
                noCream[j] = Integer.parseInt(st.nextToken());

                if (noCream[j] == 0) {
                    count++;
                }
            }

            // 크림이 없는 빵이 P개 이상 넘어가면 한 묶음을 뺀다.
            if (count >= P) {
                N--;
            }
        }

        sb.append(N);
        System.out.println(sb.toString());
    }
}