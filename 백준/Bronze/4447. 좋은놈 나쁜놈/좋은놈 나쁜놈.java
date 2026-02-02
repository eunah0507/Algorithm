import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            int gCount = 0;
            int bCount = 0;

            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                if (c == 'g' || c == 'G') {
                    gCount++;
                } else if (c == 'b' || c == 'B') {
                    bCount++;
                }
            }

            sb.append(name).append(" is ");
            if (gCount > bCount) {
                sb.append("GOOD");
            } else if (bCount > gCount) {
                sb.append("A BADDY");
            } else {
                sb.append("NEUTRAL");
            }
            if (i < n - 1) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
