import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String s = br.readLine();
            int a = 0, b = 0;
            int i = 0;

            while (i < s.length() && s.charAt(i) == '!') {
                a++;
                i++;
            }

            int n = s.charAt(i) - '0';
            i++;

            while (i < s.length() && s.charAt(i) == '!') {
                b++;
                i++;
            }

            for (int j = 0; j < b; j++) {
                n = 1;
            }

            for (int j = 0; j < a; j++) {
                n = (n == 0) ? 1 : 0;
            }

            sb.append(n).append("\n");
        }

        System.out.println(sb.toString());
    }
}
