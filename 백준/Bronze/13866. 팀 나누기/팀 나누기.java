import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int highScoreA = Math.max(Math.max(A, B), Math.max(C, D)) + Math.min(Math.min(A,B), Math.min(C,D));
        int highScoreB = Math.max(Math.min(A, B), Math.min(C, D)) + Math.min(Math.max(A, B), Math.max(C, D));

        int answer = Math.abs(highScoreA - highScoreB);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}