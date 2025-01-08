import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int max = 0;
            for (int i = 0; i < 3; i++) {
                int cur = Integer.parseInt(st.nextToken());
                sum += cur;
                max = Math.max(max, cur);
            }
            sb.append(1l*max*max+1l*(sum-max)*(sum-max)).append('\n');
        }

        System.out.println(sb.toString());
    }
}
