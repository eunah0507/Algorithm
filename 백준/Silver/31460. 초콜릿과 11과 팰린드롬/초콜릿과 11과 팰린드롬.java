import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 짝수일때는 테스트케이스자리수 * 9
        // 홀수일때는 앞뒤로 1, 나머지는 2로 채운다
        // 단, 1일때는 -1 나오게 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 1) {
                sb.append(0);
            } else if (number % 2 == 0) {
                String str = Integer.toString(9).repeat(number);
                sb.append(str);
            } else if (number % 2 != 0) {
                String str = Integer.toString(1) + Integer.toString(2).repeat(number - 2) + Integer.toString(1);
                sb.append(str);
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}