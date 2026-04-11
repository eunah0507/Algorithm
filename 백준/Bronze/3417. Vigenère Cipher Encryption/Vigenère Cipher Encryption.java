import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String key = br.readLine();
            if (key.equals("0")) {
                break;
            }
            String plain = br.readLine();

            int kLen = key.length();
            int pLen = plain.length();

            for (int i = 0; i < pLen; i++) {
                int p = plain.charAt(i) - 'A';
                int k = key.charAt(i % kLen) - 'A' + 1;
                int c = (p + k) % 26;
                sb.append((char) (c + 'A'));
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}