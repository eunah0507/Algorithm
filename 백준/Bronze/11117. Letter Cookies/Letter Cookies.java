import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            String box = br.readLine();
            int[] boxCnt = new int[26];

            for (int i = 0; i < box.length(); i++) {
                boxCnt[box.charAt(i) - 'A']++;
            }

            int w = Integer.parseInt(br.readLine());

            for (int i = 0; i < w; i++) {
                String word = br.readLine();
                int[] wordCnt = new int[26];

                for (int j = 0; j < word.length(); j++) {
                    wordCnt[word.charAt(j) - 'A']++;
                }

                boolean possible = true;

                for (int j = 0; j < 26; j++) {
                    if (wordCnt[j] > boxCnt[j]) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        System.out.print(sb.toString());
    }
}