import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int len = Integer.parseInt(input[1]);
        String s = br.readLine();

        k %= 26;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char) ('A' + (ch - 'A' + k) % 26);
                sb.append(shifted);
            } else if (ch >= 'a' && ch <= 'z') {
                char shifted = (char) ('a' + (ch - 'a' + k) % 26);
                sb.append(shifted);
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
