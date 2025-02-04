import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            int[] numA = new int[26];
            int[] numB = new int[26];

            for (char c : br.readLine().toCharArray()) {
                int cur = c - 'a';
                if (cur >= 0) numA[cur]++;
            }
            for (char c : br.readLine().toCharArray()) {
                int cur = c - 'a';
                if (cur >= 0) numB[cur]++;
            }

            int result = 0;
            for (int j = 0; j < 26; j++) {
                result += Math.abs(numA[j] - numB[j]);
            }

            sb.append("Case #").append(i).append(": ").append(result).append("\n");
        }

        System.out.println(sb.toString());
    }
}