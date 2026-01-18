import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        int[] prefixA = new int[n + 1];
        int[] prefixN = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixA[i + 1] = prefixA[i] + (s.charAt(i) == 'A' ? 1 : 0);
            prefixN[i + 1] = prefixN[i] + (s.charAt(i) == 'N' ? 1 : 0);
        }

        long answer = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != 'A') {
                continue;
            }
            for (int j = i + 2; j < n; j++) {
                if (s.charAt(j) != 'A') {
                    continue;
                }

                int countA = prefixA[j + 1] - prefixA[i];
                if (countA != 2) {
                    continue;
                }

                int countN = prefixN[j + 1] - prefixN[i];
                if (countN == 1) {
                    answer++;
                }
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}
