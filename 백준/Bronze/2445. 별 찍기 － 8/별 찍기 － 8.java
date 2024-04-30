import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 2*n-1번째 줄 까지 차례대로 별을 찍는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            // 별 찍기
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }

            // 공백 찍기
            for (int j = num-1; j > i; j--) {
                sb.append(" ");
                sb.append(" ");
            }

            // 별 찍기
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for (int i = 0; i < num-1; i++) {
            //별 찍기
            for (int j = num-1; j > i; j--) {
                sb.append("*");
            }

            // 공백 찍기
            for (int j = 0; j <= i; j++) {
                sb.append(" ");
                sb.append(" ");
            }

            // 별 찍기
            for (int j = num-1; j > i; j--) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}