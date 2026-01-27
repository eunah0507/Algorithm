import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else {
                count[c - 'A']++;
            }
        }

        int max = 0;
        int index = -1;
        boolean duplicate = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
                duplicate = false;
            } else if (count[i] == max) {
                duplicate = true;
            }
        }

        if (duplicate) {
            sb.append("?");
        } else {
            sb.append((char) ('A' + index));
        }

        System.out.print(sb.toString());
    }
}
