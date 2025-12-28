import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine().trim();

        boolean[] isLeft = new boolean[26];
        String left = "qwertasdfgzxcvb";
        for (int i = 0; i < left.length(); i++) {
            isLeft[left.charAt(i) - 'a'] = true;
        }

        boolean ok = true;
        boolean prevLeft = isLeft[s.charAt(0) - 'a'];
        for (int i = 1; i < s.length(); i++) {
            boolean curLeft = isLeft[s.charAt(i) - 'a'];
            if (curLeft == prevLeft) {
                ok = false;
                break;
            }
            prevLeft = curLeft;
        }

        sb.append(ok ? "yes" : "no");
        System.out.print(sb.toString());
    }
}
