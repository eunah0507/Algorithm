import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[n];
        int[] k = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int d = q - p;

        if (d == 0) {
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    sb.append("NO");
                    System.out.println(sb.toString());
                    return;
                }
                k[i] = 0;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int diff = a[i] - b[i];
                if (diff % d != 0) {
                    sb.append("NO");
                    System.out.println(sb.toString());
                    return;
                }
                int ki = diff / d;
                if (ki < 0 || ki > 10000) {
                    sb.append("NO");
                    System.out.println(sb.toString());
                    return;
                }
                k[i] = ki;
            }
        }

        sb.append("YES\n");
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(k[i]);
        }

        System.out.println(sb.toString());
    }
}
