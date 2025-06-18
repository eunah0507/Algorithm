import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        br.readLine();
        String num = br.readLine();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even > odd) {
            sb.append("0");
        } else if (odd > even) {
            sb.append("1");
        } else {
            sb.append("-1");
        }

        System.out.print(sb.toString());
    }
}
