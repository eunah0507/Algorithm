import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String w = br.readLine().trim();
        String s = br.readLine().trim();

        boolean[] used = new boolean[26];
        List<Character> key = new ArrayList<>();

        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (!used[ch - 'A']) {
                used[ch - 'A'] = true;
                key.add(ch);
            }
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (!used[c - 'A']) {
                key.add(c);
            }
        }

        char[] map = new char[26];
        for (int i = 0; i < 26; i++) {
            map[i] = key.get(i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(map[ch - 'A']);
        }

        System.out.println(sb.toString());
    }
}
