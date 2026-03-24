import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long yp = Long.parseLong(st.nextToken());
            long lp = Long.parseLong(st.nextToken());
            long ys = Long.parseLong(st.nextToken());
            long ls = Long.parseLong(st.nextToken());

            long ans = yp * ys;

            if (ls < ys) {
                long liftAns;

                if (yp <= lp) {
                    liftAns = lp * ls;
                } else {
                    long a = (yp - lp) * ys + lp * ls;
                    liftAns = a;

                    if (2L * ls < ys) {
                        long b = (2L * yp - lp) * ls;
                        if (b < liftAns) {
                            liftAns = b;
                        }
                    }
                }

                if (liftAns < ans) {
                    ans = liftAns;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}