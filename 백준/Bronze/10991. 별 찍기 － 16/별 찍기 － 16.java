import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                sb.append(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                if (j % 2 == 0) {
                    sb.append("*");
                }

                if (j % 2 == 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
