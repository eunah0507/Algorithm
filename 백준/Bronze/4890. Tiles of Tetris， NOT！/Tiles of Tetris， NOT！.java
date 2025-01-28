import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = "";

        while ((line = br.readLine()) != null) {
            String[] input = line.split(" ");
            int w = Integer.parseInt(input[0]);
            int h = Integer.parseInt(input[1]);

            // 종료 조건
            if (w == 0 && h == 0) break;

            // 최소공배수(LCM) 계산
            long gcd = gcd(w, h);
            long lcm = (long) w * h / gcd;

            // 필요한 타일 개수 계산
            long tiles = (lcm / w) * (lcm / h);
            sb.append(tiles).append("\n");
        }

        System.out.print(sb.toString());
    }

    // 최대공약수(GCD) 계산 (유클리드 알고리즘)
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
