import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        long answer = 1;

        for (int i = 0; i < 5; i++) {
            answer *= num - i;
        }

        for (int i = 0; i < 5; i++) {
            answer /= (i + 1);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
