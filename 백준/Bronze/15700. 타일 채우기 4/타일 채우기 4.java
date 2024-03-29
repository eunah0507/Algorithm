import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        long answer = (N*M) / 2;

        sb.append(answer);
        System.out.println(sb.toString());
    }
}