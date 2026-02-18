import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {

    private static class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
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
                c = readByte();
            } while (c <= ' ');

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int[] deg = new int[n + 2];

        for (int i = 0; i < n; i++) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            deg[a]++;
            deg[b]++;
        }

        int maxDeg = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (deg[i] > maxDeg) {
                maxDeg = deg[i];
            }
        }

        int ans = n - maxDeg;
        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        System.out.print(sb.toString());
    }
}
