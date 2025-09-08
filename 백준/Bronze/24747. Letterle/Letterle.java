import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = br.readLine().trim();

        for (int round = 0; round < 7; round++) {
            String guess = br.readLine().trim();

            if (guess.equals(answer)) {
                sb.append("WINNER\n");
                break;
            }

            if (round == 6) {
                sb.append("LOSER\n");
                break;
            }

            int[] cnt = new int[26];
            char[] res = new char[5];

            for (int i = 0; i < 5; i++) {
                char a = answer.charAt(i);
                char g = guess.charAt(i);
                if (g == a) {
                    res[i] = 'G';
                } else {
                    cnt[a - 'A']++;
                }
            }

            for (int i = 0; i < 5; i++) {
                if (res[i] == 'G') continue;
                char g = guess.charAt(i);
                if (cnt[g - 'A'] > 0) {
                    res[i] = 'Y';
                    cnt[g - 'A']--;
                } else {
                    res[i] = 'X';
                }
            }

            sb.append(new String(res)).append('\n');
        }

        System.out.print(sb.toString());
    }
}
