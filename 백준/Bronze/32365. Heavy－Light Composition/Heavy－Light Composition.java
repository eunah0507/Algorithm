import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstLine = br.readLine().split(" ");
        int t = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int[] freq = new int[26];
            for (int j = 0; j < n; j++) {
                freq[str.charAt(j) - 'a']++;
            }

            int[] type = new int[n];
            for (int j = 0; j < n; j++) {
                if (freq[str.charAt(j) - 'a'] > 1) type[j] = 1;
            }

            boolean valid = true;
            for (int j = 1; j < n; j++) {
                if (type[j] == type[j - 1]) {
                    valid = false;
                    break;
                }
            }

            sb.append(valid ? "T" : "F").append("\n");
        }

        System.out.print(sb.toString());
    }
}
