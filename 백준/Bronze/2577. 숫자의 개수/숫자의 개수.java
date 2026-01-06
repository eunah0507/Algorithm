import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;

        int[] cnt = new int[10];

        while (result > 0) {
            cnt[result % 10]++;
            result /= 10;
        }

        for (int i = 0; i < 10; i++) {
            sb.append(cnt[i]).append('\n');
        }

        System.out.print(sb);
    }
}
