import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 오차 0.01까지 허용 = 소수점 둘 째자리까지 반올림
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

       double sevenMoney = Double.parseDouble(st.nextToken());
       double sevenGram = Double.parseDouble(st.nextToken());
       double seven1000 = (1000 / sevenGram) * sevenMoney;
       double answer = seven1000;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());

            double money = Double.parseDouble(st.nextToken());
            double gram = Double.parseDouble(st.nextToken());
            double sam1000 = (1000 / gram) * money;

            answer = Math.min(answer, sam1000);
        }

        sb.append(String.format("%.2f", answer));
        System.out.println(sb.toString());
    }
}
