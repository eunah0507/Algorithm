import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 한 바구니에 사과 A, 오렌지 B개가 있다.
        // 다른 바구니에 사과 C, 오렌지 D개가 있다.
        // 한 바구니에서 과일 하나씩만 옮길 수 있을 때, 몇 번 움직여야 하는가

        // 테스트케이스를 입력받는다.
        // A+D와 B+C의 최소값을 구한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int answer = Math.min((A+D),(C+B));

        sb.append(answer);

        System.out.println(sb.toString());

    }
}