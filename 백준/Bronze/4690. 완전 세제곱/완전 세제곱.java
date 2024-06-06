import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // a가 100 이하이므로 b,c,d도 100 이하다.
        // 그러므로 3중 for문을 돌려 b,c,d의 세제곱을 더해 a 3제곱과 맞는지 비교한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = 0;

        for (int i = 2; i <= 100; i++) {
            a = (int) Math.pow(i, 3);

            for (int b = 2; b <= i; b++) {
                for (int c = b; c <= i; c++) {
                    for (int d = c; d <= i; d++) {

                        int sum = (int) Math.pow(b, 3) + (int) Math.pow(c, 3) + (int) Math.pow(d, 3);

                        if (a == sum){
                            sb.append("Cube = ").append(i).append(", Triple = (").append(b).append(",").append(c).append(",").append(d).append(")").append("\n");
                        }
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}
