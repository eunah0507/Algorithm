import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 상근이가 10권의 책을 구입했다.
        // 10권 중, 9권의 가격만 알 수 있을 때 남은 한 권의 가격을 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int totalCost = Integer.parseInt(br.readLine());
        int answer = totalCost;

        for (int i = 0; i < 9; i++) {
            int book = Integer.parseInt(br.readLine());

            answer -= book;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
