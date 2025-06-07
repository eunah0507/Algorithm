import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int t = 0; t < num; t++) {
            int numA = Integer.parseInt(br.readLine());
            int total = 0;

            for (int i = 0; i < numA; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                int max = Math.max(a, Math.max(b, c));
                if (max > 0) total += max;
            }

            sb.append(total).append("\n");
        }

        
        System.out.print(sb.toString());
    }
}
