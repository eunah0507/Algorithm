import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // for문을 티기고 티기고 티기는 문제~

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            answer += num;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}