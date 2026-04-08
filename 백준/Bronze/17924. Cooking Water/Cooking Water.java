import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int left = 0;
        int right = 1000;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            left = Math.max(left, a);
            right = Math.min(right, b);
        }

        if (left <= right) {
            sb.append("gunilla has a point");
        } else {
            sb.append("edward is right");
        }

        System.out.print(sb.toString());
    }
}