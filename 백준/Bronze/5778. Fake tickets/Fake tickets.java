import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = "";

        while ((line = br.readLine()) != null) {
            String[] firstLine = line.split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);

            if (n == 0 && m == 0) break;

            String[] tickets = br.readLine().split(" ");
            Map<Integer, Integer> ticketCount = new HashMap<>();

            // 티켓 번호의 등장 횟수를 카운트
            for (String ticket : tickets) {
                int ticketNumber = Integer.parseInt(ticket);
                ticketCount.put(ticketNumber, ticketCount.getOrDefault(ticketNumber, 0) + 1);
            }

            int duplicateCount = 0;

            // 중복된 티켓의 개수를 계산
            for (int count : ticketCount.values()) {
                if (count > 1) {
                    duplicateCount++;
                }
            }

            sb.append(duplicateCount).append("\n");
        }

        System.out.print(sb.toString());
    }
}