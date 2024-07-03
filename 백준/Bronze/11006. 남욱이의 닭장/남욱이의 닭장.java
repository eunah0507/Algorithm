import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 닭이 몇 마리인지 셀 수는 없지만? 닭의 다리는 다 셌다는?? 남욱이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int twoLeg = 0;
        int oneLeg = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int chickenLeg = Integer.parseInt(st.nextToken());
            int chicken = Integer.parseInt(st.nextToken());

            oneLeg = chickenLeg - chicken;
            twoLeg = chicken - oneLeg;

            sb.append(twoLeg).append(" ").append(oneLeg).append("\n");
        }
        System.out.println(sb.toString());
    }
}
