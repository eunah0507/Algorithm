import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 별 N개부터 1개까지 찍기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            // 공백 찍기
            // 0부터 n-1까지 늘어나야한다
            for (int j = 0; j < i-1; j++) {
                sb.append(" ");
            }

            // 별 찍기
            // num부터 1까지 줄어야한다
            for (int j = num-i+1; j > 0; j--) {
                sb.append("*");
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}