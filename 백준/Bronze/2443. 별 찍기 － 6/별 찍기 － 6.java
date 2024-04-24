import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 2*n-1 > 2*n-3 > 2*n-5 > 1
        // *이 안찍히는 공간은 띄어쓰기를 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*(num-i)-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}