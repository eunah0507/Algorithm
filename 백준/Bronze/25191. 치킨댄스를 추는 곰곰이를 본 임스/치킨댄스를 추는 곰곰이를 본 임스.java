import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // N개의 문제 후보, M개의 찬반 의견
        // M은 항상 홀수이며, 과반수를 넘어야 출제된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int answer = A/2 + B;
        if(answer > N) answer = N;
        sb.append(answer).append("\n");
        System.out.println(sb.toString());
    }
}