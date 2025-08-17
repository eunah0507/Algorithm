import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> counts = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) counts.add(f);
        }

        Collections.sort(counts, Collections.reverseOrder());

        int keep = 0;
        if (counts.size() >= 2) {
            keep = counts.get(0) + counts.get(1);
        } else if (counts.size() == 1) {
            keep = counts.get(0);
        }

        int result = s.length() - keep;
        System.out.println(result);
    }
}
