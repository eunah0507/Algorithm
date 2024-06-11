import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 세 정수의 평균은 (A+B+C)/3이다.
        // A와 B가 주어졌을 때, 가장 작은 정수 C를 구하라.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            int answer = 0;

            if (numA == 0 && numB == 0){
                break;
            }else{
                answer = numA - (numB - numA);
                sb.append(answer).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
