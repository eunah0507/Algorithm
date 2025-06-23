import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x1 = 1, y1 = 0;
        int x2 = 0, y2 = 1;
        int aa = a, mm = m;

        while (mm != 0) {
            int q = aa / mm;
            int r = aa % mm;
            int tx = x1 - q * x2;
            int ty = y1 - q * y2;
            aa = mm;
            mm = r;
            x1 = x2;
            y1 = y2;
            x2 = tx;
            y2 = ty;
        }

        int result = (x1 % m + m) % m;
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.println(sb.toString());
    }
}
