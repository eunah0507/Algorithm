import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += Integer.parseInt(br.readLine());
        }

        total += 300;

        if (total <= 1800) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb.toString());
    }
}
