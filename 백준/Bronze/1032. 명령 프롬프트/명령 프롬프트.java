import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            files[i] = br.readLine();
        }

        int length = files[0].length();

        for (int i = 0; i < length; i++) {
            char c = files[0].charAt(i);
            boolean isSame = true;

            for (int j = 1; j < n; j++) {
                if (files[j].charAt(i) != c) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }

        System.out.println(sb.toString());
    }
}
