import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {

            int news = Integer.parseInt(st.nextToken());

            answer = news - (L * K);
            sb.append(answer).append(" ");
        }

        System.out.println(sb.toString());
    }
}