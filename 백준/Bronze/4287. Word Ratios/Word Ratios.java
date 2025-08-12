import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;

            String[] words = line.split(" ");
            String w1 = words[0];
            String w2 = words[1];
            String w3 = words[2];

            int len = w1.length();
            char[] result = new char[len];

            for (int i = 0; i < len; i++) {
                int diff = (w2.charAt(i) - w1.charAt(i) + 26) % 26;
                int newChar = (w3.charAt(i) - 'a' + diff) % 26;
                result[i] = (char) ('a' + newChar);
            }

            sb.append(w1).append(" ")
              .append(w2).append(" ")
              .append(w3).append(" ")
              .append(new String(result)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
