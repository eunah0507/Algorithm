import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        // 테스트케이스 T개가 주어진다.
        // 그 다음 줄은 빈 줄이다.
        // 학생 수 N과 몇 개의 사탕을 가지고 왔는지 주어진다.
        // 모두에게 같은 수의 사탕을 나눠줄 수 있는지?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long num = Long.parseLong(br.readLine());

        for (int i = 0; i < num; i++) {
            String blank = br.readLine();
            int student = Integer.parseInt(br.readLine());
            BigInteger totalCandy = BigInteger.valueOf(0);

            for (int j = 0; j < student; j++) {
                totalCandy = totalCandy.add(new BigInteger(br.readLine()));
            }

            String shareCandy = String.valueOf(totalCandy.remainder(BigInteger.valueOf(student)));

            if (shareCandy.equals("0")){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }

        }

        System.out.println(sb.toString());
    }
}
