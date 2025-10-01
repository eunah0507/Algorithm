import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        boolean hasFirst = false;
        long first = 0L;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                long v = Long.parseLong(st.nextToken());
                if (!hasFirst) {
                    first = v;
                    hasFirst = true;
                } else {
                    long x = first;
                    long y = v;

                    long answer = 0L;
                    for (int i = 0; i < 16; i++) {
                        answer |= ((y >> i) & 1L) << (2 * i);
                        answer |= ((x >> i) & 1L) << (2 * i + 1);
                    }

                    if (sb.length() > 0) sb.append('\n');
                    sb.append(answer);
                    hasFirst = false;
                }
            }
        }

        System.out.println(sb.toString());
    }
}