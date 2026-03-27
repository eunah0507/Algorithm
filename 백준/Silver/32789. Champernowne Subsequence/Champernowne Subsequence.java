import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        int idx = 0;
        for (int k = 1; k <= n * 10; k++) {
            char[] num = Integer.toString(k).toCharArray();
            for (char c : num) {
                if (c == s[idx]) {
                    idx++;
                    if (idx == n) {
                        sb.append(k);
                        System.out.print(sb);
                        return;
                    }
                }
            }
        }
    }
}