import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 반원 + 직사각형 + 반원 구조이므로
        // 원의 둘레 + 직사각형 둘레 구하는 문제
        // 원 둘레 구하는 공식 : 2 * 파이 * 반지름
        // 직사각형 세로는 구할 필요 없다.
        // 직사각형 가로 * 2 + 원 둘레

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double answer = (d1 * 2) + (2 * 3.141592 * d2);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}