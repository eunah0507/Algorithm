import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 100 - T = a / 100 - T = b
        // 100 - (a+b) = c / (a*b) = d
        // (d/100) = q / (d%100) = r
        // 출력 첫 번째 줄에는 a,b,c,d,q,r 출력
        // 출력 두 번째 줄에는 테스트케이스의 곱셈 결과를 두 자릿수씩 출력(c, d)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        int a = 100 - numA;
        int b = 100 - numB;
        int c = 100 - (a + b);
        int d = (a * b);
        int q = (d / 100);
        int r = (d % 100);

        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(q).append(" ").append(r).append("\n");
        sb.append(c+q).append(" ").append(r);

        System.out.println(sb.toString());

    }
}