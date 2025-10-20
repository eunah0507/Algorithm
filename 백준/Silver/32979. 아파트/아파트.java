import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < 2 * N; i++) {
            dq.addLast(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int t = 0; t < T; t++) {
            int b = Integer.parseInt(st.nextToken());
            int size = dq.size();
            int move = (b - 1) % size;

            for (int i = 0; i < move; i++) {
                dq.addLast(dq.pollFirst());
            }

            int loser = dq.peekFirst();
            sb.append(loser).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
