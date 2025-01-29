import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstLine = br.readLine().split(" ");
        // 주문 개수
        int n = Integer.parseInt(firstLine[0]);
        // 물탱크 용량
        int s = Integer.parseInt(firstLine[1]);

        // 현재 남아 있는 물의 양
        int waterRemaining = s;
        // 리필 횟수
        int refillCount = 0;

        for (int i = 0; i < n; i++) {
            String order = br.readLine();
            // 첫 번째 문자는 숫자 (샷 개수)
            int shots = order.charAt(0) - '0';
            // 라떼면 +1
            int waterNeeded = shots + (order.length() == 2 ? 1 : 0);

            // 물이 부족하면 리필 후 다시 사용
            if (waterRemaining < waterNeeded) {
                waterRemaining = s;
                refillCount++;
            }
            waterRemaining -= waterNeeded;
        }

        sb.append(refillCount).append("\n");
        System.out.print(sb.toString());
    }
}