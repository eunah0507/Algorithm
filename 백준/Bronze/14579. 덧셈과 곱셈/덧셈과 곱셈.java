import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int tmp = (a+1)*a/2;

        tmp %= 14579;
        int answer = tmp;

        for (int i = a+1; i <= b; i++){
            answer *= (tmp+=i);
            answer %= 14579;
        }

        sb.append(answer).append("\n");
        System.out.println(sb.toString());
    }
}
