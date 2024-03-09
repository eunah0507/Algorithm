import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // W / L 의 값과 H / L의 값을 곱해준다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        long answer = (W / L) * (H / L);

        if (answer >= N) {
            answer = N;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}