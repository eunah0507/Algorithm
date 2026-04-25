import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long[] distances = new long[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long minPrice = Long.parseLong(st.nextToken());
        long answer = 0;

        for (int i = 0; i < n - 1; i++) {
            long price = Long.parseLong(st.nextToken());
            answer += minPrice * distances[i];

            if (price < minPrice) {
                minPrice = price;
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}