import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            br.readLine();
            String s = br.readLine();

            int state = 0;
            boolean ok = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (state == 0) {
                    if (c == 'M') {
                        state = 1;
                    } else {
                        ok = false;
                        break;
                    }
                } else if (state == 1) {
                    if (c == 'I') {
                        state = 2;
                    } else {
                        ok = false;
                        break;
                    }
                } else if (state == 2) {
                    if (c == 'T') {
                        state = 3;
                    } else {
                        ok = false;
                        break;
                    }
                } else {
                    if (c == 'I') {
                        state = 2;
                    } else if (c == 'M') {
                        state = 1;
                    } else {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok && state == 3) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}