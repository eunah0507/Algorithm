import java.io.BufferedInputStream;

public class Main {
    static final BufferedInputStream in = new BufferedInputStream(System.in);
    static final byte[] buffer = new byte[1 << 16];
    static int ptr = 0;
    static int len = 0;

    static int read() throws Exception {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) {
                return -1;
            }
        }
        return buffer[ptr++];
    }

    static int nextInt() throws Exception {
        int c = read();
        while (c <= 32) {
            c = read();
        }

        int num = 0;
        while (c > 32) {
            num = num * 10 + (c - '0');
            c = read();
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        int n = nextInt();
        int p = nextInt();
        int c = nextInt();

        int[] cnt = new int[p + 1];
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            cnt[x]++;
        }

        int left = 1;
        int sum = 0;
        int max = 0;

        for (int right = 1; right <= p - 1; right++) {
            sum += cnt[right];

            while (sum > c) {
                sum -= cnt[left];
                left++;
            }

            int len = right - left + 1;
            if (len > max) {
                max = len;
            }
        }

        sb.append(max);
        System.out.print(sb.toString());
    }
}