import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // T개 > 자동차가격 S > 옵션 개수 n > q는 개수, p는 가격

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int totalCost = 0;

        for (int i = 0; i < num; i++) {
            int carCost = Integer.parseInt(br.readLine());
            int option = Integer.parseInt(br.readLine());
            totalCost = 0;

            for (int j = 0; j < option; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());

                totalCost += q * p;
            }

            totalCost += carCost;
            sb.append(totalCost).append("\n");
        }
        System.out.println(sb.toString());
    }
}