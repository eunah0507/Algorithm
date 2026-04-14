import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> dict = new HashSet<>();

        for (int i = 0; i < n; i++) {
            dict.add(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String word = br.readLine();

            if (dict.contains(word)) {
                sb.append(1).append('\n');
                continue;
            }

            boolean isConcat = false;

            for (int j = 1; j < word.length(); j++) {
                String left = word.substring(0, j);
                String right = word.substring(j);

                if (dict.contains(left) && dict.contains(right)) {
                    isConcat = true;
                    break;
                }
            }

            if (isConcat) sb.append(2).append('\n');
            else sb.append(0).append('\n');
        }

        System.out.print(sb.toString());
    }
}