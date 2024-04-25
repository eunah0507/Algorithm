import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 1, 3, 5, 2*n-1개의 별을 찍는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                sb.append(" ");
            }

            for (int j = 0; j < (2*i)-1; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}