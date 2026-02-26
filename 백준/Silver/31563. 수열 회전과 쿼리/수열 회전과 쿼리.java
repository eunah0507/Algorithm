import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static class FastScanner {
        private final BufferedReader br;
        private final char[] buffer = new char[1 << 16];
        private int idx = 0;
        private int size = 0;

        FastScanner(BufferedReader br) {
            this.br = br;
        }

        private int readChar() throws IOException {
            if (idx >= size) {
                size = br.read(buffer);
                idx = 0;
                if (size <= 0) {
                    return -1;
                }
            }
            return buffer[idx++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = readChar();
            } while (c <= ' ' && c != -1);

            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = readChar();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readChar();
            }
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        FastScanner fs = new FastScanner(br);

        int n = fs.nextInt();
        int q = fs.nextInt();

        long[] prefix = new long[2 * n + 1];
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextLong();
        }
        for (int i = 0; i < 2 * n; i++) {
            prefix[i + 1] = prefix[i] + arr[i % n];
        }

        int start = 0; // current A1 is arr[start]
        for (int i = 0; i < q; i++) {
            int type = fs.nextInt();
            if (type == 1) {
                int k = fs.nextInt() % n;
                start -= k;
                if (start < 0) {
                    start += n;
                }
            } else if (type == 2) {
                int k = fs.nextInt() % n;
                start += k;
                if (start >= n) {
                    start -= n;
                }
            } else {
                int a = fs.nextInt();
                int b = fs.nextInt();
                int l = start + (a - 1);
                int r = start + (b - 1);
                long ans = prefix[r + 1] - prefix[l];
                sb.append(ans).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}