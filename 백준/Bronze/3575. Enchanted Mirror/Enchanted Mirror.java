import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s1 = br.readLine();
        String s2 = br.readLine();
        String t1 = br.readLine();
        String t2 = br.readLine();

        int n = s1.length();
        int[][] cnt = new int[26][26];

        for (int i = 0; i < n; i++) {
            int a = s1.charAt(i) - 'A';
            int b = s2.charAt(n - 1 - i) - 'A';
            cnt[a][b]++;
        }

        for (int i = 0; i < n; i++) {
            int a = t1.charAt(i) - 'A';
            int b = t2.charAt(n - 1 - i) - 'A';
            cnt[a][b]--;
        }

        boolean ok = true;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (cnt[i][j] != 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                break;
            }
        }

        sb.append(ok ? "Yes" : "No");
        System.out.print(sb.toString());
    }
}
