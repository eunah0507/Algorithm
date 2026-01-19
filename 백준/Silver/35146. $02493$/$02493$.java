import java.io.*;
import java.util.*;

public class Main {

    private static class FastScanner {
        private final Reader in;
        private final char[] buffer = new char[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private FastScanner(Reader in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= 32);

            int val = 0;
            while (c > 32) {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        FastScanner fs = new FastScanner(br);

        int t = fs.nextInt();
        for (int i = 0; i < t; i++) {
            int x = fs.nextInt();
            sb.append(1).append(' ').append(x).append(' ').append(10).append(' ').append(10).append('\n');
        }

        System.out.print(sb.toString());
    }
}
