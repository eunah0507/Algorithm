import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 크기가 N인 도미노 세트는 N 또는 점이 몇 개 찍혀있나?
        // 2 = 0 + 0 + 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 2 + 2 > 12

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sumUp = 0;
        int sumDown = 0;
        int totalSum = 0;

        for (int i = 0; i <= num; i++) {
            sumUp += i;
            for (int j = 0; j <= num; j++) {
                sumDown += j;
            }
        }

        totalSum = sumUp + sumDown;

        sb.append(totalSum);
        System.out.println(sb.toString());
    }
}
